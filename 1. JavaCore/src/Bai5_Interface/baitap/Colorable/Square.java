package Bai5_Interface.baitap.Colorable;

class Square extends Shape implements Colorable {
    float pad = 1;

    public float getPad() {
        return pad;
    }

    public void setPad(float pad) {
        this.pad = pad;
    }

    public Square(float pad) {
        this.pad = pad;
    }

    @Override
    public void howToColor() {
        System.out.println(" Color of four side is " + getColor());
    }

    @Override
    float getArea() {
        return (float) Math.pow(pad, 2);
    }

    @Override
    float getPerimeter() {
        return 4 * pad;
    }
}