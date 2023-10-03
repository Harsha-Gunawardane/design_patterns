package org.example;

public class RichCustomer extends Customer{
    @Override
    public void giveTip(){
        System.out.println("Give 5$ as tip");
    }
}
