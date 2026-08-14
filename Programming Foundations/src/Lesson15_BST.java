import java.util.ArrayList;
import java.util.List;

/**
 * =====================================================================
 *  LESSON 15 — BINARY SEARCH TREE (BST)
 * =====================================================================
 *
 * THE RULE (for EVERY node):
 *        left subtree < node.value < right subtree
 *
 *            8
 *          /   \
 *         3     10        <- 3<8<10, and the rule holds at EVERY node
 *        / \      \
 *       1   6      14
 *          / \    /
 *         4   7  13
 *
 * CONSEQUENCES:
 *   - INORDER traversal prints values in SORTED order.
 *   - search/insert/delete follow ONE path down:
 *       BALANCED tree -> O(log n)   (height = log n)
 *       SKEWED tree   -> O(n)       (degenerates into a linked list,
 *                                    e.g. inserting sorted data 1,2,3,4)
 *   Balanced BSTs (AVL, Red-Black) keep height O(log n) automatically.
 *
 * DELETION — the famous 3 cases:
 *   1. LEAF          : just remove it.
 *   2. ONE child     : the child takes its place.
 *   3. TWO children  : replace value with INORDER SUCCESSOR
 *                      (smallest of the right subtree), then delete
 *                      that successor (which has at most ONE child).
 */
public class Lesson15_BST {

    static class Node {
        int value;
        Node left, right;
        Node(int value) { this.value = value; }
    }

    static class BST {
        Node root;

        /* ---- INSERT: walk down comparing, drop the new leaf in place ---- */
        void insert(int value) { root = insert(root, value); }
        private Node insert(Node node, int value) {
            if (node == null) return new Node(value);          // base case: empty spot
            if (value < node.value)      node.left  = insert(node.left,  value);
            else if (value > node.value) node.right = insert(node.right, value);
            // duplicates ignored (common convention)
            return node;
        }

        /* ---- SEARCH: one path down, O(height) ---- */
        boolean contains(int value) {
            Node cur = root;
            while (cur != null) {
                if (value == cur.value) return true;           // found
                cur = (value < cur.value) ? cur.left : cur.right;  // go one way only
            }
            return false;
        }

        /* ---- MIN / MAX: extremes live at the far left / far right ---- */
        int min() { Node n = root; while (n.left  != null) n = n.left;  return n.value; }
        int max() { Node n = root; while (n.right != null) n = n.right; return n.value; }

        /* ---- INORDER = sorted output ---- */
        void inorder(Node node, List<Integer> out) {
            if (node == null) return;
            inorder(node.left, out);
            out.add(node.value);
            inorder(node.right, out);
        }

        /* ---- DELETE: the 3 cases ---- */
        void delete(int value) { root = delete(root, value); }
        private Node delete(Node node, int value) {
            if (node == null) return null;                     // not found
            if (value < node.value) {                          // keep searching
                node.left = delete(node.left, value);
            } else if (value > node.value) {
                node.right = delete(node.right, value);
            } else {                                           // FOUND the node
                // CASE 1: leaf            -> remove (return null)
                // CASE 2: one child       -> child replaces it
                if (node.left == null)  return node.right;     // covers leaf too (right==null)
                if (node.right == null) return node.left;
                // CASE 3: two children    -> take inorder SUCCESSOR's value,
                // then delete the successor from the right subtree
                Node successor = node.right;
                while (successor.left != null) successor = successor.left;  // min of right side
                node.value = successor.value;
                node.right = delete(node.right, successor.value);
            }
            return node;
        }

        /* ---- height: balanced O(log n) vs skewed O(n) ---- */
        int height() { return height(root); }
        private int height(Node node) {
            if (node == null) return -1;
            return 1 + Math.max(height(node.left), height(node.right));
        }
    }

    public static void main(String[] args) {
        BST bst = new BST();
        for (int v : new int[]{8, 3, 10, 1, 6, 14, 4, 7, 13}) bst.insert(v);

        List<Integer> sorted = new ArrayList<>();
        bst.inorder(bst.root, sorted);
        System.out.println("inorder (SORTED) : " + sorted);
        System.out.println("min=" + bst.min() + "  max=" + bst.max());
        System.out.println("contains(7) ? " + bst.contains(7));    // true
        System.out.println("contains(5) ? " + bst.contains(5));    // false
        System.out.println("height = " + bst.height() + " (balanced-ish, O(log n) ops)");

        System.out.println("\nDELETE case 3 (two children): remove 3");
        bst.delete(3);      // 3 has children 1 and 6 -> replaced by successor 4
        sorted.clear();
        bst.inorder(bst.root, sorted);
        System.out.println("after delete(3)  : " + sorted);

        System.out.println("\nSKEWED tree demo — inserting SORTED data is the worst case:");
        BST skewed = new BST();
        for (int v : new int[]{1, 2, 3, 4, 5}) skewed.insert(v);
        System.out.println("height of 5 nodes = " + skewed.height()
                + "  -> ops degrade to O(n), looks like a linked list!");
    }
}
