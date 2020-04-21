package Bai3_OOP.thuchanh;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] x = new int[15];
        randomValue(x);
    Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Nhập vào phần tử bạn muốn xem giá trị trong mảng ");
            int  i = scanner.nextInt();
            System.out.println("Giá trị của phần từ thứ " +i + " là " + x[i]);
        }catch (java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("Lỗi index nằm ngoài phạm vi của mang index > " + (x.length-1) );
        }catch (InputMismatchException e){
            System.out.println("Vui lòng nhập 1 số");
            System.out.println(x[1]);
        }
    }

    public static void randomValue(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
