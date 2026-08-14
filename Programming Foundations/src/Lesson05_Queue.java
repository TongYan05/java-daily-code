import java.util.LinkedList;

/**
 * =====================================================================
 *  LESSON 05 — QUEUE (FIFO)
 * =====================================================================
 *
 * FIFO = First In, First Out. Like a line at a shop: whoever arrives
 * FIRST is served FIRST.
 *
 * OPERATIONS (all O(1)):
 *   enqueue(x)  add x at the BACK
 *   dequeue()   remove and return the FRONT element
 *   front()     look at the front WITHOUT removing it
 *   isEmpty()   true when empty
 *
 * IMPLEMENTATION CHOICES:
 *   1. Array/vector + front pointer  -> circular queue (see below)
 *   2. Linked list (head + tail)     -> naturally O(1) both ends
 *   3. Vector/ArrayList front removal is O(n): every dequeue would
 *      shift ALL remaining elements left — that is why we don't use
 *      "remove(0)" on an ArrayList as a queue!
 *
 * CIRCULAR QUEUE: the array is treated as a ring — when the back
 * pointer reaches the end it wraps to index 0. No shifting ever.
 */
public class Lesson05_Queue {

    /* -------- Queue using a linked list (head + tail pointers) -------- */
    static class LinkedQueue<E> {
        static class Node<E> {
            E data; Node<E> next;
            Node(E data) { this.data = data; }
        }
        private Node<E> head;   // dequeue end
        private Node<E> tail;   // enqueue end
        private int size;

        /** O(1): attach behind the tail. */
        void enqueue(E value) {
            Node<E> n = new Node<>(value);
            if (tail == null) head = tail = n;
            else { tail.next = n; tail = n; }
            size++;
        }

        /** O(1): detach the head — no shifting anywhere. */
        E dequeue() {
            if (head == null) throw new java.util.NoSuchElementException("empty queue");
            E old = head.data;
            head = head.next;
            if (head == null) tail = null;
            size--;
            return old;
        }

        E front() {
            if (head == null) throw new java.util.NoSuchElementException();
            return head.data;
        }
        boolean isEmpty() { return size == 0; }
        int size() { return size; }
    }

    /* -------- Circular queue on a fixed array --------
     * The % operator makes the index "wrap around":
     *   (tail + 1) % capacity  jumps back to 0 when tail is at the end.
     * We keep ONE slot empty to distinguish full from empty.          */
    static class CircularQueue<E> {
        private final Object[] data;
        private int head = 0, tail = 0, size = 0;

        CircularQueue(int capacity) { data = new Object[capacity]; }

        boolean isFull() { return size == data.length; }

        /** O(1): advance tail with wrap-around. */
        void enqueue(E value) {
            if (isFull()) throw new IllegalStateException("queue full");
            data[tail] = value;
            tail = (tail + 1) % data.length;    // ring behaviour
            size++;
        }

        /** O(1): advance head with wrap-around. */
        @SuppressWarnings("unchecked")
        E dequeue() {
            if (size == 0) throw new java.util.NoSuchElementException();
            E old = (E) data[head];
            data[head] = null;
            head = (head + 1) % data.length;    // ring behaviour
            size--;
            return old;
        }

        int size() { return size; }
    }

    public static void main(String[] args) {
        LinkedQueue<String> q = new LinkedQueue<>();
        q.enqueue("Alice");      // arrives first
        q.enqueue("Bob");
        q.enqueue("Carol");
        System.out.println("front = " + q.front());          // Alice
        System.out.println("dequeue -> " + q.dequeue());     // Alice (FIFO!)
        System.out.println("dequeue -> " + q.dequeue());     // Bob

        System.out.println("\nCircular queue (capacity 3) wraps around:");
        CircularQueue<Integer> cq = new CircularQueue<>(3);
        cq.enqueue(1); cq.enqueue(2); cq.enqueue(3);
        cq.dequeue();                     // frees slot 0
        cq.enqueue(4);                    // 4 wraps into slot 0
        while (cq.size() > 0) System.out.println("  dequeue -> " + cq.dequeue());

        // JDK built-in (LinkedList implements Queue):
        java.util.Queue<Integer> jdk = new LinkedList<>();
        jdk.offer(10); jdk.offer(20);
        System.out.println("\nJDK queue poll: " + jdk.poll());  // 10
    }
}
