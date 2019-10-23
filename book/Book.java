package com.apple.book;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Book {
    private String bookId;
    private String bookname;
    protected int pages;
    public Book(String bookId,String bookname,int pages){
        this.bookId = bookId;
        this.bookname = bookname;
        this.pages = pages;
    }
    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}

