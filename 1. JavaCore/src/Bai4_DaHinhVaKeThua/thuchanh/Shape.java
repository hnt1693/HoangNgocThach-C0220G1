package Bai4_DaHinhVaKeThua.thuchanh;

public class Shape {
    int x;
    String color = "green";
    boolean filled;

    public Shape() {
        this.filled = true;
        this.color = "green";
    }

    public void show() {
    };

    public static void main(String[] args) {
        Shape a = new Shape();
        Circle b = new Circle();
a=new Circle();

a=b;
        System.out.println(a.color);

        System.out.println(b.color);

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + getColor() + '\'' +
                ", filled=" + isFilled() +
                '}';
    }
}
