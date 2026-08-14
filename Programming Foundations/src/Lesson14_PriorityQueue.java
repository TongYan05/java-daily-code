import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * =====================================================================
 *  LESSON 14 — PRIORITY QUEUE
 * =====================================================================
 *
 * A normal QUEUE serves in ARRIVAL order (FIFO).
 * A PRIORITY QUEUE serves by PRIORITY — highest (or lowest) priority
 * first, regardless of arrival time. Like a hospital triage: a
 * critical patient is seen before someone who arrived earlier.
 *
 * IMPLEMENTATION: almost always a HEAP (Lesson 13).
 *   offer/add  (insert)   O(log n)   heap sift-up
 *   peek                  O(1)       the root
 *   poll     (remove)     O(log n)   heap sift-down
 *
 * Java's PriorityQueue is a MIN-heap by default: the SMALLEST
 * element has the highest priority. For a max-priority queue,
 * pass a reversed Comparator.
 */
public class Lesson14_PriorityQueue {

    /** Task with a priority — smaller number = more urgent. */
    static class Task implements Comparable<Task> {
        final String name;
        final int priority;
        Task(String name, int priority) { this.name = name; this.priority = priority; }

        /** The queue compares with THIS to decide who goes first. */
        @Override
        public int compareTo(Task other) {
            return Integer.compare(this.priority, other.priority);   // min priority first
        }

        @Override
        public String toString() { return name + "(p=" + priority + ")"; }
    }

    public static void main(String[] args) {
        /* ---- 1) Numbers: smallest leaves first ---- */
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(5); pq.offer(1); pq.offer(8); pq.offer(3);
        System.out.println("offer 5,1,8,3 -> peek = " + pq.peek());    // 1 (smallest)
        System.out.print("poll order: ");
        while (!pq.isEmpty()) System.out.print(pq.poll() + " ");       // 1 3 5 8
        System.out.println("   (NOT insertion order — that's the point!)");

        /* ---- 2) Custom objects ---- */
        PriorityQueue<Task> tasks = new PriorityQueue<>();
        tasks.offer(new Task("email", 3));        // arrives first, but low priority
        tasks.offer(new Task("server down", 1));  // arrives second, CRITICAL
        tasks.offer(new Task("meeting notes", 2));
        System.out.println("\nTriage order:");
        while (!tasks.isEmpty()) System.out.println("  -> " + tasks.poll());
        // server down (p=1) first even though email arrived earlier.

        /* ---- 3) MAX priority queue via Comparator ---- */
        PriorityQueue<Integer> maxPq =
                new PriorityQueue<>(Comparator.reverseOrder());
        maxPq.offer(5); maxPq.offer(1); maxPq.offer(8);
        System.out.println("\nmax-queue poll: " + maxPq.poll());       // 8

        System.out.println("\nQueue vs PriorityQueue:");
        System.out.println("  Queue          : FIFO — first IN, first OUT");
        System.out.println("  PriorityQueue  : priority decides, heap-backed");
        System.out.println("  complexity     : offer O(log n), peek O(1), poll O(log n)");
    }
}
