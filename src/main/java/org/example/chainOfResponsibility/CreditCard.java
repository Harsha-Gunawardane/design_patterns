package org.example.chainOfResponsibility;

public class CreditCard extends PaymentMethod{
    @Override
    public void payment(Integer amount){
        if(amount > 2000) {
            next.payment(amount);
        } else {
            System.out.println("Payment is success with credit card");
        }
    }
}
