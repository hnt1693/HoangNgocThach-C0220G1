package NgonNguLapTrinh.baitap;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tiền bạn gửi :");
        int money = scanner.nextInt();
        System.out.println("Nhập vào lãi suất hằng năm ");
        float ls = scanner.nextFloat();
        System.out.println("Số tháng bạn gửi :");
        int months= scanner.nextInt();
        float moneyLai = money*ls/12*months/100;
        System.out.println("Lãi bạn có là : " + moneyLai);
    }
}
