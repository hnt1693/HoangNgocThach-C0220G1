package CaseStudy.Controllers;

import CaseStudy.Exception.*;
import CaseStudy.Models.*;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

public class AddNewCustomer {
    static Customer addNewCustomer() {
        Scanner scanner = new Scanner(System.in);
        boolean checkName;
        String name = "";
        do {
            scanner = new Scanner(System.in);
            try {
                System.out.print("Tên khách hàng :");
                name = scanner.nextLine();
                String pattern = "([A-Z][a-z]+\s)*([A-Z][a-z]+)$";

                if (!Pattern.matches(pattern, name)) {
                    throw new NameException("");
                } else {
                    checkName = true;
                }
            } catch (NameException e) {
                checkName = false;
                System.out.println("Lỗi nhập tên khách hàng không hợp lệ. Tên Khách hàng phải in hoa ký tự đầu tiên trong mỗi từ");
            }

        } while (!checkName);


        boolean checkDob = false;
        String dob = "";
        do {
            try {
                scanner = new Scanner(System.in);
                System.out.print("Ngày sinh (DD-MM-YYYY) : ");
                dob = scanner.nextLine();
                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
                Date date = format.parse(dob);
                if (date.getMonth() < 9) {
                    dob = date.getDate() + "-0" + (date.getMonth() + 1) + "-" + (date.getYear() + 1900);
                } else {
                    dob = date.getDate() + "-" + (date.getMonth() + 1) + "-" + (date.getYear() + 1900);
                }

                Date dateNow = new Date(System.currentTimeMillis());
                if (date.getYear() + 1900 < 1900 | (dateNow.getYear() - date.getYear() < 18)) {
                    throw new BirthdayException("");
                }
                checkDob = true;
            } catch (InputMismatchException e) {
                System.out.println("Năm sinh phải >1900 và nhỏ hơn năm hiện tại 18 năm, đúng định dạng dd/mm/yyyy");
                checkDob = false;
            } catch (ParseException e) {
                System.out.println("Năm sinh phải >1900 và nhỏ hơn năm hiện tại 18 năm, đúng định dạng dd/mm/yyyy");
                checkDob = false;
            } catch (BirthdayException e) {
                checkDob = false;
                System.out.println("Năm sinh phải >1900 và nhỏ hơn năm hiện tại 18 năm, đúng định dạng dd/mm/yyyy");
            }
        } while (!checkDob);

        boolean checkGender = false;
        String gender = "";

        do {
            try {
                scanner = new Scanner(System.in);
                System.out.print("Giới tính (Male, Female, Unknow) : ");
                gender = scanner.nextLine();
                String temp = gender.toUpperCase();
                switch (temp) {
                    case "MALE": {
                        gender = "Male";
                        checkGender = true;
                        break;
                    }
                    case "FEMALE": {
                        gender = "Female";
                        checkGender = true;
                        break;
                    }
                    case "UNKNOW": {
                        gender = "Unknow";
                        checkGender = true;
                        break;
                    }
                    default: {
                        throw new GenderException("");
                    }
                }
            } catch (GenderException e) {
                checkGender = false;
                System.out.println("Vui lòng nhập đúng gender cho Customer");
            }

        }
        while (!checkGender);
        boolean checkCMND;
        String cmnd = "";
        do {
            try {
                scanner = new Scanner(System.in);
                System.out.print("CMND (XXX-XXX-XXX) : ");
                cmnd = scanner.nextLine();
                String parttern = "([0-9]{3}\s){2}[0-9]{3}$";
                if (!Pattern.matches(parttern, cmnd)) {
                    throw new IdCardException("");
                } else {
                    checkCMND = true;
                }
            } catch (IdCardException e) {
                checkCMND = false;
                System.out.println("Vui lòng nhập lại CMND theo đúng định dạng : XXX XXX XXX");
            }
        } while (!checkCMND);

        System.out.print("Phone number : ");
        String phoneNumber = scanner.nextLine();

        boolean checkEmail = false;
        String email = "";
        do {
            try {
                scanner = new Scanner(System.in);
                System.out.print("Email : ");
                email = scanner.nextLine();
                String pattern = "[a-zA-Z0-9]+@[a-zA-Z0-9]+[.][a-zA-Z0-9]+$";
                if (!Pattern.matches(pattern, email)) {
                    throw new EmailException("");
                } else {
                    checkEmail = true;
                }
            } catch (EmailException e) {
                checkEmail = false;
                System.out.println("Email phải đúng định dạng abc@abc.abc");
            }
        }
        while (!checkEmail);

        System.out.print("Loại khách : ");
        String typeOfCustomer = scanner.nextLine();
        System.out.print("Địa chỉ : ");
        String address = scanner.nextLine();
//        System.out.println("Dịch vụ (Villa, Room, House): ");
//        String service = scanner.nextLine();
//        String selectedService = null;
//        Services usedService = null;
//        if (service.equals("Villa")) {
//            ArrayList<Villa> villas = ReadWriteData.loadVillaList();
//            villas.forEach(item -> System.out.println(item.getId()));
//            System.out.println("Chọn Villa từ danh sách : ");
//            selectedService = scanner.nextLine();
//            usedService = searchVillaByID(villas, selectedService);
//        } else if (service.equals("House")) {
//            ArrayList<House> houses = ReadWriteData.loadHouseList();
//            houses.forEach(item -> System.out.println(item.getId()));
//            System.out.println("Chọn House từ danh sách : ");
//            selectedService = scanner.nextLine();
//            usedService = searchHouseByID(houses, selectedService);
//        } else if (service.equals("Room")) {
//            ArrayList<Room> rooms = ReadWriteData.loadRoomList();
//            rooms.forEach(item -> System.out.println(item.getId()));
//            System.out.println("Chọn Room từ danh sách : ");
//            selectedService = scanner.nextLine();
//            usedService = searchRoomByID(rooms, selectedService);
//        }
        System.out.println("Thêm customer thành công !");
        return new Customer(name, dob, gender, cmnd, phoneNumber, email, typeOfCustomer, address);
    }

    public static Villa searchVillaByID(ArrayList<Villa> services, String id) {
        for (int i = 0; i < services.size(); i++) {
            if (services.get(i).getId().equals(id)) {
                return services.get(i);
            }
        }
        return null;
    }

    public static House searchHouseByID(ArrayList<House> services, String id) {
        for (int i = 0; i < services.size(); i++) {
            if (services.get(i).getId().equals(id)) {
                return services.get(i);
            }
        }
        return null;
    }

    public static Room searchRoomByID(ArrayList<Room> services, String id) {
        for (int i = 0; i < services.size(); i++) {
            if (services.get(i).getId().equals(id)) {
                return services.get(i);
            }
        }
        return null;
    }

    public static void showCustomerInfor() {
        ArrayList<Customer> customers = ReadWriteData.LoadCustomerList();
        customers.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                if (o1.getName().compareTo(o2.getName()) != 0) {
                    return o1.getName().compareTo(o2.getName());
                } else {
                    Date date1 = null;
                    Date date2 = null;
                    try {
                        date1 = new SimpleDateFormat("dd-MM-yyyy").parse(o1.getDob());
                        date2 = new SimpleDateFormat("dd-MM-yyyy").parse(o2.getDob());
                        return date1.compareTo(date2);
                    } catch (ParseException e) {
                        e.printStackTrace();
                        return 0;
                    }


                }
            }
        });
        customers.forEach(item -> item.showInfor());

    }

    public static ArrayList<Customer> showCustomerListHasSorted() {
        ArrayList<Customer> customers = ReadWriteData.LoadCustomerList();
        customers.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                if (o1.getName().compareTo(o2.getName()) != 0) {
                    return o1.getName().compareTo(o2.getName());
                } else {
                    Date date1 = null;
                    Date date2 = null;
                    try {
                        date1 = new SimpleDateFormat("dd-MM-yyyy").parse(o1.getDob());
                        date2 = new SimpleDateFormat("dd-MM-yyyy").parse(o2.getDob());
                        return date1.compareTo(date2);
                    } catch (ParseException e) {
                        e.printStackTrace();
                        return 0;
                    }


                }
            }
        });

        for (int i = 0; i < customers.size(); i++) {
            System.out.println(i+1 + ". " + customers.get(i).getName() + " Birthday : " + customers.get(i).getDob());
        }
        return customers;
    }


}
