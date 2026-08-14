import java.util.Arrays;

/**
 * =====================================================================
 *  LESSON 13 — HEAP (Min-Heap)
 * =====================================================================
 *
 * A heap is a COMPLETE binary tree (all levels full except the last,
 * which fills left-to-right) that satisfies the HEAP PROPERTY:
 *
 *   MIN-HEAP: parent <= children   -> root is always the MINIMUM
 *   MAX-HEAP: parent >= children   -> root is always the MAXIMUM
 *
 * We store it in a plain ARRAY using index math (no pointers!):
 *   parent(i) = (i - 1) / 2
 *   left(i)   = 2*i + 1
 *   right(i)  = 2*i + 2
 *
 * Example min-heap array [2, 5, 3, 9, 7, 4]:
 *            2
 *          /   \
 *         5     3
 *        / \   /
 *       9   7 4
 *   NOTE: a heap is NOT fully sorted — only parent vs child order
 *   is guaranteed (5 < 9,7 but 5 vs 3 is unrelated).
 *
 * COMPLEXITY:
 *   peek root   O(1)       it is just array[0]
 *   insert      O(log n)   add at end, then SIFT UP
 *   remove root O(log n)   swap last to root, then SIFT DOWN
 *   build heap  O(n)       sift-down from the last parent up
 */
public class Lesson13_Heap {

    static class MinHeap {
        private int[] a = new int[8];
        private int size = 0;

        int size()  { return size; }
        boolean isEmpty() { return size == 0; }
        int peek()  {                       // O(1): min is always at index 0
            if (size == 0) throw new java.util.NoSuchElementException();
            return a[0];
        }

        /** O(log n): place at the END, then bubble UP while smaller than parent. */
        void insert(int value) {
            if (size == a.length) a = Arrays.copyOf(a, a.length * 2);
            a[size] = value;
            siftUp(size);
            size++;
        }
        private void siftUp(int i) {
            while (i > 0) {
                int parent = (i - 1) / 2;
                if (a[i] >= a[parent]) break;              // heap property OK
                swap(i, parent);                           // child smaller -> swap up
                i = parent;
            }
        }

        /** O(log n): take root, move LAST element to root, then sink DOWN. */
        int removeRoot() {
            if (size == 0) throw new java.util.NoSuchElementException();
            int min = a[0];
            a[0] = a[--size];              // last element becomes root
            siftDown(0);
            return min;
        }
        private void siftDown(int i) {
            while (true) {
                int left = 2 * i + 1, right = 2 * i + 2, smallest = i;
                if (left < size  && a[left]  < a[smallest]) smallest = left;
                if (right < size && a[right] < a[smallest]) smallest = right;
                if (smallest == i) break;                  // already <= both children
                swap(i, smallest);                         // sink below the smaller child
                i = smallest;
            }
        }

        /** BUILD HEAP in O(n): sift-down every INTERNAL node from the
         *  last parent (size/2 - 1) up to the root.
         *  Why O(n) and not O(n log n)? Most nodes sit near the bottom
         *  and travel almost zero levels — the total work sums to O(n). */
        void heapify() {
            for (int i = size / 2 - 1; i >= 0; i--) siftDown(i);
        }

        /** Load raw data (used by heapify demo). */
        void load(int... values) {
            if (values.length > a.length) a = Arrays.copyOf(a, values.length * 2);
            for (int v : values) a[size++] = v;
        }

        private void swap(int i, int j) { int t = a[i]; a[i] = a[j]; a[j] = t; }

        @Override
        public String toString() { return Arrays.toString(Arrays.copyOf(a, size)); }
    }

    public static void main(String[] args) {
        MinHeap heap = new MinHeap();
        for (int v : new int[]{7, 2, 9, 5, 3}) heap.insert(v);
        System.out.println("after inserts      : " + heap);
        System.out.println("peek (min) O(1)    : " + heap.peek());          // 2
        System.out.println("removeRoot O(log n): " + heap.removeRoot());    // 2
        System.out.println("removeRoot again   : " + heap.removeRoot());    // 3
        System.out.println("heap now           : " + heap);

        System.out.println("\nBUILD HEAP (heapify) — O(n):");
        MinHeap built = new MinHeap();
        built.load(9, 4, 7, 1, 2, 6, 3);            // arbitrary order
        System.out.println("raw array : " + built);
        built.heapify();                             // fix heap property bottom-up
        System.out.println("heapified : " + built);
        System.out.print("drain min first: ");       // heap sort by draining!
        while (!built.isEmpty()) System.out.print(built.removeRoot() + " ");
        System.out.println();
    }
}
