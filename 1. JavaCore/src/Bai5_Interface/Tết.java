package Bai5_Interface;

public class Tết {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.getName());
        b.setName("Thach");
        System.out.println(b.getName());
        B c=new B();
        System.out.println(c.getName());



    }
}

class A1 {
    private String name = "Thanh sida";
    private void a() {
        System.out.println("haha");
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class B extends A1 {


}