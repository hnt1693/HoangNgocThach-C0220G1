package Bai5_Interface.baitap;

import java.util.ArrayList;

public interface Colorable {
    void howToColor();

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle1());
        shapes.add(new Circle1());
        shapes.add(new Rectang1());
        shapes.add(new Square1());
        for (Shape e : shapes
        ) {
            if (e instanceof Square1) {
                ((Square1) e).howToColor();
            }
            System.out.println(e.getColor());
        }

    }

}


abstract class Shape {
    String color = "green";

    String getColor() {
        return this.color;
    }

    abstract float getArea();

    abstract float getPerimeter();
}

class Circle1 extends Shape {
    float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Circle1() {

    }

    public Circle1(float radius) {
        this.radius = radius;
    }

    @Override
    float getArea() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    float getPerimeter() {
        return (float) (Math.PI * 2 * this.radius);
    }
}

class Rectang1 extends Shape {
    float width = 1;
    float height = 1;

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    float getArea() {
        return this.height * this.width;
    }

    @Override
    float getPerimeter() {
        return 2 * (this.width + this.height);
    }
}

class Square1 extends Shape implements Colorable {
    float pad = 1;

    public float getPad() {
        return pad;
    }

    public void setPad(float pad) {
        this.pad = pad;
    }

    @Override
    public void howToColor() {
        System.out.println(" Color of four side is " + getColor());
    }

    @Override
    float getArea() {
        return (float) Math.pow(pad, 2);
    }

    @Override
    float getPerimeter() {
        return 4 * pad;
    }
}