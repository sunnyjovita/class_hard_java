package com.company;

public class Book1 {
    private String name;
    private Author[] authors = new Author[100];
    private double price;
    private int qty = 0;

    //    default constructor without qty
    public Book1(String name, Author author, double price){
        this.name = name;
        this.authors[0] = author;
        this.price = price;
    }

    //    make default constructor with qty
    public Book1(String name, Author author, double price, int qty){
        this.name = name;
        this.authors[0] = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName(){

        return name;
    }

    public void setName(String name){

        this.name = name;
    }

    public String getAuthor(){
        String out = "";
        for(int i = 0; i < this.authors.length; i++) {
            if(authors[i] == null) {
                break;
            } else {
                out += authors[i].toString() + ", ";
            }
        }

        return out;
    }

    public void addAuthor(Author author){

        int index = 0;
        for(int i = 0; i < this.authors.length; i++) {
            if(authors[i] == null) {
                index = i-1;
                break;
            }
        }
        authors[index] = author;
    }

    public double getPrice(){

        return price;
    }

    public void setPrice(double price){

        this.price = price;
    }

    public int getQty(){

        return qty;
    }

    public void setQty(int qty){

        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book {" + "Book name: " + name + ", Author: " + getAuthor() + ", Price: " + price + ", Qty: " + qty + "}";
    }

}
