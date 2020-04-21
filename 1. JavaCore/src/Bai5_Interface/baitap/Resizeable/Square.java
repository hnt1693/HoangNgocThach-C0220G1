package Bai5_Interface.baitap.Resizeable;

public class Square extends Rectangle {
    double pad = 1;

    public double getPad() {
        return pad;
    }

    public void setPad(float pad) {
        this.pad = pad;
    }

    public Square() {
    }

    public Square(double side) {
        super(side, side);
        pad = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }


    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}
