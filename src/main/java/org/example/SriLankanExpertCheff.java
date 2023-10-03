package org.example;

public class SriLankanExpertCheff extends SriLankanCheff{

    public SriLankanExpertCheff(String name, Integer age) {
        super(name, age);
    }

    public void makeSpecialDish(String dishName){
        System.out.println("Hey, I am busy with cooking Sri Lankan special dish " + dishName);
    }
}
