package com;

public class Book {

    String title;
    String author;
    double price;

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        Book b = new Book("java", "oracle", 10.5);
        System.out.println("Title " + b.getTitle());
        System.out.println("Title " + b.getAuthor());
        System.out.println("Title " + b.getPrice());
    }

}
