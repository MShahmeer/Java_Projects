package com.bitspedia.polymorphism2;

import com.bitspedia.inheritance2.*;

public class Painter {

    final static int RATE = 50;

    public double calculatePaintingCost(Shape shape) {
        return shape.calculateArea() * RATE;
    }

}
