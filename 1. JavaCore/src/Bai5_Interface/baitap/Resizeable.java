package Bai5_Interface.baitap;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.Cipher;

interface Resizeable {
    void resize(double a);

    float getArea();

    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Rectangle rec1 = new Rectangle(5, 5);
        Square square = new Square(5);

        System.out.println(rec1.getArea());
        rec1.resize(60);
        System.out.println(rec1.getArea());
    }
}

class Circle implements Resizeable {
    float radius = 1;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double a) {
        this.radius *= (1 + a / 100f);
    }

    public float getArea() {
        return (float) (Math.PI * Math.pow(this.radius, 2));
    }
}

class Rectangle implements Resizeable {
    float width = 1;
    float height = 1;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    Rectangle() {
    }

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
    public void resize(double a) {
        width *= (1 + a / 100);
        height *= (1 + a / 100);

    }

    @Override
    public float getArea() {
        return this.height * this.width;
    }

}

class Square extends Rectangle implements Resizeable {

    public Square(float width) {
        this.height = width;

        this.width = width;
    }

    public void resize(double a) {
        super.resize(a);
    }

    @Override
    public void setWidth(float width) {
        this.width = width;
        this.height = width;
    }

    @Override
    public void setHeight(float width) {
        this.width = width;
        this.height = width;
    }


    @Override
    public float getArea() {
        return super.getArea();
    }
}