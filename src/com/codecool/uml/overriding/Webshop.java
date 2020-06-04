package com.codecool.uml.overriding;

import com.codecool.uml.overriding.*;

public class Webshop {

    public static void main(String[] args) {
	// write your code here

        // Create processes for the order
        CheckoutProcess checkoutProduct = new CheckoutProcess();
        PaymentProcess payProduct = new PaymentProcess();

        // Create orders
        Order firstOrder = new Order();
        Order secondOrder = new Order();

        System.out.println("Id of the first order: " + firstOrder.getId());
        System.out.println();
        System.out.println("Id of the second order: " + secondOrder.getId());
        System.out.println();
        System.out.println("Initial status of the order: " + firstOrder.getStatus());
        System.out.println();
        System.out.println("Checkout process starts:");
        checkoutProduct.process(firstOrder);
        System.out.println("Status after the product is checked: " + firstOrder.getStatus());
        System.out.println();
        System.out.println("Pay process starts:");
        payProduct.action(firstOrder);
        System.out.println("Status after the product is paid: " + firstOrder.getStatus());

    }
}
