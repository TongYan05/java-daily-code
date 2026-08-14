/**
 * =====================================================================
 *  LESSON 03 — LINKED LIST
 * =====================================================================
 *
 * A linked list is a chain of NODES. Each node holds:
 *   - the DATA
 *   - a REFERENCE (pointer) to the next node (and previous, if doubly)
 *
 *      head                                tail
 *       |                                   |
 *     [A|next] -> [B|next] -> [C|next] -> null
 *
 * KEY FACTS:
 *   - Nodes can live ANYWHERE in memory (NOT contiguous).
 *   - head = first node, tail = last node.
 *   - Singly linked: only `next`.  Doubly linked: `next` AND `prev`.
 *   - NO random access: to reach index i you must walk i nodes -> O(n).
 *   - Insert/delete at a KNOWN node = O(1): just rewire a few references.
 *   - Pointer overhead: every node pays extra memory for its reference(s).
 *   - Worse cache locality than arrays (nodes scattered in memory).
 *
 * COMPLEXITY:
 *   search / get(i)              O(n)
 *   insert/remove at head        O(1)
 *   insert/remove at tail        O(1) if we keep a tail reference
 *   insert/remove at known node  O(1)
 *
 * ARRAY vs LINKED LIST (exam favourite):
 *   random access:       array O(1)      vs  list O(n)
 *   insert/delete front: array O(n)      vs  list O(1)
 *   memory:              array compact   vs  list + pointer overhead
 *   cache locality:      array great     vs  list poor
 */
public class Lesson03_LinkedList {

    /* ---------------- Singly linked list ---------------- */
    static class SinglyLinkedList<E> {
        static class Node<E> {
            E data;
            Node<E> next;
            Node(E data) { this.data = data; }
        }

        private Node<E> head;   // first node
        private Node<E> tail;   // last node  -> makes addLast O(1)
        private int size;

        int size() { return size; }

        /** O(1): new node becomes the new head. */
        void addFirst(E value) {
            Node<E> node = new Node<>(value);
            node.next = head;                // point to old head
            head = node;                     // new node is now head
            if (tail == null) tail = node;   // list was empty
            size++;
        }

        /** O(1) thanks to the tail reference (without it: O(n) walk). */
        void addLast(E value) {
            Node<E> node = new Node<>(value);
            if (tail == null) { head = tail = node; }    // empty list
            else              { tail.next = node; tail = node; }
            size++;
        }

        /** O(1): head simply moves to the second node. */
        E removeFirst() {
            if (head == null) throw new java.util.NoSuchElementException();
            E old = head.data;
            head = head.next;
            if (head == null) tail = null;   // list became empty
            size--;
            return old;
        }

        /** O(n): must walk node by node — no index shortcut exists. */
        E get(int index) {
            Node<E> cur = head;
            for (int i = 0; i < index; i++) cur = cur.next;
            return cur.data;
        }

        /** O(n): linear scan following next pointers. */
        int indexOf(E value) {
            int i = 0;
            for (Node<E> cur = head; cur != null; cur = cur.next, i++)
                if (java.util.Objects.equals(cur.data, value)) return i;
            return -1;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            for (Node<E> cur = head; cur != null; cur = cur.next)
                sb.append(cur.data).append(cur.next == null ? "" : " -> ");
            return sb.append("]").toString();
        }
    }

    /* ---------------- Doubly linked list ---------------- */
    static class DoublyLinkedList<E> {
        static class Node<E> {
            E data;
            Node<E> prev, next;
            Node(E data) { this.data = data; }
        }

        private Node<E> head, tail;
        private int size;

        int size() { return size; }

        /** O(1): wire BOTH directions. */
        void addFirst(E value) {
            Node<E> n = new Node<>(value);
            n.next = head;
            if (head != null) head.prev = n; else tail = n;
            head = n;
            size++;
        }

        /** O(1): wire BOTH directions at the back. */
        void addLast(E value) {
            Node<E> n = new Node<>(value);
            n.prev = tail;
            if (tail != null) tail.next = n; else head = n;
            tail = n;
            size++;
        }

        /** O(1). */
        E removeFirst() {
            if (head == null) throw new java.util.NoSuchElementException();
            E old = head.data;
            head = head.next;
            if (head != null) head.prev = null; else tail = null;
            size--;
            return old;
        }

        /** O(1) ONLY in a doubly list with a tail pointer.
         *  In a singly list, removing the tail needs the node BEFORE it,
         *  which requires walking from the head -> O(n). */
        E removeLast() {
            if (tail == null) throw new java.util.NoSuchElementException();
            E old = tail.data;
            tail = tail.prev;
            if (tail != null) tail.next = null; else head = null;
            size--;
            return old;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            for (Node<E> cur = head; cur != null; cur = cur.next)
                sb.append(cur.data).append(cur.next == null ? "" : " <-> ");
            return sb.append("]").toString();
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.addLast("B");
        list.addLast("C");
        list.addFirst("A");
        System.out.println("singly           : " + list);        // [A -> B -> C]
        System.out.println("get(2) O(n) walk : " + list.get(2)); // C
        System.out.println("indexOf(B)       : " + list.indexOf("B"));
        System.out.println("removeFirst      : " + list.removeFirst());
        System.out.println("after removal    : " + list);

        DoublyLinkedList<Integer> dbl = new DoublyLinkedList<>();
        dbl.addLast(2);
        dbl.addFirst(1);
        dbl.addLast(3);
        System.out.println("\ndoubly           : " + dbl);        // [1 <-> 2 <-> 3]
        System.out.println("removeLast O(1)  : " + dbl.removeLast());  // 3
        System.out.println("removeFirst O(1) : " + dbl.removeFirst()); // 1
        System.out.println("after removals   : " + dbl);
    }
}
