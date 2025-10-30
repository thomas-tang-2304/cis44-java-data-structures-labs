package polygon;

public abstract class Triangle implements Polygon {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
   
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getBase() {
        return sideA;
    }

    @Override
    public double area() {
        double s = (sideA + sideB + sideC) / 2; // semi perimeter
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)); 
        // We should use Heron's formula for all general triangles
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
    
}