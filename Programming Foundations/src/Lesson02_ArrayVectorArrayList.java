import java.util.Arrays;

/**
 * =====================================================================
 *  LESSON 02 — ARRAY / VECTOR / ARRAYLIST (dynamic arrays)
 * =====================================================================
 *
 * An array stores elements in CONTIGUOUS (back-to-back) memory.
 * Because of that, the address of element i is computed instantly:
 *     address(i) = base + i * elementSize      -> RANDOM ACCESS O(1)
 *
 * OPERATION COMPLEXITY (memorise):
 *   get(i) / set(i)          O(1)   direct index math
 *   search (indexOf)         O(n)   must scan one by one
 *   insert at front/middle   O(n)   must SHIFT elements right
 *   delete at front/middle   O(n)   must SHIFT elements left
 *   append at end            O(1) AMORTIZED (see Lesson 01)
 *
 * SIZE vs CAPACITY:
 *   size     = how many elements are actually stored
 *   capacity = how many elements fit before the next resize
 *
 * STATIC vs DYNAMIC array:
 *   static  (int[] a = new int[10])  — fixed length forever
 *   dynamic (ArrayList / Vector)     — grows automatically (x2 here)
 *
 * PROS: O(1) random access, great cache locality, no pointer overhead.
 * CONS: O(n) insert/delete in the middle, resizing copies everything.
 */
public class Lesson02_ArrayVectorArrayList {

    /** A tiny dynamic array — the same idea as java.util.ArrayList. */
    static class MyArrayList<E> {
        private Object[] data;   // underlying CONTIGUOUS array
        private int size;        // elements stored (NOT data.length!)

        MyArrayList()             { this(4); }
        MyArrayList(int capacity) { data = new Object[capacity]; }

        int size()     { return size; }
        int capacity() { return data.length; }

        /** O(1): direct index access — the superpower of arrays. */
        @SuppressWarnings("unchecked")
        E get(int index) {
            checkIndex(index);
            return (E) data[index];
        }

        /** O(1): same direct access for writing. */
        void set(int index, E value) {
            checkIndex(index);
            data[index] = value;
        }

        /** O(1) AMORTIZED append. Only when full do we pay O(n) to grow. */
        void add(E value) {
            if (size == data.length) grow();
            data[size++] = value;
        }

        /** O(n): make room by shifting data[index..] ONE SLOT RIGHT. */
        void add(int index, E value) {
            if (index < 0 || index > size)
                throw new IndexOutOfBoundsException("index " + index);
            if (size == data.length) grow();
            System.arraycopy(data, index, data, index + 1, size - index);
            data[index] = value;
            size++;
        }

        /** O(n): close the gap by shifting data[index+1..] ONE SLOT LEFT. */
        @SuppressWarnings("unchecked")
        E remove(int index) {
            checkIndex(index);
            E old = (E) data[index];
            System.arraycopy(data, index + 1, data, index, size - index - 1);
            data[--size] = null;   // let garbage collection reclaim the object
            return old;
        }

        /** O(n): arrays have no magic — search is a linear scan. */
        int indexOf(Object value) {
            for (int i = 0; i < size; i++)
                if (java.util.Objects.equals(data[i], value)) return i;
            return -1;
        }

        /** The expensive part: copy everything into an array TWICE as big. */
        private void grow() {
            data = Arrays.copyOf(data, data.length * 2);
        }

        private void checkIndex(int i) {
            if (i < 0 || i >= size)
                throw new IndexOutOfBoundsException("index " + i + ", size " + size);
        }

        @Override
        public String toString() {
            return Arrays.toString(Arrays.copyOf(data, size));
        }
    }

    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();   // starts with capacity 4

        // Append: watch capacity DOUBLE only when the array gets full.
        for (String s : new String[]{"a", "b", "c", "d", "e"}) {
            list.add(s);
            System.out.printf("add %-3s -> size=%d capacity=%d  %s%n",
                    s, list.size(), list.capacity(), list);
        }
        // Adding 'e' triggered the resize: capacity 4 -> 8, still 5 elements.

        System.out.println("\nget(1)     = " + list.get(1));          // O(1)
        System.out.println("indexOf(e) = " + list.indexOf("e"));      // O(n) scan

        list.add(0, "Z");          // front insert: all elements shift right (O(n))
        System.out.println("\nafter add(0, Z) : " + list);

        list.remove(0);            // front delete: everything shifts left (O(n))
        System.out.println("after remove(0) : " + list);

        // The JDK's own dynamic array behaves identically:
        java.util.ArrayList<Integer> jdk = new java.util.ArrayList<>();
        jdk.add(10); jdk.add(20); jdk.set(0, 15);
        System.out.println("\nJDK ArrayList: " + jdk);   // [15, 20]
    }
}
