package org.example.proxy;

public class Bank implements Account{
    @Override
    public void deposit(Integer amount){
        System.out.println("Successfully deposit your amount " + amount);
    }
    @Override
    public void withdraw(Integer amount){
        System.out.println("Successfully withdraw " + amount);
    }
}
