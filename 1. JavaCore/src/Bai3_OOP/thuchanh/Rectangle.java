package Bai3_OOP.thuchanh;

import java.util.Scanner;

public class Rectangle {
    private float width = 0;
    private float height = 0;

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.display();



    }

    public Rectangle() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Width ? ");
            float width = scanner.nextFloat();

            if (width < 0) {
                throw new IsPad("Lỗi nhập chiều dài không đúng");
            } else {
                this.width = width;
            }
            System.out.println("Height? ");
            float height = scanner.nextFloat();
            if (height < 0) {
                this.width = 0f;
                throw new IsPad("Lỗi nhập chiều dài không đúng");

            } else {
                this.height = height;
            }
        } catch (IsPad isPad) {
            isPad.printStackTrace();
        }
    }

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;

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

    public float getArea() {
        return this.height * this.width;
    }

    public float getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public  void display() {
        System.out.println("Hình chữ nhật có diện tích là : " + this.getArea());
        System.out.println("Có chu vi là : " + this.getPerimeter());
    }

    public class IsPad extends Exception {
        public IsPad(String mes) {
            super(mes);
        }
    }
}
