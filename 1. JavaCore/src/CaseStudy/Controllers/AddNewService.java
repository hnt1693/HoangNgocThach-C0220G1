package CaseStudy.Controllers;

import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Services;
import CaseStudy.Models.Villa;

import java.util.Scanner;

public class AddNewService {
    static Room addRoom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin Room : ");
        System.out.print("Nhập diện tích sử dụng (m2) : ");
        float usedArea = scanner.nextFloat();
        System.out.print("Giá thuê : ");
        int rentCost = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Số lượng khách tối đa : ");
        int peoples = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Kiểu thuê (Theo ngày, theo tuần, theo tháng ) :");
        String typeOfRent = scanner.nextLine();
        System.out.print("Dịch vụ miễn phí : ");
        String freeServices = scanner.nextLine();
        return new Room(usedArea, rentCost, peoples, typeOfRent, freeServices);
    }

    static Villa addVilla() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin Room : ");
        System.out.print("Nhập diện tích sử dụng (m2) : ");
        float usedArea = scanner.nextFloat();
        System.out.print("Giá thuê : ");
        int rentCost = scanner.nextInt();
        System.out.print("Số lượng khách tối đa : ");
        int peoples = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Kiểu thuê (Theo ngày, theo tuần, theo tháng ) :");
        String typeOfRent = scanner.nextLine();
        System.out.print("Thông tin chi tiết : ");
        String details = scanner.nextLine();
        System.out.print("Tiêu chuẩn phòng :");
        String standardOfRoom = scanner.nextLine();
        System.out.print("Diện tích bể bơi (m2) :");
        float swimPoolArea = scanner.nextFloat();
        System.out.print("Số tầng : ");
        int stories = scanner.nextInt();
        System.out.println("Successfully");
        return new Villa(usedArea, rentCost, peoples, typeOfRent, standardOfRoom, details, swimPoolArea, stories);
    }

    static House addHouse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin Room : ");
        System.out.print("Nhập diện tích sử dụng (m2) : ");
        float usedArea = scanner.nextFloat();
        System.out.print("Giá thuê : ");
        int rentCost = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Số lượng khách tối đa : ");
        int peoples = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Kiểu thuê (Theo ngày, theo tuần, theo tháng ) :");
        String typeOfRent = scanner.nextLine();
        System.out.print("Thông tin chi tiết : ");
        String details = scanner.nextLine();
        System.out.print("Tiêu chuẩn phòng :");
        String standardOfRoom = scanner.nextLine();
        System.out.print("Số tầng : ");
        int stories = scanner.nextInt();
        return new House(usedArea, rentCost, peoples, typeOfRent, standardOfRoom, details, stories);
    }
}
