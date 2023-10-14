package org.example.composite;

public class MLEngineer implements Employee{
    private String name;
    private Double salary;

    public MLEngineer(String name, Double salary){
        this.name = name;
        this.salary = salary;
    }
    @Override
    public void getInfo(){
        System.out.println("My name is " + name + " and my salary is " + salary);
    }
    @Override
    public void work(){
        System.out.println("I am developing a ML model");
    }
}
