package Bai1_NgonNguLapTrinh.baitap;

import java.util.Scanner;

public class HienThiSoNguyenToNhoHonN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giới số nguyên tố bạn muốn xem (<number) : ");
        int number = scanner.nextInt();
        if(number<2){
            System.out.println("Không tồn tại số nguyên tố nào < " + number);
        }else {
            System.out.println("Dãy số nguyên tố : ");
            for (int i = 2; i <=number ; i++) {
                if(isNguyenTo(i)){
                    System.out.print(i + " ");
                }
            }
        }


    }

    public static boolean isNguyenTo(int number) {
        boolean isNT = true;
        if(number==2){
            return true;
        }else{
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isNT = false;
                    break;
                }
            }
        }
        return isNT;
    }
}
