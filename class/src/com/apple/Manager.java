package com.apple;

public class Manager {
    public static void main (String[] args){
        Book book = new Book(120,15);
        Textbook textbook = new Textbook("小学生","15期",120,15);
        Novel novel = new Novel("17期",120,15);
        Magazine magazine = new Magazine("12期",170,15);
        Periodical periodical = new Periodical("13版",160,20);
        System.out.println(book.toString());
        System.out.println(novel.toString());
        System.out.println(magazine.toString());
        System.out.println(textbook.toString());
        System.out.println(periodical.toString());
        System.out.println(book.getPrice());
        System.out.println(book.getPages());
        System.out.println(textbook.getUser());
        System.out.println(textbook.getDataofpublish());
        System.out.println(textbook.getPages());
        System.out.println(textbook.getPrice());
        System.out.println(novel.getDataofpublish());
        System.out.println(novel.getPages());
        System.out.println(novel.getPrice());
        System.out.println(magazine.getDataofpublish());
        System.out.println(magazine.getPages());
        System.out.println(magazine.getPrice());
        System.out.println(periodical.getDataofpublish());
        System.out.println(periodical.getPages());
        System.out.println(periodical.getPrice());
    }

}
