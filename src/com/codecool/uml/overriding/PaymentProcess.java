package com.codecool.uml.overriding;

public class PaymentProcess extends AbstractProcess {


    @Override
    protected void action(Orderable item) {
        if (item.pay()) {
            System.out.println("Item paid!");
        } else {
            System.out.println("Problem with the payment for the item!");
        }

    }
}
