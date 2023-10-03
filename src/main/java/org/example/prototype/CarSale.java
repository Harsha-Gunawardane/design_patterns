package org.example.prototype;

import java.util.ArrayList;
import java.util.List;

public class CarSale implements Cloneable{

    private String carSaleName;
    private List<Car> cars;

    public CarSale(){}
    public CarSale(String carSaleName){
        this.carSaleName = carSaleName;
        this.cars = new ArrayList<>();
    }

    public void setCarSaleName(String name){
        carSaleName = name;
    }

    private void addNewCar(Car car){
        cars.add(car);
    }

    public void getCars(){

        for(int i =0; i < 5; i++){
            Car newCar = new Car(i, "Ferrari-" + i, 1200D);
            this.addNewCar(newCar);
        }
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public void showCars() {

        String carDetails = "";
        for(Car car : cars){
            carDetails += car.toString() + "\n";
        }

        String result = "CarSale{" +
                "carSaleName='" + carSaleName + '\'' +
                ", cars=" + carDetails +
                '}';

        System.out.println(result);
    }
}
