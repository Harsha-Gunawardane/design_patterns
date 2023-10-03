package org.example.abstractFactory;


public class CarFactory {
    public CarFactory(){}

    public static Car getCar(String type){
        Car car = null;

        if("Sport".equals(type))
            car = new SportCar();
        else if("Luxury".equals(type))
            car = new LuxuryCar();

        return car;
    }
}
