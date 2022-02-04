package com.bitspedia.inheritance2;

public class PainterTest {

    public static void main(String[] args) {

        Painter painter = new Painter();
        Rectangle rectangle = new Rectangle(3, 5);
        double cost = painter.estimatePaintingCost(rectangle);
        System.out.println("Cost = " + cost);

        Circle cirle = new Circle(3);
        double cost2 = painter.estimatePaintingCost(cirle);
        System.out.println(cost2);

        Triangle triangle = new Triangle(3,5);
        double cost3 = painter.estimatePaintingCost(triangle);
        System.out.println( cost3);

    }
}
