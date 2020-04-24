package Bai5_Interface.thuchanh;

import Bai4_DaHinhVaKeThua.thuchanh.Circle;
import Bai4_DaHinhVaKeThua.thuchanh.Shape;

public interface ShapeComparation {
    String compare(Shape1 a);

    public static void main(String[] args) {
        Circle1 c1 = new Circle1();
        Circle1 c2 = new Circle1();
        Rectang1 r1 =new Rectang1();
        System.out.println(c1.compare(r1));
        System.out.println(c1.compare(c2));
    }
}

abstract class Shape1 {
    String color = "green";

    abstract float getArea();

    abstract float getPerimeter();

    String getColor() {
        return this.color;
    }

    void setColor(String color) {
        this.color = color;
    }

}

class Circle1 extends Shape1 implements ShapeComparation {
    float radius = 1;

    public float getRadius() {
        return radius;
    }

    @Override
    public String compare(Shape1 a) {
        if (a instanceof Circle1) {
            if (this.getRadius() > ((Circle1) a).getRadius()) {
                return "Lớn hơn";
            } else if (this.getRadius() == ((Circle1) a).getRadius()) {
                return "Bằng";
            } else {
                return "Bé hơn";
            }
        } else {
            return "Khác loại không so sánh được";
        }
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    float getArea() {
        return 0;
    }

    @Override
    float getPerimeter() {
        return 0;
    }
}

class Rectang1 extends Shape1 implements ShapeComparation {
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
    public String compare(Shape1 a) {
        if (a instanceof Rectang1) {
           return "OK";
        }
        return "cancel";
    }

    @Override
    float getArea() {
        return 0;
    }

    @Override
    float getPerimeter() {
        return 0;
    }
}
