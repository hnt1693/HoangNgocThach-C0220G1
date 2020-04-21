package Bai5_Interface.baitap.Colorable;


import java.util.ArrayList;

public interface Colorable {
    void howToColor();

    public static void main(String[] args) {
//        ArrayList<Shape> shapes = new ArrayList<>();
//        shapes.add(new Circle());
//        shapes.add(new Circle());
//        shapes.add(new Rectang());
//        shapes.add(new Square());
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle();
        shapes[2] = new Square(10);
        shapes[2].setColor("red");
        for (Shape item : shapes
        ) {
            if (item!=null) {
                if(item instanceof Colorable){
                    ((Colorable) item).howToColor();
                }
            }
        }

    }

}








