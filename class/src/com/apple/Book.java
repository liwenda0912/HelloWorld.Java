package com.apple;

public class Book {
    private int pages;
    private double price;

    public Book( int pages,double price) {
        this.price = price;
        this.pages = pages;
    }
    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
