package polygon.special;

public class EquilateralTriangle extends IsoscelesTriangle {

    private double side;

    public EquilateralTriangle(double side) {
        super(side, side);
        
        this.side = side;
        if (this.side <= 0) {
            throw new IllegalArgumentException("Side length must be positive.");
        }
    }

    // use the same calculation of perimeter and area formulars as isosceles triangle 
    
}