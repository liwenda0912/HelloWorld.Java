package com.apple;

public class Novel extends Book{
    private String dataofpublish;

    public Novel(String dataofpublish,int pages, double price) {
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
