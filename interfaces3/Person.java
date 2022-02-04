package com.bitspedia.interfaces3;

public class Person implements Walkable {
    String name;

    @Override
    public void walk() {
        System.out.println("Human is walking. ");
    }

}