
package com.bitspedia.inheritance2;

import java.util.ArrayList;
import java.util.Scanner;

public class ShapeTest {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,5);
        Rectangle rectangle2 = new Rectangle(4,5);
        System.out.println(rectangle);
        System.out.println(rectangle2);
    }

    static void m3(){
        Rectangle rectangle = new Rectangle(3,5);
        Rectangle rectangle2 = new Rectangle(4,5);
        Circle circle = new Circle(4);
        Circle circle2 = new Circle(5);
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(rectangle);
        shapes.add(rectangle2);
        shapes.add(circle);
        shapes.add(circle2);
        countEachShapeType(shapes);
    }

    static void m1(Shape shape) {

        if(shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            System.out.println(rectangle.getLength());
        } else if(shape instanceof Circle) {
            Circle circle= (Circle) shape;
            System.out.println(circle.getRadius());
        }
    }

    static void countEachShapeType(ArrayList<Shape> shapes){

        int rectanglesCount = 0;
        int circlesCount = 0;

        for(Shape s : shapes){
            if(s instanceof Rectangle)
                rectanglesCount++;
            else if(s instanceof Circle)
                circlesCount++;
        }
        System.out.println("Rectangles = " + rectanglesCount);
        System.out.println("Circles = " + circlesCount);

    }








    public static void test(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        System.out.println("Enter 1 for Circle and 2 for Rectangle and 3 to exit ");
        int operation = new Scanner(System.in).nextInt();
        do {
            if (operation == 1) {
                System.out.println("Enter the radious: ");
                int radius = new Scanner(System.in).nextInt();
                Shape s = new Circle(radius);
                shapes.add(s);
            } else if (operation == 2) {
                System.out.println("Enter the width and length");
                int width = new Scanner(System.in).nextInt();
                int length = new Scanner(System.in).nextInt();
                Rectangle r = new Rectangle(width, length);
                shapes.add(r);
            } else if (operation == 3) {
                break;
            }
        } while (true);

        //        shapes.add(new Rectangle(3, 6));
        //        shapes.add(new Circle(4));
        //        shapes.add(new Rectangle(5, 10));
        //        shapes.add(new Circle(10));
        //        shapes.add(new Circle(9));
        printData(shapes);
    }

    public static void printData(ArrayList<Shape> shapes) {
        double circlesArea = 0;
        double rectanglesArea = 0;
        int circlesCount = 0;
        int rectanglesCount = 0;


        for (Shape shape : shapes) {

            if (shape instanceof Circle) {
                circlesArea += shape.calculateArea();
                circlesCount++;

            } else if (shape instanceof Rectangle) {
                rectanglesArea += shape.calculateArea();
                rectanglesCount++;
            }
        }
        System.out.println("circlesArea = " + circlesArea);
        System.out.println("rectanglesArea = " + rectanglesArea);
    }
}