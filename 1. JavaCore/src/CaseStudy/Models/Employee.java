package CaseStudy.Models;

import java.text.Format;

public class Employee {
    private String id;
    private String name;
    private int age;
    private String address;

    public Employee( String name, int age, String address) {

        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Employee(String id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("%-30s%-10s%-30s","Name : " +name," Age : " + age, " Address : " +address) ;
    }
}
