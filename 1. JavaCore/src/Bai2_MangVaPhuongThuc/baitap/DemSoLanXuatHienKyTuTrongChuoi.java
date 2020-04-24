package Bai2_MangVaPhuongThuc.baitap;

import java.util.Scanner;

public class DemSoLanXuatHienKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Hoang Ngoc Thach";
        System.out.println(str);
        System.out.println("Ký tự bạn muốn kiểm tra số lần xuất hiện trong chuôĩ ?");
        String str2 = scanner.next();
        char i = str2.charAt(0);
        System.out.println("ký tự '"+ i + "' xuất hiện " + countChar(i,str) + " lần trong chuỗi");


    }
    public void showName(){
        System.out.println("haha");
    }
    public  static int countChar(char a, String string){
        int count = 0;
        for (int i = 0; i <string.length() ; i++) {
            if(a == string.charAt(i)){
                count+=1;
            }

        }
        return count;
    }
}
