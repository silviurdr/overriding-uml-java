package com.codecool.uml.overriding;


public class CheckoutProcess extends AbstractProcess {


    @Override
    protected void action(Orderable item) {
        if (item.checkout()) {
            System.out.println("Item checked out!");
        } else {
            System.out.println("Problem with the item checked out!");
        }
    }
}
