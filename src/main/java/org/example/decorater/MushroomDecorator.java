package org.example.decorater;

public class MushroomDecorator extends PizzaDecorator{

    public MushroomDecorator(Pizza pizza){
        super(pizza);
    }
    public String bake(){
        return pizza.bake() + addMushroom();
    }

    public String addMushroom(){
        return "with adding mushroom";
    }
}
