package com.example.nguyenvantri_kiemtra4;

public class Product {
    String img;
    String title;
    String detail;

    public Product() {
    }

    public Product(String img, String title, String detail) {
        this.img = img;
        this.title = title;
        this.detail = detail;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
