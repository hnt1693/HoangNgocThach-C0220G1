package Bai2_MangVaPhuongThuc.baitap;

import java.util.Random;
import java.util.Scanner;

public class TongPhanTuMotCot {
    public static void main(String[] args) {
        int[][] arr = new int[4][3];
        randomValueMatix(arr);
        Scanner scanner = new Scanner(System.in);
        int indexColumn;
        do {
            System.out.print("Nhập số cột bạn muốn tính tổng : ");
            indexColumn = scanner.nextInt();
        } while (indexColumn < 0 || indexColumn > arr.length);
        sumByColumn(indexColumn,arr);
    }

    public static void randomValueMatix(int[][] a) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = random.nextInt(10);
                if (a[i][j] < 10) {
                    System.out.printf("%3s", a[i][j] + " ");
                } else {
                    System.out.printf("%2s", a[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void sumByColumn(int indexColumn, int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i][indexColumn];
        }
        System.out.println("Tổng các phần tử trong cột " + indexColumn + " là " + sum);
    }
}
