package com.bitspedia.polymorphism2;

import com.bitspedia.inheritance2.Circle;
import com.bitspedia.inheritance2.Rectangle;
import com.bitspedia.inheritance2.Shape;

public class PainterTest {

    public static void main(String[] args) {
        Painter painter = new Painter();

        Rectangle rectangle = new Rectangle(3, 4);
        Circle circle = new Circle(5);

        System.out.println(painter.calculatePaintingCost(rectangle));
        System.out.println(painter.calculatePaintingCost(circle));
    }

    public void printShapeAttrs(Shape shape) {

        if (shape instanceof Rectangle) {
            System.out.println("shape is instance of Rectangle type");
            Rectangle rectangle = (Rectangle) shape;
            System.out.println("Width : " + rectangle.getWidth());
            System.out.println("Length : " + rectangle.getLength());
        }

        if (shape instanceof Circle) {
            System.out.println("shape is instance of Circle type");
            Circle circle = (Circle) shape;
            System.out.println("Radius : " + circle.getRadius());
        }
    }
}

