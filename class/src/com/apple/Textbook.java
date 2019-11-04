package com.apple;

public class Textbook extends Book {
    private String dataofpublish;
    private String user;

    public Textbook(String user,String dataofpublish,int pages,int price ) {
        super(pages, price);
        this.user = user;
        this.dataofpublish = dataofpublish;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDataofpublish() {
        return dataofpublish;
    }

    public void setDataofpublish(String dataofpublish) {
        this.dataofpublish = dataofpublish;
    }
}
