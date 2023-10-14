package org.example.decorater;

public class BasePizza implements Pizza{

    @Override
    public String bake(){
        return "Bake pizza ";
    }
}
