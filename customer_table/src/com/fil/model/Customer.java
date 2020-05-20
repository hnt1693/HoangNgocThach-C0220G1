package com.fil.model;

public class Customer {
    private String name;
    private String bod;
    private String address;
    private String urlImg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBod() {
        return bod;
    }

    public void setBod(String bod) {
        this.bod = bod;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public Customer(String name, String bod, String address, String urlImg) {
        this.name = name;
        this.bod = bod;
        this.address = address;
        this.urlImg = urlImg;
    }
}
