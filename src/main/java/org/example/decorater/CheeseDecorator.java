package org.example.decorater;

public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    public String bake(){
        return pizza.bake() + addCheese();
    }

    public String addCheese(){
        return "with adding cheese";
    }
}
