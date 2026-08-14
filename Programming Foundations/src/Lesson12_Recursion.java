/**
 * =====================================================================
 *  LESSON 12 — RECURSION
 * =====================================================================
 *
 * Recursion = a method that CALLS ITSELF to solve smaller versions
 * of the same problem. Every recursive method needs:
 *
 *   1. BASE CASE     — the simplest input, answered directly,
 *                      recursion STOPS here.
 *   2. RECURSIVE CASE — shrink the problem and call yourself.
 *
 * Every call is PUSHED onto the CALL STACK; when a call returns it
 * is POPPED. Too many calls without a base case -> StackOverflowError.
 *
 * HOW TO TRACE (exam skill): write an activation box per call and
 * follow it down to the base case, then unwind upwards:
 *
 *   fact(4)
 *     -> 4 * fact(3)
 *           -> 3 * fact(2)
 *                 -> 2 * fact(1)
 *                       -> 1            (base case)
 *                 = 2 * 1  = 2
 *           = 3 * 2      = 6
 *     = 4 * 6            = 24
 */
public class Lesson12_Recursion {

    /* ---------------- Example 1: factorial ---------------- */
    /** n! = n * (n-1)! with base case 0! = 1. */
    static long factorial(int n) {
        if (n <= 1) return 1;            // BASE CASE — stops the recursion
        return n * factorial(n - 1);     // RECURSIVE CASE — smaller problem
    }

    /* ---------------- Example 2: sum of an array ----------------
     * Recursion with arrays: process a[0], then recurse on the REST. */
    static int sum(int[] a, int index) {
        if (index == a.length) return 0;          // base: nothing left
        return a[index] + sum(a, index + 1);      // first + sum of the rest
    }

    /* ---------------- Example 3: Fibonacci ----------------
     * TWO recursive calls per step -> exponential O(2^n) work!
     * Classic lesson: recursion alone can be inefficient;
     * remember this shape of the call tree: fib(n) calls fib(n-1)
     * and fib(n-2), so calls EXPLODE without memoisation. */
    static long fib(int n) {
        if (n <= 1) return n;                     // base cases: fib(0)=0, fib(1)=1
        return fib(n - 1) + fib(n - 2);           // two branches
    }

    /* ---------------- Example 4: recursion vs iteration ---------------- */
    /** Same factorial, iterative version: loop instead of call stack.
     *  Same O(n) time, but only O(1) space — no stack frames. */
    static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }

    /* ---------------- Example 5: divide & conquer (merge sort shape) ---
     * Counting complexity of recursion:
     *   T(n) = 2*T(n/2) + O(n)   ->  O(n log n)
     *   (split into 2 halves = log n levels, each level does O(n) work) */
    static int countDown(int n, int depth) {
        if (n <= 1) return 1;                     // base case
        int left  = countDown(n / 2, depth + 1);  // solve left half
        int right = countDown(n / 2, depth + 1);  // solve right half
        return left + right;                      // combine (O(1) here)
    }

    /** DEMO of stack overflow: unbounded recursion without a base case. */
    static int neverStops(int n) {
        return neverStops(n + 1);                 // no base case -> BOOM
    }

    public static void main(String[] args) {
        System.out.println("factorial(5)        = " + factorial(5));          // 120
        System.out.println("factorialIter(5)  = " + factorialIterative(5));   // 120
        System.out.println("sum({1,2,3,4,5})  = " + sum(new int[]{1,2,3,4,5}, 0)); // 15
        System.out.println("fib(10)           = " + fib(10));                  // 55
        System.out.println("countDown(16)     = " + countDown(16, 0));        // 16 leaves

        System.out.println("\nTrace factorial(4):");
        System.out.println("  fact(4) = 4 * fact(3)");
        System.out.println("          = 4 * 3 * fact(2)");
        System.out.println("          = 4 * 3 * 2 * fact(1)");
        System.out.println("          = 4 * 3 * 2 * 1  = 24");

        System.out.println("\nRecursion vs iteration:");
        System.out.println("  recursion: elegant for trees/divide&conquer, uses O(depth) stack");
        System.out.println("  iteration: O(1) space, no StackOverflowError risk");

        // Uncomment to see the crash (StackOverflowError):
        // System.out.println(neverStops(0));
    }
}
