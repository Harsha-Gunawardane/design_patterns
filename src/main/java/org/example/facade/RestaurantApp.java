package org.example.facade;

public class RestaurantApp {
    static private final Restaurant restaurant = new Restaurant();
    static private final DeliveryTeam deliveryTeam = new DeliveryTeam();

    public void placeOrder(){
        restaurant.placeOrder();
        deliveryTeam.assignDeliveryBoy();
    }
}
