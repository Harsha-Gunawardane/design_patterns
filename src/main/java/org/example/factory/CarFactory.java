package org.example.factory;

public class CarFactory {
    private CarFactory(){}

    public static Car getCar(String type){
        Car car = null;

        if("Sport".equals(type))
            car = new SportCar();
        else if("Luxury".equals(type))
            car = new LuxuryCar();

        return car;
    }
}
