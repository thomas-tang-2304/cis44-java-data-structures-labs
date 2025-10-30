package polygon;


public class Quadrilateral extends Triangle {
    private double sideD;

    public Quadrilateral(double sideA, double sideB, double sideC, double sideD) {
        super(sideA, sideB, sideC ); // height and base are not used in perimeter calculation
        this.sideD = sideD;
        if (this.sideD <= 0 || sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalArgumentException("Sides' length must be positive.");
        }
    }

    @Override
    public double perimeter() {
        return super.perimeter() + sideD;
    }
}
