package Bai4_DaHinhVaKeThua.baitap;
public abstract class Shape {
    public Shape() {
    }
}

class Triangle extends Shape {
    float side1 = 1f;
    float side2 = 1f;
    float side3 = 1f;

    public static void main(String[] args) {
        Triangle triangle = new Triangle(2,3,4);
        System.out.println(triangle.getArea());
    }
    public float getSide1() {
        return side1;
    }

    public Triangle(float side1, float side2, float side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public float getPerimeter() {
        return side1 + side2 + side3;
    }

    public float getArea() {
        float halfP = getPerimeter() / 2;
        return (float) Math.sqrt(halfP * (halfP - side1) * (halfP - side2) * (halfP - side3));
    }

    public void setSide1(float side1) {
        this.side1 = side1;
    }

    public float getSide2() {
        return side2;
    }

    public void setSide2(float side2) {
        this.side2 = side2;
    }

    public float getSide3() {
        return side3;
    }

    public void setSide3(float side3) {
        this.side3 = side3;
    }

    public Triangle() {

    }

}
