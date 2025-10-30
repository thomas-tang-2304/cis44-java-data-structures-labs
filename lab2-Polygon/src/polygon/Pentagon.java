package polygon;

public class Pentagon extends Quadrilateral {
    private double sideE;

    public Pentagon(double sideA, double sideB, double sideC, double sideD, double sideE) {
        super(sideA, sideB, sideC , sideD); // height and base are not used in perimeter calculation
        this.sideE = sideE;
    }

    @Override
    public double perimeter() {
        return super.perimeter() + sideE;
    }
}
