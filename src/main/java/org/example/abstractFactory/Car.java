package org.example.abstractFactory;

public abstract class Car {
    public Integer noOfWheels;
    public String modelName;
    public String color;
    public Wheel wheel;
    public Engine engine;

    public void driving(){
        System.out.println("Car is driven by owner");
    }
    public abstract void use();
}
