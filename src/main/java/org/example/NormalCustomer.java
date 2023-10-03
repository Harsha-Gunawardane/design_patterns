package org.example;

public class NormalCustomer extends Customer{
    @Override
    public void giveTip(){
        System.out.println("Give 5 rupees as tip");
    }
}
