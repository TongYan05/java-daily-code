/**
 * =====================================================================
 *  LESSON 16 — SEGMENT TREE (basic level)
 * =====================================================================
 *
 * WHAT IS IT: a binary tree where every node represents an INTERVAL
 * (a range) of the array, storing an AGGREGATE of that range
 * (sum / min / max). It answers RANGE QUERIES fast.
 *
 * The problem it solves:
 *   "What is the sum of a[3..7]?" — with prefix sums you can't
 *   handle UPDATES; with a plain loop each query is O(n).
 *   Segment tree: query O(log n) AND update O(log n).
 *
 *            [0..5] sum=21                 array: [2, 1, 5, 3, 4, 6]
 *           /       \
 *      [0..2]=8     [3..5]=13
 *      /     \       /     \
 *   [0..1]=3 [2]=5 [3..4]=7 [5]=6
 *   /   \          /   \
 * [0]=2 [1]=1    [3]=3 [4]=4
 *
 *   build tree : O(n)
 *   range query: O(log n)   (visits at most ~2*log n nodes)
 *   point update: O(log n)  (one root->leaf path)
 *
 * ARRAY REPRESENTATION (like a heap): node i has children 2i+1, 2i+2.
 * We allocate 4*n slots — always enough.
 */
public class Lesson16_SegmentTree {

    static class SegmentTree {
        private final int[] tree;   // node i stores the SUM of its interval
        private final int n;

        SegmentTree(int[] a) {
            n = a.length;
            tree = new int[4 * n];
            build(a, 1, 0, n - 1);
        }

        /** BUILD O(n): split interval in half until single elements. */
        private void build(int[] a, int node, int lo, int hi) {
            if (lo == hi) {                        // leaf = single element
                tree[node] = a[lo];
                return;
            }
            int mid = (lo + hi) / 2;
            build(a, node * 2, lo, mid);           // left child  = left half
            build(a, node * 2 + 1, mid + 1, hi);   // right child = right half
            tree[node] = tree[node * 2] + tree[node * 2 + 1];  // combine
        }

        /** RANGE SUM QUERY O(log n):
         *  three situations per visited node:
         *    1. node interval fully INSIDE  query -> take its stored sum
         *    2. node interval fully OUTSIDE query -> contribute 0
         *    3. partial overlap -> recurse into both children          */
        int query(int l, int r) { return query(1, 0, n - 1, l, r); }
        private int query(int node, int lo, int hi, int l, int r) {
            if (r < lo || hi < l) return 0;              // case 2: no overlap
            if (l <= lo && hi <= r) return tree[node];   // case 1: fully covered
            int mid = (lo + hi) / 2;                     // case 3: split
            return query(node * 2, lo, mid, l, r)
                 + query(node * 2 + 1, mid + 1, hi, l, r);
        }

        /** POINT UPDATE O(log n): change a[i] by delta, fix every
         *  ancestor on the single path from root to that leaf. */
        void update(int index, int delta) { update(1, 0, n - 1, index, delta); }
        private void update(int node, int lo, int hi, int index, int delta) {
            if (lo == hi) { tree[node] += delta; return; }   // the leaf itself
            int mid = (lo + hi) / 2;
            if (index <= mid) update(node * 2, lo, mid, index, delta);
            else              update(node * 2 + 1, mid + 1, hi, index, delta);
            tree[node] = tree[node * 2] + tree[node * 2 + 1]; // recompute on the way up
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 1, 5, 3, 4, 6};
        SegmentTree st = new SegmentTree(a);

        System.out.println("array = [2, 1, 5, 3, 4, 6]");
        System.out.println("sum(1..4)      = " + st.query(1, 4));   // 1+5+3+4 = 13
        System.out.println("sum(0..5)      = " + st.query(0, 5));   // 21
        System.out.println("sum(2..2)      = " + st.query(2, 2));   // 5

        st.update(2, 10);    // a[2]: 5 -> 15   (only O(log n) nodes touched)
        System.out.println("\nafter a[2] += 10:");
        System.out.println("sum(1..4)      = " + st.query(1, 4));   // 23
        System.out.println("sum(2..2)      = " + st.query(2, 2));   // 15

        System.out.println("\nWhy not just use a plain loop per query?");
        System.out.println("  loop query = O(n); after update still O(n).");
        System.out.println("  segment tree = O(log n) query AND O(log n) update.");
        System.out.println("  Same idea works for range MIN / MAX (combine with Math.min/max).");
    }
}
