package org.example.composite;

public class SoftwareEngineer implements Employee{
    private String name;
    private Double salary;

    public SoftwareEngineer(String name, Double salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void work(){
        System.out.println("I am writing code");
    }
    @Override
    public void getInfo(){
        System.out.println("My name is " + name + " and my salary is " + salary);
    }
}
