package com.apple.book;

public class Dictionary extends Book {
    private String BookbushouPages;

    public Dictionary(String bookId, String bookname, int pages, int bushoupages) {
        super(bookId,bookname,pages);
        this.bushouPages = bushouPges;
    }
    public String getBookbushouPages() {
        return BookbushouPages;
    }

    public void setBookbushouPages(String bookbushouPages) {
        BookbushouPages = bookbushouPages;
    }
}
