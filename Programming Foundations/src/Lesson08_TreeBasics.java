/**
 * =====================================================================
 *  LESSON 08 — TREES: BASICS & TERMINOLOGY
 * =====================================================================
 *
 * A tree is a hierarchical structure of NODES connected by EDGES,
 * with NO cycles (you can never loop back to a node you visited).
 *
 * TERMINOLOGY (label them on the picture below!):
 *
 *              1            <- ROOT (the top node, no parent)
 *            /   \
 *           2     3         <- 2 and 3 are CHILDREN of 1, SIBLINGS to each other
 *          / \     \
 *         4   5     6       <- 4,5,6 are LEAVES (no children)
 *
 *   parent      the node directly above        (1 is parent of 2,3)
 *   child       the node directly below        (2,3 are children of 1)
 *   sibling     nodes sharing the same parent  (2 and 3; 4 and 5)
 *   leaf        a node with NO children        (4, 5, 6)
 *   edge        the connection between two nodes
 *   path        sequence of edges between two nodes (2->1->3->6)
 *   subtree     any node + everything below it (subtree of 2 = 2,4,5)
 *   ancestor    any node on the path up to the root (1 is ancestor of 4)
 *   descendant  any node reachable going down      (5 is descendant of 1)
 *   degree      number of children of a node   (deg(2)=2, deg(6)=0)
 *
 * DEPTH vs HEIGHT (easy to mix up — remember the direction):
 *   depth(node) = edges from ROOT down to the node     (depth(root)=0)
 *   height(node)= edges on the LONGEST path down to a leaf (height(leaf)=0)
 *   height(tree) = height(root) = depth of the deepest leaf
 *   In the tree above: depth(4)=2, height(2)=1, height(tree)=2.
 *
 * TYPES OF BINARY TREES (a binary tree: at most 2 children each,
 * a LEFT child and a RIGHT child — order matters!):
 *   FULL      every node has 0 or 2 children (never exactly 1)
 *   COMPLETE  all levels full except possibly the LAST, which is
 *             filled LEFT to right  (heaps are complete trees!)
 *   PERFECT   every level completely full (1 + 2 + 4 + ... nodes)
 *   BALANCED  height is O(log n) — no side is much deeper
 *
 * A tree with n nodes has EXACTLY n-1 edges (each node except the
 * root has exactly one incoming edge).
 */
public class Lesson08_TreeBasics {

    /** Binary tree node: data + at most TWO child references. */
    static class TreeNode {
        int value;
        TreeNode left, right;
        TreeNode(int value) { this.value = value; }
    }

    /** depth = how far DOWN from the root this node is. */
    static int depth(TreeNode node, TreeNode root) {
        // walk DOWN from the root searching for the node
        return depthHelper(root, node, 0);
    }
    static int depthHelper(TreeNode cur, TreeNode target, int d) {
        if (cur == null) return -1;                      // dead end
        if (cur == target) return d;                     // found it
        int left = depthHelper(cur.left, target, d + 1);
        if (left != -1) return left;
        return depthHelper(cur.right, target, d + 1);
    }

    /** height = LONGEST path from this node down to any leaf. */
    static int height(TreeNode node) {
        if (node == null) return -1;                     // empty tree: -1
        return 1 + Math.max(height(node.left), height(node.right));
    }

    /** A FULL binary tree: every node has 0 or 2 children. */
    static boolean isFull(TreeNode node) {
        if (node == null) return true;
        boolean hasLeft = node.left != null, hasRight = node.right != null;
        if (hasLeft != hasRight) return false;           // exactly one child -> not full
        return isFull(node.left) && isFull(node.right);
    }

    /** Count nodes — a first taste of tree recursion. */
    static int countNodes(TreeNode node) {
        if (node == null) return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    /** Count leaves (nodes with no children). */
    static int countLeaves(TreeNode node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;  // it IS a leaf
        return countLeaves(node.left) + countLeaves(node.right);
    }

    public static void main(String[] args) {
        // Build the tree from the diagram:
        //        1
        //      /   \
        //     2     3
        //    / \     \
        //   4   5     6
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        System.out.println("nodes        = " + countNodes(root));        // 6
        System.out.println("edges        = " + (countNodes(root) - 1));  // 5 (n-1)
        System.out.println("leaves       = " + countLeaves(root));       // 3 (4,5,6)
        System.out.println("height(tree) = " + height(root));            // 2
        System.out.println("depth(node 4)= " + depth(root.left.left, root)); // 2
        System.out.println("isFull       = " + isFull(root));            // false (3 has only 1 child)

        // The same values as a FULL tree:
        //      1
        //    /   \
        //   2     3
        TreeNode full = new TreeNode(1);
        full.left = new TreeNode(2);
        full.right = new TreeNode(3);
        System.out.println("\nfull tree isFull = " + isFull(full));      // true
    }
}
