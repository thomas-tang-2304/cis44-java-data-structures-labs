import polygon.*;
import polygon.special.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Polymorphism in Java");
        
        Triangle triangle = new Triangle(8, 5,5) {};
        System.out.println("Triangle Perimeter: " + triangle.perimeter());
        System.out.println("Triangle Area: " + triangle.area());

        Triangle isoscelesTriangle = new IsoscelesTriangle(8, 5);
        System.out.println("Isosceles Triangle Perimeter: " + isoscelesTriangle.perimeter());
        System.out.println("Isosceles Triangle Area: " + isoscelesTriangle.area());

        Triangle eqTriangle = new EquilateralTriangle(8);
        System.out.println("Equilateral Triangle Perimeter: " + eqTriangle.perimeter());
        System.out.println("Equilateral Triangle Area: " + eqTriangle.area());

        Retangle retangle = new Retangle(8, 6);
        System.out.println("Retangle Perimeter: " + retangle.perimeter());
        System.out.println("Retangle Area: " + retangle.area());

        Square square = new Square(5.5);
        System.out.println("Square Perimeter: " + square.perimeter());
        System.out.println("Square Triangle Area: " + square.area());

        Quadrilateral quadrilateral = new Quadrilateral(7, 7, 2, 5);
        System.out.println("Quadrilateral Perimeter: " + quadrilateral.perimeter());

        Pentagon pentagon = new Pentagon(8,3,6,2.5,7);
        System.out.println("Pentagon Perimeter: " + pentagon.perimeter());

        Hexagon hexagon = new Hexagon(6,4,5,3,7,2);
        System.out.println("Hexagon Perimeter: " + hexagon.perimeter());

        Octagon octagon = new Octagon(4,5,3,6,2,7,8,1);
        System.out.println("Octagon Perimeter: " + octagon.perimeter());


    }
}