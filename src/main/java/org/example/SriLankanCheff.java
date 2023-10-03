package org.example;

public class SriLankanCheff implements Cheff{
    public String name;
    public Integer age;
    private Double salary;

    public SriLankanCheff(){}

    public SriLankanCheff(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    @Override
    public void makeDishes(String dishName){
        System.out.println("Hey, I am busy with cooking Sri Lankan dish " + dishName);
    }
}
