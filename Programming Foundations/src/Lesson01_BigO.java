/**
 * =====================================================================
 *  LESSON 01 — BIG-O NOTATION & COMPLEXITY ANALYSIS
 * =====================================================================
 *
 * Big-O describes HOW RUNNING TIME (or memory) GROWS with input size n.
 * We ignore constants and small terms — only the growth rate matters:
 *
 *      3n + 7   ->  O(n)          n^2 + 5n + 2  ->  O(n^2)
 *
 * THE FIVE YOU MUST MEMORISE
 * --------------------------
 *   O(1)        Constant       work does not depend on n
 *   O(log n)    Logarithmic    problem is HALVED every step  /ˌlɒɡ.əˈrɪθ.mɪk/
 *   O(n)        Linear         one pass over the input
 *   O(n log n)  Linearithmic   the speed of good sorting algorithms
 *   O(n^2)      Quadratic      nested loops over the input
 *
 * TIME vs SPACE
 * -------------
 *   Time complexity  = how many steps the CPU executes.
 *   Space complexity = how much EXTRA memory the algorithm needs.
 *   Example: recursive binary search uses O(log n) call-stack space,
 *   the iterative version uses only O(1).
 *
 * BEST / AVERAGE / WORST CASE
 * ---------------------------
 *   Linear search in an unsorted array:
 *     best = O(1) (target is first), average = O(n), worst = O(n).
 *   Big-O normally refers to the WORST case unless stated otherwise.
 */
public class Lesson01_BigO {

    /* ================= Spot the complexity from code ================= */

    /** O(1): no loop, no recursion — input size does not matter. */
    static int getFirst(int[] a) {
        return a[0];
    }

    /** O(n): one loop that visits each element once. */
    static long countLinear(int n) {
        long count = 0;
        for (int i = 0; i < n; i++) count++;   // executes n times
        return count;
    }

    /** O(n^2): NESTED loops MULTIPLY: n outer steps x n inner steps. */
    static long countPairs(int n) {
        long count = 0;
        for (int i = 0; i < n; i++)            // n times
            for (int j = 0; j < n; j++)        // n times per outer step
                count++;
        return count;                          // n * n = n^2
    }

    /** O(log n): the variable is DIVIDED BY 2 every iteration.
     *  n = 16 -> 8 -> 4 -> 2 -> 1 : only log2(16) = 4 steps.
     *  Whenever you see i *= 2 or i /= 2 in a loop -> think O(log n). */
    static int countHalvings(int n) {
        int steps = 0;
        for (int i = n; i > 0; i /= 2) steps++;
        return steps;
    }

    /** O(n log n): outer loop runs n times, inner halves -> log n each. */
    static long nLogNDemo(int n) {
        long ops = 0;
        for (int i = 0; i < n; i++)            // n times
            for (int j = n; j > 0; j /= 2)     // log n each
                ops++;
        return ops;                            // n * log n
    }

    /** SEQUENTIAL loops ADD:   O(n) + O(n) = O(2n) = O(n)
     *  NESTED loops MULTIPLY:  O(n) * O(n) = O(n^2)             */
    static long sequentialLoops(int n) {
        long ops = 0;
        for (int i = 0; i < n; i++) ops++;     // first pass:  n
        for (int i = 0; i < n; i++) ops++;     // second pass: n
        return ops;                            // total 2n -> still O(n)
    }

    /* ==================== Amortized complexity =======================
     * Appending to a dynamic array (ArrayList) is O(1) AMORTIZED.
     * Most appends cost 1 step, but when the array is FULL it must
     * resize: copy all n elements -> that ONE append costs O(n).
     *
     * Resizes happen at sizes 1, 2, 4, 8, ... so the TOTAL copy cost
     * of n appends is 1 + 2 + 4 + ... + n  <  2n.
     * Total for n appends = O(n)  =>  O(1) PER APPEND on average.
     * "Amortized" = average cost per operation over a long sequence.
     * ================================================================ */

    public static void main(String[] args) {
        System.out.println("How fast each complexity grows (counted operations):");
        System.out.printf("%-8s %-10s %-12s %-12s %-10s%n",
                "n", "O(n)", "O(n^2)", "O(n log n)", "O(log n)");
        for (int n : new int[]{10, 100, 1000, 10000}) {
            System.out.printf("%-8d %-10d %-12d %-12d %-10d%n",
                    n,
                    countLinear(n),      // grows like n
                    countPairs(n),       // grows like n^2
                    nLogNDemo(n),        // grows like n log n
                    countHalvings(n));   // grows like log n
        }
        System.out.println("\nNotice: n grew 1000x, but n^2 grew 1,000,000x.");
        System.out.println("Sequential loops: " + sequentialLoops(1000)
                + " steps for n=1000  ->  2n, which is still O(n).");


        System.out.printf("%-5s%-6s%-6s%-5s","ty","wwj","zfb","lg");
        for(int i=1;i<=16;i+=4){
            System.out.printf("%n%-5d%-6d%-6d%-5d",i,i+1,i+2,i+3);
        }


    }


}
