package org.example.abstractFactory;

import static org.example.abstractFactory.EngineFactory.getEngine;
import static org.example.abstractFactory.WheelFactory.getWheel;

public class LuxuryCar extends Car{

    protected LuxuryCar(){
        wheel = getWheel("Luxury");
        engine = getEngine("Luxury");
    }

    @Override
    public void use(){
        System.out.println("I use this car for my business purpose");
    }
}
