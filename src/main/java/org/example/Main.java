package org.example;


import org.example.abstractFactory.Car;
import org.example.adapter.*;
import org.example.builder.Burger;
import org.example.deepCopyPrototype.BookShop;
import org.example.prototype.CarSale;

import static org.example.abstractFactory.CarFactory.getCar;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cheff cheff = getCheff("SriLankan");
        SriLankanExpertCheff sriLankanExpertCheff = new SriLankanExpertCheff("Gunwardane", 32);

        if (cheff != null)
            cheff.makeDishes("Polos");

        sriLankanExpertCheff.makeSpecialDish("Kos");

        Feedback feedback = new Feedback();
        feedback.sendFeedback("Dish is marvolues ");

        Customer normalCustomer = new NormalCustomer();
        Customer richCustomer = new RichCustomer();

        giveTip(normalCustomer);
        giveTip(richCustomer);

        System.out.println("\n\n---------------------------\n\n");

        Car car = getCar("Sport");

        System.out.println("\n\n---------------------------\n\n");

        Burger burger = new Burger.builder().bun().meat().cheese().build();
        Burger vegBurger = new Burger.builder().bun().cheese().build();

        burger.getBurger();
        vegBurger.getBurger();

        System.out.println("\n\n---------------------------\n\n");

        CarSale carSale1 = new CarSale("Harsha Car Sale");
        carSale1.getCars();
        carSale1.showCars();

        CarSale carSale2 = (CarSale) carSale1.clone();
        carSale2.setCarSaleName("Lahiru Car Sale");
        carSale2.showCars();

        System.out.println("\n\n---------------------------\n\n");

        BookShop bookShop1 = new BookShop("Martin Sir's Shop");
        bookShop1.getBooks();

        BookShop bookShop2 = bookShop1.clone();
        bookShop2.setShopName("J.K.Rolling's Shop");

        bookShop1.removeBook(2);

        bookShop1.showBooks();
        bookShop2.showBooks();

        System.out.println("\n\n---------------------------\n\n");

        Item submarine = new FoodItem("Submarine", 120D, "Dinemore");
        Item pizza = new FoodItem("Pizza", 100D, "Pizza Hut");

        Warehouse nugegodaWarehouse = new Warehouse("Nugegoda");
        nugegodaWarehouse.addItem(submarine);
        nugegodaWarehouse.addItem(pizza);

        GroceryItem groceryItem = new GroceryItem("Sugar", 50D, "Keels");
        nugegodaWarehouse.addItem(new GroceryItemAdapter(groceryItem));

        nugegodaWarehouse.showItems();

    }

    public static void giveTip(Customer customer){
        customer.giveTip();
    }

    public static Cheff getCheff( String type) {
        if ("SriLankan".equals(type)) {
            return new SriLankanCheff("Harsha", 24);
        } else if("Chinese".equals(type)) {
            return new ChineseCheff("Chathura", 23);
        }

        return null;
    }
}