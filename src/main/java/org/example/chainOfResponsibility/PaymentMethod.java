package org.example.chainOfResponsibility;

public abstract class PaymentMethod {
    protected PaymentMethod next;
    public abstract void payment(Integer amount);

    public void next(PaymentMethod paymentMethod){
        next = paymentMethod;
    }
}
