package polygon.special;
import polygon.Triangle;

public class IsoscelesTriangle extends Triangle {
    private double leg;
    private double base;
    public IsoscelesTriangle(double sideA, double leg) {
        super(sideA, 0.0,0.0);
        this.base = sideA;
        this.leg = leg;
        if (leg * 2 <= base) {
            throw new IllegalArgumentException("Invalid dimensions for an isosceles triangle.");
        } 
        
    }


    @Override
    public double perimeter() {
        return leg * 2 + getBase();
    }

    @Override
    public double area() {
        return Math.sqrt(Math.pow(leg, 2) - Math.pow(getBase() / 2, 2)) * getBase() / 2 ;
    }
   
}