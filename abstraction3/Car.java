package com.bitspedia.abstraction3;

public abstract class Car {

    private String make;
    private int modelYear;

    public Car(String make, int modelYear) {
        this.make = make;
        this.modelYear = modelYear;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public abstract void changeGear();
    public abstract void increaseSpeed();
    public abstract void decreaseSpeed();
    public abstract void stopCar();
    public abstract void changeOil();
    public abstract void onFrontLights();
    public abstract void startStopViper();
}