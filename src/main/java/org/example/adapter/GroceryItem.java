package org.example.adapter;

public class GroceryItem {
    private String itemName;
    private Double price;
    private String groceryShop;

    public GroceryItem(String itemName, Double price, String groceryShop){
        this.itemName = itemName;
        this.price = price;
        this.groceryShop = groceryShop;
    }

    public String getItemName(){
        return itemName;
    }
    public Double getPrice(){
        return price;
    }
    public String getGroceryShop(){
        return groceryShop;
    }

    public String showItem(){
        return "\n\tItem name : " + itemName + "\n\tItem price : " + price + "\n\tGrocery Name : " + groceryShop + "\n";
    }
}
