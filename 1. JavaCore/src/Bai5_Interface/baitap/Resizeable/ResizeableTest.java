package Bai5_Interface.baitap.Resizeable;

import java.util.Random;

public class ResizeableTest {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(10, 15);
        shapes[2] = new Circle(12);
        shapes[3] = new Square(10);
        for (Shape item : shapes
        ) {
            if (item != null) {
                System.out.println(item.toString());

            }
        }
        System.out.println("Sau khi resize");
        for (Shape item : shapes
        ) {
            if (item != null) {
                item.resize(randomPercent());
                System.out.println(item.toString());

            }
        }

    }

    static double randomPercent() {
        Random random = new Random();
        return (double) random.nextInt(100);
    }
}
