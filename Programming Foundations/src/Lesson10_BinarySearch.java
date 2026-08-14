import java.util.Arrays;

/**
 * =====================================================================
 *  LESSON 10 — BINARY SEARCH
 * =====================================================================
 *
 * Binary search finds a target in a SORTED array in O(log n) by
 * halving the search space every step:
 *
 *   low = 0, high = n-1
 *   while low <= high:
 *       mid = (low + high) / 2
 *       target == a[mid]  -> FOUND
 *       target <  a[mid]  -> answer must be LEFT  -> high = mid - 1
 *       target >  a[mid]  -> answer must be RIGHT -> low  = mid + 1
 *   not found
 *
 * PREREQUISITE: the data MUST be sorted. On unsorted data the
 * comparisons tell you nothing -> you are back to O(n) linear scan.
 *
 * COMPLEXITY:
 *   time  : O(log n) — n=1,000,000 needs only ~20 comparisons!
 *   space : iterative O(1)  |  recursive O(log n) call stack
 *
 * CLASSIC BUG: (low + high) can overflow int for huge arrays.
 * Safe formula:  low + (high - low) / 2
 */
public class Lesson10_BinarySearch {

    /** ITERATIVE — O(log n) time, O(1) space. Returns index or -1. */
    static int binarySearch(int[] a, int target) {
        int low = 0, high = a.length - 1;
        while (low <= high) {                       // low == high: still 1 candidate!
            int mid = low + (high - low) / 2;       // overflow-safe midpoint
            if (a[mid] == target) return mid;       // found
            else if (a[mid] < target) low = mid + 1;   // discard LEFT half
            else                      high = mid - 1;  // discard RIGHT half
        }
        return -1;   // search space empty -> not present
    }

    /** RECURSIVE — same O(log n) time but O(log n) stack space. */
    static int binarySearchRecursive(int[] a, int target, int low, int high) {
        if (low > high) return -1;                  // base case: empty range
        int mid = low + (high - low) / 2;
        if (a[mid] == target) return mid;
        if (a[mid] < target)
            return binarySearchRecursive(a, target, mid + 1, high);  // right half
        return binarySearchRecursive(a, target, low, mid - 1);       // left half
    }

    /** TRACE helper — print every comparison the iterative version makes,
     *  so you can practice "trace binary search" exam questions. */
    static int trace(int[] a, int target) {
        int low = 0, high = a.length - 1, step = 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            System.out.printf("  step %d: low=%d high=%d mid=%d a[mid]=%d%n",
                    step++, low, high, mid, a[mid]);
            if (a[mid] == target) return mid;
            if (a[mid] < target) low = mid + 1; else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        System.out.println("array = " + Arrays.toString(a));
        System.out.println("(data is SORTED — required!)\n");

        System.out.println("binarySearch(23)      -> index " + binarySearch(a, 23)); // 5
        System.out.println("binarySearch(7)       -> " + binarySearch(a, 7));        // -1
        System.out.println("recursive search(56)  -> index "
                + binarySearchRecursive(a, 56, 0, a.length - 1));                    // 7

        System.out.println("\nTrace of searching for 38 in a 10-element array");
        System.out.println("(a linear scan could need 10 steps — watch the halving):");
        int idx = trace(a, 38);
        System.out.println("found at index " + idx
                + " — only ~log2(10) ≈ 4 comparisons = O(log n)");

        System.out.println("\nJDK built-in (same algorithm):");
        System.out.println("Arrays.binarySearch -> " + Arrays.binarySearch(a, 23));
    }
}
