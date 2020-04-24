package Bai5_Interface.baitap.Colorable;

class Circle extends Shape {
    float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    public Circle(float radius) {
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