package Bai4_DaHinhVaKeThua.thuchanh;

public class Rectangle extends Shape {
    double width;
    double length;

    public static void main(String[] args) {
        Shape a = new Rectangle();
        Circle b = new Circle();


    }
    public Rectangle() {
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        return "Rectangle with width = " + getWidth()+ " and length = " + getLength() + ", which is a subclass " +
                "of " + super.toString();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
