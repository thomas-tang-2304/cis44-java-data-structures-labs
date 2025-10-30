package polygon;

public class Octagon extends Hexagon {
    private double sideG;
    private double sideH;

    public Octagon(double sideA, double sideB, double sideC, double sideD, double sideE, double sideF, double sideG, double sideH) {
        super(sideA, sideB, sideC, sideD, sideE, sideF); // height and base are not used in perimeter calculation
        this.sideH = sideH;
        this.sideG = sideG;
    }

    @Override
    public double perimeter() {
        return super.perimeter() + sideH + sideG;
    }
    
}
