package com.fil.model;

public class Product {
    private int id;
    private String name;
    private int price;
    private String decription;
    private String production;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public Product(int id, String name, int price, String decription, String production) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.decription = decription;
        this.production = production;
    }
}
