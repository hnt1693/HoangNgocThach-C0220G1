package CaseStudy.Controllers;

import CaseStudy.Models.*;

import java.io.File;
import java.util.*;

public class MainController {
    static ArrayList<Villa> villaList = new ArrayList<>();
    static ArrayList<House> houseList = new ArrayList<>();
    static ArrayList<Room> roomList = new ArrayList<>();
    static ArrayList<Customer> customers = new ArrayList<>();
    static int selectedMainMenu;
    static int selectedServicesMenu;

    public static void main(String[] args) {

        File tempFile = new File("/media/fil-arettes/STUDY AND WORK/6. MODULE2/HoangNgocThach-C0220G1/1. JavaCore/src/CaseStudy/Data/room.csv");
        boolean exists = tempFile.exists();
        System.out.println(exists);
        if (exists) {
            roomList = ReadWriteData.loadRoomList();
        }
        menuProgram();
    }

    private static void menuProgram() {
        Scanner scanner;
        do {
            selectedMainMenu = 0;
            scanner = new Scanner(System.in);
            System.out.println("Lựa chọn từ 1 - 9 để thực hiện các chức năng của chương trình");
            System.out.print("1. Add New Services\n" +
                    "2. Show Services \n" +
                    "3. Add New Customer\n" +
                    "4. Show Information of Customer\n" +
                    "5. Add New Booking\n" +
                    "6. Show Information of Employee\n" +
                    "7. Booking Movie Ticket 4D\n" +
                    "8. Find Employee\n" +
                    "9. Exit \n");
            try {
                System.out.print("Nhập lựa chọn : ");
                selectedMainMenu = scanner.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Vui lòng nhập một số !");
                selectedMainMenu = 0;
            }
            actionMainMenu(selectedMainMenu);
        } while (selectedMainMenu != 9);

    }

    private static void addNewService() {
        Scanner scanner;
        int selectedMenu;
        do {
            selectedMenu = 0;
            scanner = new Scanner(System.in);
            System.out.println("Lựa chọn chức năng 1 - 5 :");
            System.out.println("1. Add New Villa\n" +
                    "2. Add New House\n" +
                    "3. Add New Room\n" +
                    "4. Back to menu\n" +
                    "5. Exit"
            );
            try {
                System.out.print("Nhập lựa chọn : ");
                selectedMenu = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Vui lòng nhập đúng Format");
            }

            switch (selectedMenu) {
                case 1: {
                    Villa villa = AddNewService.addVilla();
                    villaList.add(villa);
                    ReadWriteData.write(villa);
                    break;
                }
                case 2: {
                    House house = AddNewService.addHouse();
                    houseList.add(house);
                    ReadWriteData.write(house);
                    break;
                }
                case 3: {
                    Room room = AddNewService.addRoom();
                    roomList.add(room);
                    ReadWriteData.write(room);
                    break;
                }
                case 5: {
                    selectedMenu = 4;
                    selectedMainMenu = 9;
                    break;
                }
            }
        } while (selectedMenu != 4);

    }

    private static void actionMainMenu(int selectedMenu) {
        switch (selectedMenu) {
            case 1: {
                addNewService();
                break;
            }
            case 2: {
                showServicesMenu();
                break;
            }
            case 3: {
                addNewCustomer();
                break;
            }
            case 4: {
                showCustomerInfor();
                break;
            }
            case 5: {
                addNewBooking();
                break;
            }
            case 6: {
                showEmployeeInfor();
                break;
            }
            case 7: {
                bookingMovieTicket();
                break;
            }
            case 8: {
                findEmployee();
                break;
            }
        }
    }

    private static void findEmployee() {
    }

    private static void bookingMovieTicket() {
        Scanner scanner = new Scanner(System.in);
        Queue<String> listBooking = new LinkedList<>();
        int QUANTITIES_BOOK = 10;
            System.out.println("Add new BookingMovieTicket : ");
            System.out.println("Name : ");
            String name = scanner.nextLine();
            listBooking.add(name);


        listBooking.offer("Hoang Ngoc Thach");
        listBooking.offer("Tran Xuan Son");
        listBooking.offer("Nguyen Thanh Tung");
        listBooking.add("test");
        System.out.println(listBooking.poll());
        Iterator<String> iterator = listBooking.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void showEmployeeInfor() {
        Map map = ReadWriteData.loadEmployeeList();
        Iterator<Map.Entry<String, Employee>> itr = map.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<String, Employee> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }
    }

    private static void addNewBooking() {
        AddNewBooking.addNewBooking();
    }

    private static void showCustomerInfor() {
        AddNewCustomer.showCustomerInfor();
    }

    private static void addNewCustomer() {
        Customer customer = AddNewCustomer.addNewCustomer();
        customers.add(customer);
        ReadWriteData.write(customer);

    }

    private static void showServicesMenu() {

        do {
            selectedServicesMenu = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Vui lòng chọn 1 - 8 theo chức năng bên dưới :");
            System.out.println("1. Show all Villa\n" +
                    "2. Show all House\n" +
                    "3. Show all Room\n" +
                    "4. Show All Name Villa Not Duplicate\n" +
                    "5. Show All Name House Not Duplicate\n" +
                    "6. Show All Name Name Not Duplicate\n" +
                    "7. Back to menu\n" +
                    "8. Exit");
            try {
                System.out.print("Vui lòng nhập lựa chọn : ");
                selectedServicesMenu = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("InputMissMatch!");
                selectedServicesMenu = 0;
            }
            actionShowServicesMenu(selectedServicesMenu);
        } while (selectedServicesMenu != 7);


    }

    private static void actionShowServicesMenu(int selectedMenu) {
        switch (selectedMenu) {
            case 1: {
                ShowService.showVillaList();
                break;
            }
            case 2: {
                ShowService.showHouseList();
                break;
            }
            case 3: {
                ShowService.showRoomList();
                break;
            }
            case 4: {
                ShowService.showAllVillaIsNotDuplicate();
                break;
            }
            case 5: {
                ShowService.showAllHouseIsNotDuplicate();
                break;
            }
            case 6: {
                ShowService.showAllRoomIsNotDuplicate();
                break;
            }
            case 8: {
                selectedServicesMenu = 7;
                selectedMainMenu = 9;
                break;
            }
        }
    }

}
