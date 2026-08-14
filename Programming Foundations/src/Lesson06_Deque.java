import java.util.ArrayDeque;

/**
 * =====================================================================
 *  LESSON 06 — DEQUE (Double-Ended Queue)
 * =====================================================================
 *
 * A deque lets you add/remove at BOTH the front AND the back,
 * every operation in O(1). It generalises stack AND queue:
 *
 *   | Structure | Front            | Back             |
 *   |-----------|------------------|------------------|
 *   | Stack     | —                | add/remove (LIFO)|
 *   | Queue     | remove           | add (FIFO)       |
 *   | Deque     | add AND remove   | add AND remove   |
 *   | Vector    | expensive O(n)   | efficient        |
 *
 * That last row is the exam point: a Vector/ArrayList is great at the
 * back, but inserting/removing at the FRONT costs O(n) (everything
 * shifts). A deque does both ends in O(1) — implemented as a circular
 * array (ArrayDeque) or a doubly linked list.
 *
 * JDK: java.util.ArrayDeque is the standard choice.
 *   addFirst / removeFirst / peekFirst
 *   addLast  / removeLast  / peekLast
 *
 * TRICK: a deque used from ONE end only = stack;
 *        from both ends (add back, remove front) = queue.
 */
public class Lesson06_Deque {

    /** A minimal deque on a circular array — the ArrayDeque idea. */
    static class MyDeque<E> {
        private Object[] data;
        private int head = 0;   // index of the front element
        private int size = 0;

        MyDeque()          { this(8); }
        MyDeque(int cap)   { data = new Object[cap]; }

        private void growIfNeeded() {
            if (size == data.length) {
                Object[] bigger = new Object[data.length * 2];
                for (int i = 0; i < size; i++)                 // unroll the ring
                    bigger[i] = data[(head + i) % data.length];
                data = bigger;
                head = 0;
            }
        }

        /** O(1): step BACKWARDS with wrap-around, then place the value. */
        void addFirst(E value) {
            growIfNeeded();
            head = (head - 1 + data.length) % data.length;   // move head left (wrap)
            data[head] = value;
            size++;
        }

        /** O(1): place at (head + size) % length, the slot after the tail. */
        void addLast(E value) {
            growIfNeeded();
            data[(head + size) % data.length] = value;
            size++;
        }

        @SuppressWarnings("unchecked")
        E removeFirst() {                                      // O(1)
            if (size == 0) throw new java.util.NoSuchElementException();
            E old = (E) data[head];
            data[head] = null;
            head = (head + 1) % data.length;
            size--;
            return old;
        }

        @SuppressWarnings("unchecked")
        E removeLast() {                                       // O(1)
            if (size == 0) throw new java.util.NoSuchElementException();
            int tailIndex = (head + size - 1) % data.length;
            E old = (E) data[tailIndex];
            data[tailIndex] = null;
            size--;
            return old;
        }

        int size() { return size; }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < size; i++)
                sb.append(data[(head + i) % data.length])
                  .append(i == size - 1 ? "" : ", ");
            return sb.append("]").toString();
        }
    }

    public static void main(String[] args) {
        MyDeque<Integer> dq = new MyDeque<>();
        dq.addLast(2);        // [2]
        dq.addLast(3);        // [2, 3]
        dq.addFirst(1);       // [1, 2, 3]   front insert is O(1) here!
        dq.addFirst(0);       // [0, 1, 2, 3]
        System.out.println("deque            : " + dq);
        System.out.println("removeFirst O(1) : " + dq.removeFirst());  // 0
        System.out.println("removeLast  O(1) : " + dq.removeLast());   // 3
        System.out.println("after removals   : " + dq);

        // Same object, two personalities — with the JDK ArrayDeque:
        ArrayDeque<Integer> asStack = new ArrayDeque<>();
        asStack.push(1); asStack.push(2);               // only use ONE end
        System.out.println("\ndeque as STACK : pop -> " + asStack.pop());  // 2

        ArrayDeque<Integer> asQueue = new ArrayDeque<>();
        asQueue.addLast(1); asQueue.addLast(2);         // add back...
        System.out.println("deque as QUEUE : poll -> " + asQueue.removeFirst()); // 1
    }
}
