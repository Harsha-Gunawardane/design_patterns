package org.example.facade;

public class DeliveryTeam {
    public void assignDeliveryBoy(){
        System.out.println("We assigned a delivery boy");

        new DeliveryBoy().deliver();
    }
}
