package CaseStudy.Models;

import CaseStudy.Controllers.AddNewCustomer;
import CaseStudy.Controllers.ReadWriteData;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;

public class Customer {
    String name;
    String dob;
    String gender;

    public void setDob(String dob) {
        this.dob = dob;
    }

    String cmnd;
    String phone;
    String email;
    String typeOfCustomer;
    String address;
    Services services;
    String serviceID;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }


    public Customer(String name, String dob, String gender, String cmnd, String phone, String email, String typeOfCustomer, String address, Services services) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.cmnd = cmnd;
        this.phone = phone;
        this.email = email;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
        this.services = services;
    }

    public Customer(String name, String dob, String gender, String cmnd, String phone, String email, String typeOfCustomer, String address) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.cmnd = cmnd;
        this.phone = phone;
        this.email = email;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
        this.services = null;
    }

    public void showInfor() {
        System.out.println("Tên khách hàng : " + name);
        System.out.println("Ngày sinh : " + dob);
        System.out.println("Giới tính " + gender);
        System.out.println("CMND : " + cmnd);
        System.out.println("Mobile Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Loại Customer: " + typeOfCustomer);
        System.out.println("Địa chỉ : " + address);
        if (services != null) {
            System.out.println("ID services : " + services.id);
        } else {
            System.out.println("Chưa có dịch vụ sử dụng :");
        }
        System.out.println("===============XXXX=================");
    }
}
