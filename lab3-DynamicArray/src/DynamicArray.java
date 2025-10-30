// import java.util.ArrayList;

public class DynamicArray<T> {
    private T[] data;
    private int size = 0;
    private static final int INITIAL_CAPACITY = 10;
    
        @SuppressWarnings("unchecked") // Suppress the unchecked cast warning
    
        public DynamicArray(int capacity) {
            data = (T[]) new Object[capacity];
            // size = 0;
        }
    
        public void add(T element) {
            if (size == data.length) {
                resize(element);
            }
            data[size++] = element;
    
        }
    
        public T get(int index) throws IndexOutOfBoundsException {
            if (index < 0 || index > size - 1) {
                throw new IndexOutOfBoundsException("Index " + index + " out of bounds");
            }
            return data[index];
    
    
        }
    
        public T remove(int index) throws IndexOutOfBoundsException {
            if (index < 0 || index > size - 1) {
                throw new IndexOutOfBoundsException("Index " + index + " out of bounds");
            }
            
            T removedElement = null;
            for (int i = 0; i < size - 1; i++) {
                if (i >= index) {
                    if (i == index){
                        removedElement = data[i];
                    }
                    data[i] = data[i+1];
                    
                } 
            }
            size--;
            return removedElement;
    
    
        }
    
        public int size() {
            return size;
        }
    
    
    
        public void resize(T element) {
            
            T[] newData = (T[]) new Object[size * 2];

            for (int i = 0; i < size-1; i++) {
                    
                newData[i] = data[i+1];
                    
            }
            newData[size] = element;
            data= newData;
        }

    // public static void main(String[] args) throws Exception {
    //     // Example usage of DynamicArray
    //     DynamicArray<Integer> dynamicArray = new DynamicArray<>(INITIAL_CAPACITY);
    // }
}
