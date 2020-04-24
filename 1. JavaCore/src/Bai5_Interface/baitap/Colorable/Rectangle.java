package Bai5_Interface.baitap.Colorable;

class Rectangle extends Shape {
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
    float getArea() {
        return this.height * this.width;
    }

    @Override
    float getPerimeter() {
        return 2 * (this.width + this.height);
    }
}
