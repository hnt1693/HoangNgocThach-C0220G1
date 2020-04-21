package CaseStudy.Controllers;

import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Services;
import CaseStudy.Models.Villa;

import java.io.File;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainController {
    static ArrayList<Services> servicesArrayList = new ArrayList<>();
    static int selectedMainMenu;
    static int selectedServicesMenu;

    public static void main(String[] args) {

        File tempFile = new File("/media/fil-arettes/STUDY AND WORK/6. MODULE2/HoangNgocThach-C0220G1/1. JavaCore/src/CaseStudy/Data/services.csv");
        boolean exists = tempFile.exists();
        System.out.println(exists);
        if (exists) {
            servicesArrayList = ReadWriteData.load();
            Services.quantityOfService = servicesArrayList.size();
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
                    servicesArrayList.add(villa);
                    ReadWriteData.write(servicesArrayList);
                    break;
                }
                case 2: {
                    House house = AddNewService.addHouse();
                    servicesArrayList.add(house);
                    ReadWriteData.write(servicesArrayList);
                    break;
                }
                case 3: {
                    Room room = AddNewService.addRoom();
                    servicesArrayList.add(room);
                    ReadWriteData.write(servicesArrayList);
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


        }
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
                ArrayList<Services> servicesArrayList = ReadWriteData.load();
                for (Services services : servicesArrayList) {
                    if (services instanceof Villa) {
                        services.showInfor();
                        System.out.println();
                    }
                }
                break;
            }
            case 2: {
                ArrayList<Services> servicesArrayList = ReadWriteData.load();
                for (Services services : servicesArrayList) {
                    if (services instanceof House) {
                        services.showInfor();
                        System.out.println();
                    }
                }
                break;
            }
            case 3: {
                ArrayList<Services> servicesArrayList = ReadWriteData.load();
                for (Services services : servicesArrayList) {
                    if (services instanceof Room) {
                        services.showInfor();
                        System.out.println();
                    }
                }
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
