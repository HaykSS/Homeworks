package com.company;

public class Book {
    private String title;
    private double price;
    private String author;

    public Book(String title, double price, String author) {
        setAuthor(author);
        setPrice(price);
        setTitle(title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
