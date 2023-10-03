package org.example.factory;

public abstract class Car {
    public Integer noOfWheels;
    public String modelName;
    public String color;

    public void driving(){
        System.out.println("Car is driven by owner");
    }
    public abstract void use();
}
