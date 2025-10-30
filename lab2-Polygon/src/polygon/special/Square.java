package polygon.special;

public class Square extends Retangle {

    private double side;

    public Square(double side) {
        super(side, side); // Call the constructor of Retangle with equal sides
        this.side = side;
        if (this.side <= 0) {
            throw new IllegalArgumentException("Side length must be positive.");
        }
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public double area() {
        return side * side;
    }
    
}
