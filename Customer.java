package com.company;

public class Customer {
    private
    int ID;
    String name;
    double discount;

    public Customer(int ID, String name, double discount) {
        this.ID = ID;
        this.name = name;
        this.discount = discount;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.ID + ")";
    }

}

