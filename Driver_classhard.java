package com.company;

public class Driver_classhard {
    public static void main(String args[]){

//      Exercise 1 using Book and Author
        Author a1 = new Author();

        a1.setName("Sunny");
        a1.setEmail("Sunny@gmail.com");
        a1.setGender('F');

        System.out.println(a1.toString());

        Book b1 = new Book("Kamasutra", a1, 50000, 10);
        System.out.println(b1.toString());

//       Exercise 2 using Book1 and Author
        Author a2 = new Author("Jovita", "Jovita@gmail.com", 'F');
        Book1 b2 = new Book1("Goodday", a2, 100000, 12 );
        System.out.println(b2.toString());
        b2.addAuthor(a2);
        System.out.println(b2.toString());

//       Exercise 3 using Mypoint and MyCircle
        MyCircle mc  = new MyCircle(2,3,4);
        System.out.println(mc.toString());
        System.out.println(mc.getArea());

//       Exercise 4 using MyPoint and MyTriangle
        MyTriangle mt = new MyTriangle(3,4,3,4,3,4);
        System.out.println(mt.toString());
        System.out.println(mt.getPerimeter());
        System.out.println(mt.getType());


//       Exercise 5 using MyRectangle and MyPoint
        MyRectangle mr = new MyRectangle(4,3,1,3);
        System.out.println(mr.getPerimeter());
        System.out.println(mr.getArea());



//       Exercise 6 using invoice and customer
        Customer c = new Customer(1234, "Sunny", 100);
        Invoice i = new Invoice(1212, c, 10000);
        System.out.println(i.getAmountAfterDiscount());


//       Exercise 7 using customer1 and account1
        Customer1 c1 = new Customer1(1111, "sunny", 'F');
        Account1 ac1 = new Account1(1212, c1, 10000);
        ac1.deposit(5000);
        ac1.withdraw(1000);
        System.out.println(ac1.toString());


    }




}
