import java.util.LinkedList;
// --- 4. Implementation 2: Sorted List (LinkedList) ---
// Insert: O(n) | RemoveMin: O(1)
class SortedListPQ<K extends Comparable<K>, V> implements PriorityQueue<K, V> {
    private LinkedList<MyEntry<K, V>> list = new LinkedList<>();

    public boolean isEmpty() { return list.isEmpty(); }

    public void insert(K key, V value) {
        MyEntry<K, V> newEntry = new MyEntry<>(key, value);
        // TODO: Find the correct insertion point to maintain sorted order by key (O(n))
        // Hint: Iterate and use list.add(index, newEntry) when list.get(index) > newEntry
        for (MyEntry<K, V> entry : list) {
            if (newEntry.compareTo(entry) < 0) {
                int index = list.indexOf(entry);
                list.add(index, newEntry);
                return;
            }
        }
        
        // Default insert at end if it's the largest
        list.addLast(newEntry);
    }

    public MyEntry<K, V> min() {
        return isEmpty() ? null : list.getFirst(); // O(1)
    }

    public MyEntry<K, V> removeMin() {
        return isEmpty() ? null : list.removeFirst(); // O(1)
    }
    public void print() {
        for (MyEntry<K, V> entry : list) {
            System.out.println(entry + " - ");
        }
    }
}
