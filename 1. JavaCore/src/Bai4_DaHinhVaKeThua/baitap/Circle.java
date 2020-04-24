package Bai4_DaHinhVaKeThua.baitap;

import java.util.concurrent.CyclicBarrier;

public class Circle {
    double radius;
    String color;

    public Circle() {
        radius = 1;
        color = "green";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return Math.PI * this.radius * 2;
    }
}

class Cylinder extends Circle {
    double height;


    public double getV() {
        return super.getArea() * this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(5);
        System.out.println(cylinder.getV());
    }
}

