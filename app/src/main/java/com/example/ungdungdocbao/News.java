package com.example.ungdungdocbao;

public class News {
    private String title;
    private String mota;
    private String img;
    public News(String title, String mota){
        this.title=title;
        this.mota=mota;

    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }


}
