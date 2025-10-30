package polygon;

public class Hexagon extends Pentagon {
    private double sideF;

    public Hexagon(double sideA, double sideB, double sideC, double sideD, double sideE, double sideF) {
        super(sideA, sideB, sideC , sideD, sideE); // height and base are not used in perimeter calculation
        this.sideF = sideF;
    }

    @Override
    public double perimeter() {
        return super.perimeter() + sideF;
    }
    
}
