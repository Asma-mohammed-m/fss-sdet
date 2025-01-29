package com.fss;

public class Book {
    
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) { // Ensuring price is positive
            this.price = price;
        } else {
            System.out.println("Price must be positive.");
        }
    }

    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Book book = new Book("The Alchemist", "Paulo Coelho", 15.99);

        book.displayDetails();

        book.setTitle("The Pilgrimage");
        book.setPrice(18.50);

        System.out.println("\nUpdated Book Details:");
        book.displayDetails();
    }
}



