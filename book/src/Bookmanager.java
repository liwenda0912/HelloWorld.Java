public class Bookmanager {
    public static void main (String[] args){
        // Dictionary distionary = new Dictionary();
        // dictionary.getBookId();
        // int pages = dictionay.pages;
        Book book = new Book("IBN001","test",90);
        System.out.println(book.toString());
        Dictionary dictionary = new Dictionary("IBN001","test",90,6 );
        System.out.println(dictionary.toString());
        System.out.println(book.getBookId());
        System.out.println(book.getBookname());
        System.out.println(book.getPages());
        System.out.println(dictionary.getBookId());
        System.out.println(dictionary.getBookname());
        System.out.println(dictionary.getPages());
        System.out.println(dictionary.getBookbushouPages());

    }

}
