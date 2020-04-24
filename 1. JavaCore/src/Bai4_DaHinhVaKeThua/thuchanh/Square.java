package Bai4_DaHinhVaKeThua.thuchanh;

public class Square extends Rectangle {


    double side;


    public double getSide() {
        return side;
    }

    public Square() {
        this.width = 1;
        this.length = 1;
        this.side = 1;
    }

    @Override
    public void setWidth(double width) {
        this.length = width;
        this.width = width;
    }

    @Override
    public String toString() {
        return " Square with side =" + getSide() + " , which is a subclass of " + super.toString();
    }
}
