package CaseStudy.Controllers;

import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Villa;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AddNewService {
    static Room addRoom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin Room : ");

        boolean checkID;
        String id;
        do {
            ArrayList<Room> rooms = ReadWriteData.loadRoomList();
            System.out.println("Danh sách ROOM : " + rooms.size());
            rooms.forEach(item-> System.out.println(item.getId()));
            System.out.print("Nhập ID (SVRO-XXXX):");
            id = scanner.nextLine();
            String pattern = "(SVRO)-\\d{4}$";
            checkID = (Pattern.matches(pattern, id));
            if (!checkID) {
                System.out.println("Nhập sai format - SVVL-XXXX");
            }
            if(isExistInRoomList(rooms,id)){
               checkID=false;
                System.out.println("ID đã tồn tại trong danh sách. Vui lòng kiểm tra lại !");
            }
        } while (!checkID);


        String serviceName;
        boolean checkServiceName;
        do {
            String pattern = "[A-Z][a-z0-9]{1,}$";
            System.out.print("Nhập tên Room :");
            serviceName = scanner.nextLine();
            checkServiceName = Pattern.matches(pattern, serviceName);
            if (!checkServiceName) {
                System.out.println("Vui lòng nhập đúng định dạng : bắt đầu là ký tự in hoa, sau đó là các ký tự thường. VD : House1");
            }
        } while (!checkServiceName);

        float usedArea = 0;
        boolean checkUsedArea;
        do {
            try {
                scanner = new Scanner(System.in);
                String pattern = "(([3-9]\\d)|(\\d{3,}))($|(\\s+)|(.\\d+))$";
                System.out.print("Nhập diện tích sử dụng s(>=30m2) : ");
                usedArea = scanner.nextFloat();
                checkUsedArea = Pattern.matches(pattern, usedArea + "");
                if (!checkUsedArea) {
                    System.out.println("Vui lòng nhập lại diện tích sử dụng : >=30m2");
                }
            } catch (InputMismatchException e) {
                checkUsedArea = false;
                System.out.println("Vui lòng nhập vào 1 số!");
            }
        } while (!checkUsedArea);
        boolean checkRentCost;
        int rentCost = 0;
        do {
            try {
                scanner = new Scanner(System.in);
                System.out.print("Giá thuê : ");
                rentCost = scanner.nextInt();
                if (rentCost <= 0) {
                    checkRentCost = false;
                    System.out.printf("Giá thuê phải là 1 số dương. Vui lòng nhập lại!");
                } else {
                    checkRentCost = true;
                }
            } catch (InputMismatchException e) {
                checkRentCost = false;
                System.out.println("Vui lòng nhập vào 1 số nguyên dương!");
            }
        } while (!checkRentCost);

        boolean checkMaxPeoples;
        int peoples = 0;
        do {
            try {
                scanner = new Scanner(System.in);
                System.out.print("Số lượng khách tối đa (1-20): ");
                peoples = scanner.nextInt();
                if (peoples <= 0 || peoples > 20) {
                    checkMaxPeoples = false;
                    System.out.println("Vui lòng nhập lại.");
                } else {
                    checkMaxPeoples = true;
                }
            } catch (InputMismatchException e) {
                checkMaxPeoples = false;
                System.out.println("Vui lòng nhập vào 1 số!");
            }
        } while (!checkMaxPeoples);

        boolean checkTypeOfRent = false;
        String typeOfRent;
        do {
            scanner = new Scanner(System.in);
            System.out.print("Kiểu thuê (D(Day),W(Week),M(Month) :");
            typeOfRent = scanner.nextLine();
            if (typeOfRent.equals("D") | typeOfRent.equals("Day") |
                    typeOfRent.equals("W") | typeOfRent.equals("Week") |
                    typeOfRent.equals("M") | typeOfRent.equals("Month")) {
                checkTypeOfRent = true;
                switch (typeOfRent) {
                    case "D": {
                        typeOfRent = "Day";
                        break;
                    }
                    case "W": {
                        typeOfRent = "Week";
                        break;
                    }
                    case "M": {
                        typeOfRent = "Month";
                        break;
                    }
                }
            } else {
                System.out.println("Vui lòng nhập lại đúng định dạng !");
            }
        } while (!checkTypeOfRent);

        System.out.print("Dịch vụ miễn phí : ");
        String freeServices = scanner.nextLine();
        System.out.println("Successfully");
        return new Room(id, serviceName, usedArea, rentCost, peoples, typeOfRent, freeServices);
    }

    static Villa addVilla() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin Villa : ");

        boolean checkID;
        String id;
        do {
            scanner = new Scanner(System.in);
            ArrayList<Villa> villas = ReadWriteData.loadVillaList();
            System.out.println("Danh sách VILLA : " + villas.size());
            villas.forEach(item-> System.out.println(item.getId()));
            System.out.print("Nhập ID (SVVL-XXXX):");
            id = scanner.nextLine();
            String pattern = "(SVVL)+-\\d{4}$";
            checkID = (Pattern.matches(pattern, id));
            if (!checkID) {
                System.out.println("Nhập sai format - SVVL-XXXX");
            }
            if(isExistInVillaList(villas,id)){
                checkID = false;
                System.out.println("Vui lòng kiểm tra lại. ID này đã tồn tại trong danh sách!");
            }
        } while (!checkID);


        String serviceName;
        boolean checkServiceName;
        do {
            String pattern = "[A-Z]+[a-z0-9]{1,}$";
            System.out.print("Nhập tên Villa :");
            serviceName = scanner.nextLine();
            checkServiceName = Pattern.matches(pattern, serviceName);
            if (!checkServiceName) {
                System.out.println("Vui lòng nhập đúng định dạng : bắt đầu là ký tự in hoa, sau đó là các ký tự thường. VD : House1");
            }
        } while (!checkServiceName);

        float usedArea = 0;
        boolean checkUsedArea;
        do {
            try {
                scanner = new Scanner(System.in);
                String pattern = "(([3-9]\\d)|(\\d{3,}))($|(\\s+)|(.\\d+))$";
                System.out.print("Nhập diện tích sử dụng s(>=30m2) : ");
                usedArea = scanner.nextFloat();
                checkUsedArea = Pattern.matches(pattern, usedArea + "");
                if (!checkUsedArea) {
                    System.out.println("Vui lòng nhập lại diện tích sử dụng : >=30m2");
                }
            } catch (InputMismatchException e) {
                checkUsedArea = false;
                System.out.println("Vui lòng nhập vào 1 số!");
            }
        } while (!checkUsedArea);

        boolean checkRentCost;
        int rentCost = 0;
        do {
            try {
                scanner = new Scanner(System.in);
                System.out.print("Giá thuê : ");
                rentCost = scanner.nextInt();
                if (rentCost <= 0) {
                    checkRentCost = false;
                    System.out.printf("Giá thuê phải là 1 số dương. Vui lòng nhập lại!");
                } else {
                    checkRentCost = true;
                }
            } catch (InputMismatchException e) {
                checkRentCost = false;
                System.out.println("Vui lòng nhập vào 1 số nguyên dương!");
            }
        } while (!checkRentCost);


        boolean checkMaxPeoples;
        int peoples = 0;
        do {
            try {
                scanner = new Scanner(System.in);
                System.out.print("Số lượng khách tối đa (1-20): ");
                peoples = scanner.nextInt();
                if (peoples <= 0 || peoples > 20) {
                    checkMaxPeoples = false;
                    System.out.println("Vui lòng nhập lại.");
                } else {
                    checkMaxPeoples = true;
                }
            } catch (InputMismatchException e) {
                checkMaxPeoples = false;
                System.out.println("Vui lòng nhập vào 1 số!");
            }
        } while (!checkMaxPeoples);

        boolean checkTypeOfRent = false;
        String typeOfRent;
        do {
            scanner = new Scanner(System.in);
            System.out.print("Kiểu thuê (D(Day),W(Week),M(Month) :");
            typeOfRent = scanner.nextLine();
            if (typeOfRent.equals("D") | typeOfRent.equals("Day") |
                    typeOfRent.equals("W") | typeOfRent.equals("Week") |
                    typeOfRent.equals("M") | typeOfRent.equals("Month")) {
                checkTypeOfRent = true;
                switch (typeOfRent) {
                    case "D": {
                        typeOfRent = "Day";
                        break;
                    }
                    case "W": {
                        typeOfRent = "Week";
                        break;
                    }
                    case "M": {
                        typeOfRent = "Month";
                        break;
                    }
                }
            } else {
                System.out.println("Vui lòng nhập lại đúng định dạng !");
            }
        } while (!checkTypeOfRent);

        System.out.print("Thông tin chi tiết : ");
        String details = scanner.nextLine();
        System.out.print("Tiêu chuẩn phòng :");
        String standardOfRoom = scanner.nextLine();

        boolean checkSwimPoolArea = false;
        float swimPoolArea = 0;
        do {
            try {
                scanner = new Scanner(System.in);
                System.out.print("Diện tích bể bơi (m2) :");
                swimPoolArea = scanner.nextFloat();
                if (swimPoolArea <= 0) {
                    System.out.println("Vui lòng kiểm tra lại diện tích bể bơi!");
                    checkSwimPoolArea = false;
                } else {
                    checkSwimPoolArea = true;
                }
            } catch (InputMismatchException e) {
                checkSwimPoolArea = false;
                System.out.println("Vui lòng nhập vào 1 số");
            }
        } while (!checkSwimPoolArea);


        boolean checkStories = false;
        int stories = 0;
        do {
            try {
                scanner = new Scanner(System.in);
                System.out.print("Số tầng : ");
                stories = scanner.nextInt();
                if (stories <= 0) {
                    System.out.println("Vui lòng kiểm tra lại !");
                } else {
                    checkStories = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Vui lòng vào 1 số");
                checkStories = false;
            }

        } while (!checkStories);


        System.out.println("Successfully");
        return new Villa(id, serviceName, usedArea, rentCost, peoples, typeOfRent, standardOfRoom, details, swimPoolArea, stories);
    }

    static House addHouse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin Room : ");

        boolean checkID;
        String id;
        do {
            ArrayList<House> houses = ReadWriteData.loadHouseList();
            System.out.println("Danh sách House : " +houses.size());
            houses.forEach(item-> System.out.println(item.getId()));
            System.out.print("Nhập ID (SVHO-XXXX):");
            id = scanner.nextLine();
            String pattern = "(SVHO)+-\\d{4}$";
            checkID = (Pattern.matches(pattern, id));
            if (!checkID) {
                System.out.println("Nhập sai format - SVHO-XXXX");
            }
            if(isExistInHouseList(houses,id)){
                checkID = false;
                System.out.println("Vui lòng kiểm tra lại. ID này đã tồn tại trong danh sách!");
            }
        } while (!checkID);


        String serviceName;
        boolean checkServiceName;
        do {
            String pattern = "[A-Z]+[a-z0-9]{1,}$";
            System.out.print("Nhập tên House :");
            serviceName = scanner.nextLine();
            checkServiceName = Pattern.matches(pattern, serviceName);
            if (!checkServiceName) {
                System.out.println("Vui lòng nhập đúng định dạng : bắt đầu là ký tự in hoa, sau đó là các ký tự thường. VD : House1");
            }
        } while (!checkServiceName);


        float usedArea = 0;
        boolean checkUsedArea;
        do {
            try {
                scanner = new Scanner(System.in);
                String pattern = "(([3-9]\\d)|(\\d{3,}))($|(\\s+)|(.\\d+))$";
                System.out.print("Nhập diện tích sử dụng s(>=30m2) : ");
                usedArea = scanner.nextFloat();
                checkUsedArea = Pattern.matches(pattern, usedArea + "");
                if (!checkUsedArea) {
                    System.out.println("Vui lòng nhập lại diện tích sử dụng : >=30m2");
                }
            } catch (InputMismatchException e) {
                checkUsedArea = false;
                System.out.println("Vui lòng nhập vào 1 số!");
            }
        } while (!checkUsedArea);

        boolean checkRentCost;
        int rentCost = 0;
        do {
            try {
                scanner = new Scanner(System.in);
                System.out.print("Giá thuê : ");
                rentCost = scanner.nextInt();
                if (rentCost <= 0) {
                    checkRentCost = false;
                    System.out.printf("Giá thuê phải là 1 số dương. Vui lòng nhập lại!");
                } else {
                    checkRentCost = true;
                }
            } catch (InputMismatchException e) {
                checkRentCost = false;
                System.out.println("Vui lòng nhập vào 1 số nguyên dương!");
            }
        } while (!checkRentCost);

        boolean checkMaxPeoples;
        int peoples = 0;
        do {
            try {
                scanner = new Scanner(System.in);
                System.out.print("Số lượng khách tối đa (1-20): ");
                peoples = scanner.nextInt();
                if (peoples <= 0 || peoples > 20) {
                    checkMaxPeoples = false;
                    System.out.println("Vui lòng nhập lại.");
                } else {
                    checkMaxPeoples = true;
                }
            } catch (InputMismatchException e) {
                checkMaxPeoples = false;
                System.out.println("Vui lòng nhập vào 1 số!");
            }
        } while (!checkMaxPeoples);


        boolean checkTypeOfRent = false;
        String typeOfRent;
        do {
            scanner = new Scanner(System.in);
            System.out.print("Kiểu thuê (D(Day),W(Week),M(Month) :");
            typeOfRent = scanner.nextLine();
            if (typeOfRent.equals("D") | typeOfRent.equals("Day") |
                    typeOfRent.equals("W") | typeOfRent.equals("Week") |
                    typeOfRent.equals("M") | typeOfRent.equals("Month")) {
                checkTypeOfRent = true;
                switch (typeOfRent) {
                    case "D": {
                        typeOfRent = "Day";
                        break;
                    }
                    case "W": {
                        typeOfRent = "Week";
                        break;
                    }
                    case "M": {
                        typeOfRent = "Month";
                        break;
                    }
                }
            } else {
                System.out.println("Vui lòng nhập lại đúng định dạng !");
            }
        } while (!checkTypeOfRent);


        System.out.print("Thông tin chi tiết : ");
        String details = scanner.nextLine();
        System.out.print("Tiêu chuẩn phòng :");
        String standardOfRoom = scanner.nextLine();


        boolean checkStories = false;
        int stories = 0;
        do {
            try {
                scanner = new Scanner(System.in);
                System.out.print("Số tầng : ");
                stories = scanner.nextInt();
                if (stories <= 0) {
                    System.out.println("Vui lòng kiểm tra lại !");
                } else {
                    checkStories = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Vui lòng vào 1 số");
                checkStories = false;
            }
        } while (!checkStories);


        System.out.println("Successfully");
        return new House(id, serviceName, usedArea, rentCost, peoples, typeOfRent, standardOfRoom, details, stories);
    }

    public static boolean isExistInVillaList(ArrayList<Villa> villas, String ID) {
        for (int i = 0; i < villas.size(); i++) {
            if (villas.get(i).getId().equals(ID)) {
                return true;
            }
        }
        return false;
    }
    public static boolean isExistInHouseList(ArrayList<House> houses, String ID) {
        for (int i = 0; i < houses.size(); i++) {
            if (houses.get(i).getId().equals(ID)) {
                return true;
            }
        }
        return false;
    }
    public static boolean isExistInRoomList(ArrayList<Room> rooms, String ID) {
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).getId().equals(ID)) {
                return true;
            }
        }
        return false;
    }
}
