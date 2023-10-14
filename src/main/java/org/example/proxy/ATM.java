package org.example.proxy;

public class ATM implements Account{
    private static final Bank bank = new Bank();

    @Override
    public void deposit(Integer amount){
        bank.deposit(amount);
    }
    @Override
    public void withdraw(Integer amount){
        bank.withdraw(amount);
    }
}
