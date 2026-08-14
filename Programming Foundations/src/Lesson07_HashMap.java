import java.util.ArrayList;
import java.util.Objects;

/**
 * =====================================================================
 *  LESSON 07 — HASHMAP / HASH TABLE
 * =====================================================================
 *
 * A hash map stores KEY-VALUE pairs with O(1) AVERAGE put/get/remove.
 *
 * HOW IT WORKS (the classic exam explanation):
 *   1. The KEY's hashCode() produces an int.
 *   2. The map converts it to a BUCKET index:  index = hash % capacity
 *   3. The pair is stored in that bucket.
 *
 * COLLISION = two different keys land in the SAME bucket.
 * Resolution strategies (know both):
 *   - CHAINING: each bucket holds a small LIST of entries
 *     (this is what java.util.HashMap does).
 *   - OPEN ADDRESSING: on collision, probe for the NEXT free slot
 *     (used by Java's ThreadLocalMap, Python's dict).
 *
 * LOAD FACTOR = size / capacity. When it exceeds a threshold (0.75
 * in Java) the table RESIZES (x2) and every entry is REHASHED into
 * its new bucket -> that resize costs O(n), just like ArrayList.
 *
 * COMPLEXITY:
 *   put / get / remove / containsKey : O(1) AVERAGE, O(n) WORST CASE
 *   (worst case = terrible hash function puts everything in ONE bucket,
 *    so the map degenerates into a linked-list scan).
 *
 * IMPORTANT FACTS:
 *   - HashMap does NOT guarantee any order. (LinkedHashMap keeps
 *     insertion order; TreeMap keeps keys sorted.)
 *   - A key class MUST override BOTH equals() AND hashCode(), and
 *     equal objects MUST return equal hash codes. Otherwise put and
 *     get will use different buckets and "lose" your data.
 */
public class Lesson07_HashMap {

    /** A tiny HashMap using CHAINING — exactly the core idea. */
    static class MyHashMap<K, V> {
        static class Entry<K, V> {
            K key; V value; Entry<K, V> next;   // next entry in the chain
            Entry(K key, V value) { this.key = key; this.value = value; }
        }

        private Entry<K, V>[] buckets;
        private int size;
        private static final double LOAD_FACTOR_LIMIT = 0.75;

        @SuppressWarnings("unchecked")
        MyHashMap() { buckets = new Entry[4]; }

        /** Step 1+2: hash code -> bucket index. */
        private int bucketIndex(K key) {
            int hash = key.hashCode();
            return (hash & 0x7fffffff) % buckets.length;  // non-negative, in range
        }

        /** O(1) average: hash -> bucket -> short chain scan. */
        void put(K key, V value) {
            int i = bucketIndex(key);
            for (Entry<K, V> e = buckets[i]; e != null; e = e.next) {
                if (e.key.equals(key)) { e.value = value; return; } // update existing
            }
            Entry<K, V> fresh = new Entry<>(key, value);   // new entry goes to...
            fresh.next = buckets[i];                       // ...the FRONT of the chain
            buckets[i] = fresh;
            size++;
            if ((double) size / buckets.length > LOAD_FACTOR_LIMIT) rehash();
        }

        /** O(1) average. */
        V get(K key) {
            for (Entry<K, V> e = buckets[bucketIndex(key)]; e != null; e = e.next)
                if (e.key.equals(key)) return e.value;
            return null;   // not found
        }

        /** O(1) average. */
        boolean containsKey(K key) { return get(key) != null; }

        /** O(1) average: unlink the entry from its chain. */
        V remove(K key) {
            int i = bucketIndex(key);
            Entry<K, V> prev = null;
            for (Entry<K, V> e = buckets[i]; e != null; prev = e, e = e.next) {
                if (e.key.equals(key)) {
                    if (prev == null) buckets[i] = e.next; else prev.next = e.next;
                    size--;
                    return e.value;
                }
            }
            return null;
        }

        /** Resize x2 and move EVERY entry to its new bucket: O(n). */
        @SuppressWarnings("unchecked")
        private void rehash() {
            Entry<K, V>[] old = buckets;
            buckets = new Entry[old.length * 2];
            size = 0;
            for (Entry<K, V> head : old)
                for (Entry<K, V> e = head; e != null; e = e.next)
                    put(e.key, e.value);
        }

        int size() { return size; }
    }

    /** WHY equals + hashCode matter — a key class done RIGHT. */
    static class Student {
        final String name;
        final int id;
        Student(String name, int id) { this.name = name; this.id = id; }

        @Override
        public boolean equals(Object o) {          // logical equality
            if (!(o instanceof Student)) return false;
            Student s = (Student) o;
            return id == s.id && Objects.equals(name, s.name);
        }

        @Override
        public int hashCode() {                    // MUST match equals()!
            return Objects.hash(name, id);
        }
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("Alice", 85);
        map.put("Bob", 72);
        map.put("Carol", 91);
        map.put("Dave", 68);      // triggers rehash (load factor > 0.75)
        System.out.println("get(Bob)      = " + map.get("Bob"));      // 72
        System.out.println("contains(Carol)? " + map.containsKey("Carol"));
        map.put("Bob", 80);       // same key -> UPDATE, not a duplicate
        System.out.println("update Bob    = " + map.get("Bob"));       // 80
        System.out.println("remove(Alice) = " + map.remove("Alice"));  // 85
        System.out.println("size          = " + map.size());

        System.out.println("\nWith proper equals/hashCode, two SEPARATE objects");
        System.out.println("that are LOGICALLY equal still hit the same bucket:");
        java.util.HashMap<Student, String> jdk = new java.util.HashMap<>();
        jdk.put(new Student("Lee", 101), "pass");
        System.out.println("  lookup with NEW object -> "
                + jdk.get(new Student("Lee", 101)));   // "pass"

        System.out.println("\nNote: HashMap iteration order is NOT sorted:");
        java.util.HashMap<String, Integer> demo = new java.util.HashMap<>();
        demo.put("b", 2); demo.put("a", 1); demo.put("c", 3);
        demo.forEach((k, v) -> System.out.println("  " + k + "=" + v));
    }
}
