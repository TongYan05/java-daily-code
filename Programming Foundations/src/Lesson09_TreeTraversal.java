import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * =====================================================================
 *  LESSON 09 — TREE TRAVERSAL (know the order EXACTLY)
 * =====================================================================
 *
 * Given this tree:
 *            1
 *          /   \
 *         2     3
 *        / \   /
 *       4   5 6
 *
 * DFS — depth first (uses STACK or recursion):
 *   PREORDER   Root -> Left -> Right      : 1 2 4 5 3 6
 *   INORDER    Left -> Root -> Right      : 4 2 5 1 6 3
 *   POSTORDER  Left -> Right -> Root      : 4 5 2 6 3 1
 *
 *   Memory trick: the "ORDER" is where the ROOT is visited —
 *   PRE = before children, IN = between, POST = after.
 *   In a BST, INORDER always prints values SORTED (Lesson 15).
 *
 * BFS — breadth first (uses a QUEUE):
 *   LEVEL-ORDER level by level, left to right : 1 2 3 4 5 6
 *
 * All traversals are O(n): every node is visited exactly once.
 */
public class Lesson09_TreeTraversal {

    static class TreeNode {
        int value;
        TreeNode left, right;
        TreeNode(int value) { this.value = value; }
    }

    /* ---------------- DFS: recursive (call stack) ---------------- */

    /** PREORDER — Root first: useful for COPYING/serialising a tree. */
    static void preorder(TreeNode node, List<Integer> out) {
        if (node == null) return;              // base case
        out.add(node.value);                   // ROOT first
        preorder(node.left, out);              // then LEFT subtree
        preorder(node.right, out);             // then RIGHT subtree
    }

    /** INORDER — Root in the MIDDLE: sorted output on a BST. */
    static void inorder(TreeNode node, List<Integer> out) {
        if (node == null) return;
        inorder(node.left, out);               // LEFT subtree first
        out.add(node.value);                   // ROOT in the middle
        inorder(node.right, out);              // RIGHT subtree last
    }

    /** POSTORDER — Root LAST: useful for DELETING a tree (children first). */
    static void postorder(TreeNode node, List<Integer> out) {
        if (node == null) return;
        postorder(node.left, out);             // LEFT
        postorder(node.right, out);            // RIGHT
        out.add(node.value);                   // ROOT last
    }

    /* ---------------- DFS with an EXPLICIT stack ----------------
     * Same order as recursion, but YOU manage the stack — this is
     * exactly how the call stack works under the hood.             */
    static List<Integer> preorderIterative(TreeNode root) {
        List<Integer> out = new ArrayList<>();
        if (root == null) return out;
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            out.add(cur.value);
            // push RIGHT first so LEFT is popped first (LIFO!)
            if (cur.right != null) stack.push(cur.right);
            if (cur.left != null)  stack.push(cur.left);
        }
        return out;
    }

    /* ---------------- BFS: level-order with a QUEUE ---------------- */
    static List<Integer> levelOrder(TreeNode root) {
        List<Integer> out = new ArrayList<>();
        if (root == null) return out;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();       // take FRONT (oldest) node
            out.add(cur.value);
            if (cur.left != null)  queue.add(cur.left);   // enqueue children
            if (cur.right != null) queue.add(cur.right);  // left before right
        }
        return out;
    }

    public static void main(String[] args) {
        //        1
        //      /   \
        //     2     3
        //    / \   /
        //   4   5 6
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        List<Integer> out = new ArrayList<>();
        preorder(root, out);  System.out.println("preorder   : " + out);  // [1,2,4,5,3,6]
        out.clear();
        inorder(root, out);   System.out.println("inorder    : " + out);  // [4,2,5,1,6,3]
        out.clear();
        postorder(root, out); System.out.println("postorder  : " + out);  // [4,5,2,6,3,1]

        System.out.println("preorder it: " + preorderIterative(root));    // [1,2,4,5,3,6]
        System.out.println("level-order: " + levelOrder(root));           // [1,2,3,4,5,6]

        System.out.println("\nExam pattern — 'which structure does X use?'");
        System.out.println("  DFS         -> stack (or recursion)");
        System.out.println("  BFS/level   -> queue");
    }
}
