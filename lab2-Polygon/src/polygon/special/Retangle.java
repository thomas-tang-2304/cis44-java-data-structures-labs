package polygon.special;

import polygon.Quadrilateral;

public class Retangle extends Quadrilateral {

    private double width;
    private double height;

    public Retangle(double width, double height) {
        super(width, height, width, height); // height and base are not used in perimeter calculation
        this.width = width;
        this.height = height;   
    }


    @Override
    public double perimeter() {
        return width * 2 + height * 2;
    }
    public double area() {
        return width * height;
    }
    
}