package SolidPrinciples;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Area_Calculator areaCalculator = new Area_Calculator();
        Circles circles = new Circles(20);
        Square square = new Square(10);
        List<Object> shapes = List.of(circles, square);
        int sum = areaCalculator.sum(shapes);
        System.out.println("sum = " + " " + sum);

    }
}