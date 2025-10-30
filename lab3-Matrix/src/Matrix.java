public class Matrix {

    private int rows;
    private int cols;
    private int[][] data;


    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new int[rows][cols];
    }
    public Matrix(int[][] data) {
        this.data = data;
    }
    public void populateRandom() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = (int) (Math.random() * 99);
            }
        }
    }
    public Matrix add(Matrix other) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] += other.data[i][j];
            }
        }
        return this;
    }

    public Matrix multiply(Matrix other) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] *= other.data[i][j];
            }
        }
        return this;
    }
    @Override 
    public String toString() {
        String matrix = "";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix += data[i][j] + "\t";
            }
            matrix += "\n";
        }
        return matrix;
    }
}
