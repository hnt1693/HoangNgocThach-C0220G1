package Bai3_OOP.baitap;

public class Fan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.toString();
        Fan fan2 = new Fan();
        fan2.toString();



    }
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private int radius = 5;
    private String color = "red";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.isOn()) {
            System.out.println("Trạng thái quạt đang bật");
            System.out.println("Tốc độ quạt :" + this.getSpeed());
            System.out.println("Bán kính quạt : " + this.getRadius());
            System.out.println("Màu quạt : " + this.getColor());
        } else {
            System.out.println("Quạt đang tắt");
        }
        return null;
    }
}
