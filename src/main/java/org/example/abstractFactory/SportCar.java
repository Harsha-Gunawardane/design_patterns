package org.example.abstractFactory;

import static org.example.abstractFactory.EngineFactory.getEngine;
import static org.example.abstractFactory.WheelFactory.getWheel;

public class SportCar extends Car{

    protected SportCar(){
        wheel = getWheel("Sport");
        engine = getEngine("Sport");
    }

    @Override
    public void use(){
        System.out.println("I am use this car for my hobby");
    }
}
