package CaseStudy.Controllers;

import CaseStudy.Models.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AddNewBooking {
    public static void addNewBooking() {
        System.out.println("CUSTOMERS LIST : ");
        ArrayList<Customer> customers = AddNewCustomer.showCustomerListHasSorted();
        int selectedCustomer = 0;
        boolean isCorrectSelected = true;

        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Chọn customer bạn muốn thêm Bookking : ");
                selectedCustomer = scanner.nextInt();
                isCorrectSelected = selectedCustomer <= 0 | selectedCustomer > customers.size();
                if (isCorrectSelected) {
                    System.out.println("Vui lòng nhập đúng lựa chọn Customer từ danh sách!");
                }
            } catch (InputMismatchException e) {
                selectedCustomer = 0;
                System.out.println("Vui lòng nhập đúng lựa chọn Customer từ danh sách! ");
            }

        } while (isCorrectSelected);
        Customer customerByIndex = getCustomerByIndex(customers, selectedCustomer);
        Services customerService = null;
        int selectedService = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Lựa chọn loại Service áp dụng cho : " + customerByIndex.getName());
                System.out.println("    1. Booking Villa\n" +
                        "    2. Booking House\n" +
                        "    3. Booking Room");
                System.out.print("Nhập lựa chọn : ");
                selectedService = scanner.nextInt();
                customerService = actionAddServiceToCustomerMenu(selectedService);
            } catch (InputMismatchException e) {
                System.out.println("Vui lòng nhập lại!");
                selectedService = 0;
            }
        } while (selectedCustomer <= 0 | selectedCustomer > 3);
        Booking booking = new Booking(customerService,customerByIndex);
        ReadWriteData.write(booking);

    }

    private static Services actionAddServiceToCustomerMenu(int selectedService) {
        Services services = null;
        switch (selectedService) {

            case 1: {
                ArrayList<Villa> villas = ReadWriteData.loadVillaList();
                for (int i = 0; i < villas.size(); i++) {
                    System.out.println(i + 1 + ". " + villas.get(i).getId());
                }
                int selectedServices = 0;
                do {
                    Scanner scanner = new Scanner(System.in);
                    try {
                        System.out.print("Chọn Villa từ danh sách : ");
                        selectedServices = scanner.nextInt();

                    } catch (InputMismatchException e) {
                        System.out.println("Vui lòng nhập đúng Villa ID select!");
                        selectedServices = 0;
                    }

                } while (selectedServices <= 0 | selectedServices > villas.size());
                services = villas.get(selectedServices - 1);
                break;
            }
            case 2: {
                ArrayList<House> houses = ReadWriteData.loadHouseList();
                for (int i = 0; i < houses.size(); i++) {
                    System.out.println(i + 1 + ". " + houses.get(i).getId());
                }
                int selectedServices = 0;
                do {
                    Scanner scanner = new Scanner(System.in);
                    try {
                        System.out.print("Chọn House từ danh sách : ");
                        selectedServices = scanner.nextInt();

                    } catch (InputMismatchException e) {
                        System.out.println("Vui lòng nhập đúng House ID select!");
                        selectedServices = 0;
                    }

                } while (selectedServices <= 0 | selectedServices > houses.size());
                services = houses.get(selectedServices - 1);
                break;
            } case 3:{
                ArrayList<Room> rooms = ReadWriteData.loadRoomList();
                for (int i = 0; i < rooms.size(); i++) {
                    System.out.println(i + 1 + ". " + rooms.get(i).getId());
                }
                int selectedServices = 0;

                do {
                    Scanner scanner = new Scanner(System.in);
                    try {
                        System.out.print("Chọn Room từ danh sách : ");
                        selectedServices = scanner.nextInt();

                    } catch (InputMismatchException e) {
                        System.out.println("Vui lòng nhập đúng Room ID select!");
                        selectedServices = 0;
                    }

                } while (selectedServices <= 0 | selectedServices > rooms.size());
                services = rooms.get(selectedServices - 1);
                break;
            }
        }
        return services;
    }

    public static Customer getCustomerByIndex(ArrayList<Customer> customers, int index) {
        return customers.get(index - 1);
    }
}
