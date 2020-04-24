package Bai5_Interface.thuchanh;

public abstract class Animals {
    abstract void makeSound();

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Chicken chicken = new Chicken();
        Apple apple = new Apple();
        Orange orange = new Orange();
        tiger.makeSound();
        chicken.makeSound();
        System.out.println(chicken.howEat());
        System.out.println(orange.howEat());
    }

}

interface Edibale {
    String howEat();
}

class Tiger extends Animals {
    @Override
    void makeSound() {
        System.out.println("goafo gòao");
    }
}

class Chicken extends Animals implements Edibale {

    @Override
    void makeSound() {
        System.out.println("Tục tác");
    }

    @Override
    public String howEat() {
        return "Ăn được";
    }
}

abstract class Fruit implements Edibale {
    @Override
    public String howEat() {
        return "Ăn được";
    }
}

class Apple extends Fruit {
};

class Orange extends Fruit {
};
