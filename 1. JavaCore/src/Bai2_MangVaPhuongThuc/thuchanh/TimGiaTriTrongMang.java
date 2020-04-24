package Bai2_MangVaPhuongThuc.thuchanh;

import java.util.Random;
import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        int size = 10;
        int[][] arr = new int[size][size];
        randomValueMatix(arr);
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập gia trị bạn muốn tìm : ");
        int value = scanner.nextInt();
        findValueInMaxtrix(value,arr);
    }

    public static void randomValueMatix(int[][] a) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = random.nextInt(100);
                if (a[i][j] < 10) {
                    System.out.printf("%3s", a[i][j] + " ");
                } else {
                    System.out.printf("%2s", a[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void findValueInMaxtrix(int value, int[][] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (value == a[i][j]) {
                    count+=1;
                    System.out.println("Giá trị " +value + " xuất hiện lần thứ " + count + " ở hàng " + i
                    +" cột " + j);

                }
            }
        }
        if(count==0){
            System.out.println("không tim thấy giá trị trong mảng");
        }
    }
}
