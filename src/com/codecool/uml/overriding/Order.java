package com.codecool.uml.overriding;

public class Order implements Orderable{

    private static int nextId = 1;

    public int getId() {
        return id;
    }

    private int id;
    private String status;

    Order() {
        this.id = nextId;
        nextId++;
        this.status = "new";
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean checkout() {
        this.status = "checked";
        return true;
    }

    @Override
    public boolean pay() {
        this.status = "pay";
        return true;
    }
}
