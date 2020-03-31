package com.company;

public class Account1 {
    private int id;
    private Customer1 customer;
    private double balance = 0.0;

    public Account1(int id, Customer1 customer, double balance){
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account1(int id, Customer1 customer){
        this.id = id;
        this.customer = customer;
    }

    public int getId(){
        return this.id;
    }

    public Customer1 getCustomer(){
        return this.customer;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    @Override
    public String toString() {
        return customer.toString() +", Balance: " + balance;
    }

    public String getCustomerName(){
        return this.customer.getName();
    }

    public void deposit(double amount){
        balance = amount + balance;
    }

    public void withdraw(double amount){
        if(balance < amount){
        }else {
            balance = balance - amount;
        }

    }

}

