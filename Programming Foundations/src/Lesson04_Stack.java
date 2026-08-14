import java.util.LinkedList;

/**
 * =====================================================================
 *  LESSON 04 — STACK (LIFO)
 * =====================================================================
 *
 * LIFO = Last In, First Out.
 * Imagine a stack of plates: the LAST plate you put on top is the
 * FIRST one you can take off.
 *
 * OPERATIONS (all O(1)):
 *   push(x)   put x on top
 *   pop()     remove and return the top
 *   peek()    look at the top WITHOUT removing it
 *   isEmpty() true when there is nothing in the stack
 *
 * WHY NOT USE AN ARRAYLIST?
 * push/pop at the END of an ArrayList are also O(1) amortized, so it
 * works — but a LINKED LIST gives true O(1) with no resize cost.
 * The JDK offers java.util.Stack (legacy) and ArrayDeque (preferred).
 *
 * REAL APPLICATIONS (know these):
 *   1. Function call stack — every method call is pushed;
 *      returning pops it. Deep recursion -> StackOverflowError.
 *   2. Undo / Ctrl+Z — actions are pushed, undo pops the newest one.
 *   3. Parentheses matching — push '(' , pop on ')'.
 *   4. DFS (depth-first search) — stack decides where to go next.
 *   5. Expression evaluation — postfix calculators use a stack.
 */
public class Lesson04_Stack {

    /** Stack backed by a linked list — every op is truly O(1). */
    static class MyStack<E> {
        private final java.util.ArrayDeque<E> data = new java.util.ArrayDeque<>();

        void push(E x)  { data.addLast(x); }          // O(1)
        E pop()         { return data.removeLast(); } // O(1)
        E peek()        { return data.peekLast(); }   // O(1)
        boolean isEmpty() { return data.isEmpty(); }
        int size()      { return data.size(); }
    }

    /** Classic application #1 — check balanced brackets.
     *  Algorithm:
     *    '(' '[' '{'  -> push
     *    ')' ']' '}'  -> the top MUST be the matching opener, else invalid
     *  Valid only if the stack is EMPTY at the end.            O(n) total */
    static boolean isBalanced(String s) {
        MyStack<Character> stack = new MyStack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);                                   // remember opener
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) return false;               // closer with no opener
                char open = stack.pop();
                if (c == ')' && open != '(') return false;
                if (c == ']' && open != '[') return false;
                if (c == '}' && open != '{') return false;
            }
        }
        return stack.isEmpty();   // leftover openers -> unbalanced
    }

    /** Classic application #2 — reverse a string.
     *  Push everything in, pop everything out -> order flips (LIFO!). */
    static String reverse(String s) {
        MyStack<Character> stack = new MyStack<>();
        for (char c : s.toCharArray()) stack.push(c);
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) sb.append(stack.pop());
        return sb.toString();
    }

    /** Classic application #3 — evaluate a postfix expression.
     *  "5 1 2 + 4 * + 3 -"  means  5 + ((1+2) * 4) - 3 = 14
     *  Numbers -> push.  Operator -> pop TWO operands, apply, push result. */
    static double evalPostfix(String expr) {
        MyStack<Double> stack = new MyStack<>();
        for (String token : expr.split(" ")) {
            if (token.matches("-?\\d+(\\.\\d+)?")) {
                stack.push(Double.parseDouble(token));           // operand: push
            } else {
                double b = stack.pop();                          // right operand FIRST!
                double a = stack.pop();                          // then left operand
                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                }
            }
        }
        return stack.pop();   // the single value left is the answer
    }

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1); stack.push(2); stack.push(3);
        System.out.println("push 1,2,3  ->  peek=" + stack.peek());  // 3 (top)
        System.out.println("pop -> " + stack.pop());                  // 3 first (LIFO!)
        System.out.println("pop -> " + stack.pop());                  // 2
        System.out.println("pop -> " + stack.pop());                  // 1

        System.out.println("\nBracket matching:");
        System.out.println("  ({[]})  -> " + isBalanced("({[]})"));   // true
        System.out.println("  ([)]    -> " + isBalanced("([)]"));     // false (crossed)
        System.out.println("  ((      -> " + isBalanced("(("));       // false (leftover)

        System.out.println("\"change the sequence of string\"->"+reverse("tong yan"));

        System.out.println("\nreverse(\"stack\") = " + reverse("stack"));   // kcats
        System.out.println("postfix 5 1 2 + 4 * + 3 - = "
                + evalPostfix("5 1 2 + 4 * + 3 -"));                    // 14.0


        System.out.println(evalPostfix("1 3 7 19 5 + 6 * 5 / 7")==7);

        // JDK built-in (ArrayDeque is the recommended stack):
        java.util.ArrayDeque<String> jdk = new java.util.ArrayDeque<>();
        jdk.push("undo: typing");
        jdk.push("undo: delete");
        System.out.println("\nCtrl+Z pops: " + jdk.pop());   // newest action first



    }
}
