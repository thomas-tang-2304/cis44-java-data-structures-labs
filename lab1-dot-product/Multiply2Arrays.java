import java.util.Random;

public class Multiply2Arrays {
    // Create Randomly generate numbers to array given
    public static void createRandomNumberToArray(int[] array, int arrayLength) {
        Random randNumber = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randNumber.nextInt(100);
        }
    }

    // main function
    public static void main(String[] args) {
        int arrayLength = 5;
     
        int[] a = new int[arrayLength]; 
        int[] b = new int[arrayLength];
        int[] c = new int[arrayLength];

        // Fill arrays a and b with n random numbers 
        createRandomNumberToArray(a, arrayLength);
        createRandomNumberToArray(b, arrayLength);

        // Print a array
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(a[i] + "\t"); // separate numbers by tab
        }

        System.out.println( "\n-------------------------------------------------- ");
        // Print b array
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(b[i] + "\t"); // separate numbers by tab
        }

        System.out.println( "\n-------------------------------------------------- ");
        // Print c array
        for (int i = 0; i < arrayLength; i++) {
            c[i] = a[i] * b[i];
            System.out.print(c[i] + "\t"); // separate numbers by tab
        }

        System.out.println( "\n-------------------------------------------------- ");
    
    }
}
