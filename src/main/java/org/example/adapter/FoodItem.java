package org.example.adapter;

public class FoodItem implements Item{

    private String itemName;
    private Double price;
    private String restaurantName;

    public FoodItem(String itemName, Double price, String restaurantName){
        this.itemName = itemName;
        this.restaurantName = restaurantName;
        this.price = price;
    }

    @Override
    public String getItemName(){
        return itemName;
    }

    @Override
    public Double getPrice(){
        return price;
    }
    @Override
    public String getRestaurantName(){
        return restaurantName;
    }

    @Override
    public String showItem(){
        return "\n\tItem name : " + itemName + "\n\tItem price : " + price + "\n\tRestaurant Name : " + restaurantName + "\n";
    }
}
