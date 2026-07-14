package com.anu.basic;

public class Book {
    private String name;
    private String author;
    private double price;
    private boolean isBorrowed;
    public Book(){}
    public Book(String name, String author, double price, boolean isBorrowed){
        this.name = name;
        this.author = author;
        this.price = price;
        this.isBorrowed = isBorrowed;
    }

   public void setName(String name){
       this.name = name;
   }
   public String getName(){
       return this.name;
   }
   public void setAuthor(String author){
       this.author = author;
   }
   public String getAuthor(){
       return this.author;
   }
   public void setPrice(double price){
       this.price = price;
   }
   public double getPrice(){
       return this.price;
   }
   public void setIsBorrowed(boolean isBorrowed){
       this.isBorrowed = isBorrowed;
   }
   public boolean getIsBorrowed(){
       return this.isBorrowed;
   }

   public void presentation(){
        System.out.println("Name: " + this.name+ "\tAuthor: " + this.author+ "\tPrice: " + this.price+ "\tIs Borrowed: " + this.isBorrowed);
   }

}
