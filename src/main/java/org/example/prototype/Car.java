package org.example.prototype;

public class Car{
    private Integer id;
    private String model;
    private Double price;

    public Car(Integer id, String model, Double price){
        this.id = id;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
