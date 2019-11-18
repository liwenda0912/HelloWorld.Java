public class Dictionary extends Book {
    private int bookbushouPages;

    public Dictionary(String bookId, String bookname, int pages, int bookbushoupages) {
        super(bookId, bookname, pages);
        this.bookbushouPages = bookbushoupages;
    }
    public int getBookbushouPages() {
        return bookbushouPages;
    }

    public void setBookbushouPages(String bookbushouPages) {
        bookbushouPages = bookbushouPages;
    }
}
