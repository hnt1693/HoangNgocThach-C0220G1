package Bai5_Interface.baitap.Colorable;
abstract class Shape {
    String color = "green";

    String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract float getArea();

    abstract float getPerimeter();
}