public class Main {
    public static void main(String[] args) throws Exception {
        int rows = 3;
        int cols = 3;

        Matrix matrixA = new Matrix(rows, cols);
        Matrix matrixB = new Matrix(rows, cols);

        matrixA.populateRandom();
        matrixB.populateRandom();

        System.out.println("Matrix A:");
        System.out.println(matrixA);
        System.out.println("Matrix B:");
        System.out.println(matrixB);
        
        Matrix sum = matrixA.add(matrixB);
        System.out.println("Sum of A and B:");
        System.out.println(sum.toString());
        
        Matrix product = matrixA.multiply(matrixB);
        System.out.println("Element-wise Product of A and B:");
        System.out.println(product.toString());
    }
}
