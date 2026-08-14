import java.util.Arrays;

/**
 * =====================================================================
 *  LESSON 11 — SORTING ALGORITHMS
 * =====================================================================
 *
 *  | Algorithm  | Best      | Average   | Worst     | Space | Stable? |
 *  |------------|-----------|-----------|-----------|-------|---------|
 *  | Bubble     | O(n)      | O(n^2)    | O(n^2)    | O(1)  | YES     |
 *  | Selection  | O(n^2)    | O(n^2)    | O(n^2)    | O(1)  | no      |
 *  | Insertion  | O(n)      | O(n^2)    | O(n^2)    | O(1)  | YES     |
 *  | Merge      | O(n logn) | O(n logn) | O(n logn) | O(n)  | YES     |
 *  | Quick      | O(n logn) | O(n logn) | O(n^2)    | O(logn)| no     |
 *
 * KEY VOCABULARY:
 *   STABLE    equal elements keep their ORIGINAL relative order.
 *             (bubble, insertion, merge = stable; selection, quick = not)
 *   IN-PLACE  uses O(1) extra memory (bubble, selection, insertion, quick).
 *             Merge sort needs O(n) extra space for merging.
 *
 * WHY O(n log n)? Divide the array in half log(n) times; each level
 * of the recursion touches all n elements once -> n * log n.
 */
public class Lesson11_Sorting {

    /* -------- BUBBLE SORT: swap adjacent out-of-order pairs --------
     * After pass 1 the LARGEST value has "bubbled" to the end.
     * Optimisation: if a full pass makes ZERO swaps, it is sorted.
     * Best case O(n) happens on ALREADY SORTED input (thanks to the flag). */
    static void bubbleSort(int[] a) {
        for (int pass = 0; pass < a.length - 1; pass++) {
            boolean swapped = false;
            for (int i = 0; i < a.length - 1 - pass; i++) {   // -pass: tail already sorted
                if (a[i] > a[i + 1]) {
                    int t = a[i]; a[i] = a[i + 1]; a[i + 1] = t;   // swap neighbours
                    swapped = true;
                }
            }
            if (!swapped) break;              // nothing moved -> done (best case O(n))
        }
    }

    /* -------- SELECTION SORT: find the minimum, put it in place --------
     * Scan the UNSORTED part for the smallest value, swap it to the front.
     * Always O(n^2) comparisons, even on sorted input (no early exit). */
    static void selectionSort(int[] a) {
        for (int pos = 0; pos < a.length - 1; pos++) {
            int min = pos;                                  // assume first is min
            for (int i = pos + 1; i < a.length; i++)        // scan the rest
                if (a[i] < a[min]) min = i;                 // track smallest index
            int t = a[pos]; a[pos] = a[min]; a[min] = t;    // swap into place
        }
    }

    /* -------- INSERTION SORT: grow a sorted portion on the left --------
     * Take the next card and slide it LEFT until it fits — like
     * sorting playing cards in your hand.
     * Best case O(n): already sorted -> each element slides 0 positions. */
    static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];                    // the element to insert
            int j = i - 1;
            while (j >= 0 && a[j] > key) {     // shift bigger elements right
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;                    // drop key into its slot
        }
    }

    /* -------- MERGE SORT: divide -> sort halves -> merge --------
     * Guaranteed O(n log n) in EVERY case, but needs O(n) extra space.
     * STABLE: when values are equal, take from the LEFT half first. */
    static void mergeSort(int[] a, int lo, int hi) {
        if (lo >= hi) return;                  // 1 element = already sorted
        int mid = lo + (hi - lo) / 2;
        mergeSort(a, lo, mid);                 // sort LEFT half
        mergeSort(a, mid + 1, hi);             // sort RIGHT half
        merge(a, lo, mid, hi);                 // merge the two sorted halves
    }
    private static void merge(int[] a, int lo, int mid, int hi) {
        int[] tmp = new int[hi - lo + 1];      // O(n) extra space
        int i = lo, j = mid + 1, k = 0;
        while (i <= mid && j <= hi)            // always take the SMALLER head
            tmp[k++] = (a[i] <= a[j]) ? a[i++] : a[j++];   // <= keeps stability
        while (i <= mid) tmp[k++] = a[i++];    // leftover left half
        while (j <= hi)  tmp[k++] = a[j++];    // leftover right half
        System.arraycopy(tmp, 0, a, lo, tmp.length);
    }

    /* -------- QUICK SORT: pick pivot -> partition -> recurse --------
     * Average O(n log n). Worst O(n^2) when the pivot is always the
     * min or max (e.g. sorted input with "last element" pivot).
     * IN-PLACE: only O(log n) stack space. NOT stable. */
    static void quickSort(int[] a, int lo, int hi) {
        if (lo >= hi) return;
        int p = partition(a, lo, hi);          // pivot lands in final position
        quickSort(a, lo, p - 1);               // sort left of pivot
        quickSort(a, p + 1, hi);               // sort right of pivot
    }
    private static int partition(int[] a, int lo, int hi) {
        int pivot = a[hi];                     // choose LAST element as pivot
        int i = lo;                            // i = boundary of "<= pivot" zone
        for (int j = lo; j < hi; j++)
            if (a[j] <= pivot) {               // small value -> move to left zone
                int t = a[i]; a[i] = a[j]; a[j] = t;
                i++;
            }
        int t = a[i]; a[i] = a[hi]; a[hi] = t; // swap pivot into the boundary
        return i;                              // pivot's final index
    }

    public static void main(String[] args) {
        int[] data = {5, 2, 9, 1, 7, 3};

        int[] a = data.clone(); bubbleSort(a);      System.out.println("bubble   : " + Arrays.toString(a));
        a = data.clone();       selectionSort(a);   System.out.println("selection: " + Arrays.toString(a));
        a = data.clone();       insertionSort(a);   System.out.println("insertion: " + Arrays.toString(a));
        a = data.clone();       mergeSort(a, 0, a.length - 1); System.out.println("merge    : " + Arrays.toString(a));
        a = data.clone();       quickSort(a, 0, a.length - 1); System.out.println("quick    : " + Arrays.toString(a));

        System.out.println("\nExam summary:");
        System.out.println("  need guaranteed O(n log n)?        -> merge sort");
        System.out.println("  need in-place + fast average?      -> quick sort");
        System.out.println("  nearly sorted input?               -> insertion sort (O(n) best)");
        System.out.println("  must preserve equal-element order? -> stable sorts only");
    }
}
