package com;

class Book {
    // Declare attributes
    private String title;
    private String author;
    private double price;

    // Constructor to initialize attributes
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getter and setter methods
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
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: " + price);
    }
}

// Main class to test the Book class

public class BookDetails {
    public static void main(String[] args) {
        // Create an instance of the Book class
        Book myBook = new Book("The great gatsby", "F. Scott Fitzgerald", 1501.87);

        // Display the details of the book
        myBook.displayDetails();
    }

}