package org.example.adapter;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private String  wareHouseName;
    private List<Item> items;

    public Warehouse(String wareHouseName){
        this.wareHouseName = wareHouseName;
        items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void showItems(){
        String itemsString = "";

        for(Item item : items){
            itemsString += item.showItem();
        }
        System.out.println(itemsString);
    }
}
