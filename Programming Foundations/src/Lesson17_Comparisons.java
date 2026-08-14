/**
 * =====================================================================
 *  LESSON 17 — VERY IMPORTANT COMPARISONS + MASTER COMPLEXITY TABLE
 * =====================================================================
 *
 * Exam questions love asking "A vs B — which one and why?".
 * Every answer below follows the same formula:
 *   structure -> supported ops -> complexity per op -> when to use it.
 *
 * ---------------------------------------------------------------------
 * 1. ARRAY vs LINKED LIST
 *    random access   : array O(1)  | list O(n)        -> array wins
 *    insert at front : array O(n)  | list O(1)        -> list wins
 *    delete at front : array O(n)  | list O(1)        -> list wins
 *    memory          : array compact | list + pointer overhead
 *    cache locality  : array great (contiguous) | list poor (scattered)
 *    => need index access? array. constant inserts/deletes at ends? list.
 *
 * 2. STACK vs QUEUE
 *    stack = LIFO (undo, DFS, brackets)   push/pop at ONE end
 *    queue = FIFO (BFS, scheduling)       add back, remove front
 *
 * 3. QUEUE vs DEQUE
 *    queue : restricted — add back, remove front only
 *    deque : BOTH ends allow add AND remove (can act as stack OR queue)
 *
 * 4. VECTOR vs DEQUE
 *    vector: O(1) random access; back ops cheap; FRONT ops O(n)
 *    deque : O(1) front AND back ops; index access weaker/none
 *    => random access needed -> vector; frequent front ops -> deque
 *
 * 5. HASHMAP vs BST
 *    lookup   : HashMap O(1) average | balanced BST O(log n)
 *    order    : HashMap NO order      | BST keeps keys SORTED
 *    worst    : HashMap O(n)          | BST stays O(log n) when balanced
 *    ranges   : HashMap cannot        | BST supports range queries
 *    => fast exact lookup -> HashMap; ordered/range queries -> BST
 *
 * 6. HEAP vs BST
 *    heap : fast min/max (O(1) peek, O(log n) extract), NOT sorted
 *    BST  : fully ordered — search any value in O(log n)
 *    => only need min/max repeatedly -> heap; need ordered search -> BST
 *
 * ---------------------------------------------------------------------
 * MASTER TABLE — MEMORISE (footnotes below)
 *
 *  | Structure   | Access | Search | Insert | Delete |
 *  |-------------|--------|--------|--------|--------|
 *  | Array       | O(1)   | O(n)   | O(n)   | O(n)   |
 *  | Vector      | O(1)   | O(n)   | O(n)   | O(n)   |
 *  | Linked List | O(n)   | O(n)   | O(1)*  | O(1)*  |
 *  | Stack       |   —    |   —    | O(1)   | O(1)   |
 *  | Queue       |   —    |   —    | O(1)   | O(1)   |
 *  | Deque       | O(1)   | O(n)   | O(1)   | O(1)   |
 *  | HashMap     |   —    | O(1)** | O(1)** | O(1)** |
 *  | Heap        |   —    | O(n)   | O(log n)| O(log n)|
 *  | BST         | O(log n)*** all four |
 *
 *  *   at a KNOWN node/position
 *  **  AVERAGE case (worst O(n))
 *  *** BALANCED BST (unbalanced worst case O(n))
 * ---------------------------------------------------------------------
 *
 * QUESTION-PATTERN CHEAT SHEET:
 *   "O(1) insert/delete both ends?"            -> Deque
 *   "LIFO?"                                    -> Stack
 *   "FIFO?"                                    -> Queue
 *   "random access?"                           -> Array / Vector / Deque(index)
 *   "requires sorted data?"                    -> Binary Search
 *   "fast min/max?"                            -> Heap / PriorityQueue
 *   "key-value O(1) average?"                  -> HashMap
 *   "ordered keys / range query?"              -> BST (TreeMap)
 *   "DFS?" -> stack/recursion   "BFS?" -> queue
 */
public class Lesson17_Comparisons {

    public static void main(String[] args) {
        // This lesson is THEORY — run the other lessons for the code.
        // Quick self-quiz: cover the right column, guess, then check.
        String[][] quiz = {
            {"Which structure supports O(1) add/remove at BOTH ends?", "Deque"},
            {"Which uses LIFO?", "Stack"},
            {"Which uses FIFO?", "Queue"},
            {"Which supports random access in O(1)?", "Array / Vector"},
            {"Which requires SORTED data?", "Binary search"},
            {"Average O(1) key lookup?", "HashMap"},
            {"O(log n) lookup AND keeps keys sorted?", "Balanced BST (TreeMap)"},
            {"Fast repeated access to the minimum?", "Min-heap / PriorityQueue"},
            {"DFS uses which structure?", "Stack (or recursion)"},
            {"BFS / level-order uses which structure?", "Queue"},
            {"Inserting SORTED data into a BST is worst case...?", "O(n) per op (skewed tree)"},
            {"Why is ArrayList.append O(1) amortized?", "rare O(n) resize averaged over many appends"},
        };
        System.out.println("=== SELF-QUIZ (answer appears after the pause) ===\n");
        for (int i = 0; i < quiz.length; i++) {
            System.out.printf("Q%d: %s%n    A%d: %s%n%n", i + 1, quiz[i][0], i + 1, quiz[i][1]);
        }
    }
}
