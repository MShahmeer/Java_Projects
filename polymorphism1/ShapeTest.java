package com.bitspedia.polymorphism1;

import com.bitspedia.inheritance2.Circle;
import com.bitspedia.inheritance2.Rectangle;
import com.bitspedia.inheritance2.Shape;

public class ShapeTest {
    public static void main(String[] args) {

        Shape shapes[] = new Shape[3];
        shapes[0] = new Rectangle(2, 3);
        shapes[1] = new Circle(2);
        shapes[2] = new Rectangle(4, 2);

        double totalArea = 0;
        for(Shape shape : shapes){
            System.out.println(shape.calculateArea());
            totalArea += shape.calculateArea();
        }
        System.out.println("Total Area: " + Math.round(totalArea));

    }
}