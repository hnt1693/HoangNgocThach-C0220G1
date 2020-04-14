package Bai3_OOP.baitap;

public class QuadraticEquation {
    float a;
    float b;
    float c;
    public QuadraticEquation(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getDelta() {
        return (float) (Math.pow(this.b, 2) - 4 * this.a * this.c);
    }

    public float getX1() {
        if (this.getDelta() < 0) {
            System.out.println("Phương trình vô nghiệm");
            return 0;
        } else {
            return (float) ((-this.b - Math.sqrt(this.getDelta())) / 2 / this.a);
        }
    }
    public float getX2() {
        if (this.getDelta() < 0) {
            System.out.println("Phương trình vô nghiệm");
            return 0;
        } else {
            return (float) ((-this.b + Math.sqrt(this.getDelta())) / 2 / this.a);
        }
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }


    public static void main(String[] args) {
     QuadraticEquation quadraticEquation = new QuadraticEquation(1,3,-3);
        System.out.println(quadraticEquation.getX1());
        System.out.println(quadraticEquation.getX2());
 }

}
