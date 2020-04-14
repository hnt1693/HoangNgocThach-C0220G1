package Bai4_DaHinhVaKeThua.thuchanh;

public class Circle extends Shape {
        double radius;
        String color="red";
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
    }

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter() {
        return Math.PI * 2 * this.radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius =" + getRadius() + ", which is a subclass of " + super.toString();
    }

    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }


}
