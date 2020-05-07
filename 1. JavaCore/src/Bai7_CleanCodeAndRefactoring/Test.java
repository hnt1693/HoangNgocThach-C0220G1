package Bai7_CleanCodeAndRefactoring;

import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Test {
    public static void main(String[] args) {


    }}
class A{
    String name;

    int age;
    public void show(){
        System.out.println("Haha");
    }

    public A(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public A() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return Objects.equals(name, a.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}

class B extends A{
    String address;

    public B() {
    }
    public void show2(){
        System.out.println("hehe");
    }

    @Override
    public void show() {
        System.out.println("Bưa đời");
    }

}
