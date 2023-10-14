package org.example.chainOfResponsibility;

public class Cash extends PaymentMethod{
    @Override
    public void payment(Integer amount){
        if(amount > 1000){
            next.payment(amount);
        } else {
            System.out.println("Payment is success with cash");
        }
    }
}
