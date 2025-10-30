// interface Queue { ... }
// class LinkedQueue implements Queue { ... }

import java.util.ArrayList;

public class LinkQueue<T> implements Queue<T> {
    ArrayList<T>queue;

    LinkQueue() {
        this.queue = new ArrayList<T>();
    }
    public void addFirst(T e) {
        queue.add(0, e);
    }
   
    @Override
    public void add(T e) {
        queue.add(e);
    }

    @Override
    public T remove() {
        if (!queue.isEmpty()) {
            return queue.remove(0);
        } else {
            return null;
        }
    }

    @Override
    public T peek() {
        if (!queue.isEmpty()) {
            return queue.get(0);
        } else {
            return null;
        }
    }

   

}