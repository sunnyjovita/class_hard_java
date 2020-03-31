package com.company;

public class Author {
    private String name;
    private String email;
    private char gender;

//    default constructor
    public Author(){}

//    make a default constructor
    public Author(String name, String email, char gender){
        this.name = name;
        this.email= email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public char setGender(){
        return gender;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author {" + "Name : " + name + ", Email: " + email + ", Gender: " + gender + "}";
    }
}
