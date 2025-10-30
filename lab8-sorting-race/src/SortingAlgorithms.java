public class SortingAlgorithms {

    /**
     * Implements the Selection Sort algorithm.
     * Theoretical Complexity: O(n^2)
     */
    public static void selectionSort(int[] arr) {
        // TODO: Implement the Selection Sort algorithm.
        if (!(arr == null || arr.length <= 1)) {

            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }

    }

    /**
     * Implements the Insertion Sort algorithm.
     * Theoretical Complexity: O(n^2) / Best-Case: O(n)
     */
    public static void insertionSort(int[] arr) {
        // TODO: Implement the Insertion Sort algorithm.
        if (!(arr == null || arr.length <= 1)) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    for (int j = i + 1; j >= 1; j--) {
                        if (arr[j] < arr[j - 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j - 1];
                            arr[j - 1] = temp;
                        }
                    }
                }
            }
        }
    }

    /**
     * Implements the Merge Sort algorithm. Public-facing method.
     * Theoretical Complexity: O(n log n)
     */
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Already sorted
        }
        int[] temp = new int[arr.length];
        mergeSortRecursive(arr, temp, 0, arr.length - 1);
    }

    private static void mergeSortRecursive(int[] arr, int[] temp, int left, int right) {
        // TODO: Implement the recursive logic for Merge Sort.
        // only call recursion when right index is larger than left index
        if (right > left) {
            int mid = (left + (right - 1)) / 2;
            // System.out.println(left + " - " + right);
            mergeSortRecursive(arr, temp, left, mid);
            mergeSortRecursive(arr, temp, mid + 1, right);

            
            merge(arr, temp, left, mid, right);
        } 
    }

    private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        // TODO: Implement the merge logic for Merge Sort.
            
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int L[] = new int[n1]; // initialize Left array
        int R[] = new int[n2];  // initialize Right array

        // Populate left array 
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + 1]; 
        }
         // Populate right array 
        for (int i = 0; i < n2; i++) {
            R[i] = arr[mid + 1 + i];
        }

        // sort each subarray using insertion sort
        insertionSort(L);
        insertionSort(R);

        // Populate half of main array with left array 
        for (int i = 0; i < n1; i++) {
            arr[left + 1] = L[i];
        }

         // Populate remaining main array with right array 
        for (int i = 0; i < n2; i++) {
            arr[mid + 1 + i] = R[i];
        }
        // Finally, sort the main array using insertion sort
        insertionSort(arr);
    }

    public static void main (String args[]) {
        int[] array = SortingTester.generateSortedArray(10);
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
