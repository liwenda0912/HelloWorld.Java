package com.apple;

public class Periodical extends Book {
    private String dataofpublish;

    public Periodical (String dataofpublish,int pages,int price ) {
        super(pages, price);
        this.dataofpublish = dataofpublish;
    }
    public String getDataofpublish() {
        return dataofpublish;
    }

    public void setDataofpublish(String dataofpublish) {
        this.dataofpublish = dataofpublish;
    }
}
