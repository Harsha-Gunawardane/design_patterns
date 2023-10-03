package org.example.adapter;

public class GroceryItemAdapter implements Item{
    private GroceryItem groceryItem;

    public GroceryItemAdapter(GroceryItem groceryItem){
        this.groceryItem = groceryItem;
    }

    @Override
    public String getItemName(){
        return groceryItem.getItemName();
    }
    @Override
    public Double getPrice(){
        return groceryItem.getPrice();
    }
    @Override
    public String getRestaurantName(){
        return groceryItem.getGroceryShop();
    }

    @Override
    public String showItem(){
        return groceryItem.showItem();
    }

}
