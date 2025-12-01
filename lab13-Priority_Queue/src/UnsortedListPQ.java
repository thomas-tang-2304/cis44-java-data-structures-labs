import java.util.Iterator;
import java.util.LinkedList;
// --- 3. Implementation 1: Unsorted List (LinkedList) ---
// Insert: O(1) | RemoveMin: O(n)
class UnsortedListPQ<K extends Comparable<K>, V> implements PriorityQueue<K, V> {
    private LinkedList<MyEntry<K, V>> list = new LinkedList<>();

    public boolean isEmpty() { return list.isEmpty(); }

    public void insert(K key, V value) {
        list.addLast(new MyEntry<>(key, value)); // O(1)
    }

    public MyEntry<K, V> min() {
        if (isEmpty()) return null;
        MyEntry<K, V> minEntry = list.getFirst();
        for (MyEntry<K, V> entry : list) {
            if (entry.compareTo(minEntry) < 0) {
                minEntry = entry;
            }
        }
        return minEntry;
    }

    public MyEntry<K, V> removeMin() {
        if (isEmpty()) return null;
        // TODO: Find the minimum Entry by key
        MyEntry<K, V> minEntry = min(); 

        Iterator<MyEntry<K, V>> current = list.iterator();

        while (current.hasNext()) {
            MyEntry<K, V> entry = current.next();
            if (entry.getKey().compareTo(minEntry.getKey()) < 0) {
                minEntry = entry;

            }
        }
        
        // TODO: Remove the min Entry from the list (This is also O(n) for LinkedList)
        list.remove(minEntry); 
        return minEntry; 
    }

    public void print() {
        Iterator<MyEntry<K, V>> current = list.iterator();

        while (current.hasNext()) {
            System.out.println(current.next() + " - ");
           
        }
    }
}