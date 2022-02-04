package com.bitspedia.inheritance2;

public class Painter {

    static int RATE = 50;

    public double estimatePaintingCost(Shape shape){
        double cost = RATE * shape.calculateArea();
        return cost;
    }


}
