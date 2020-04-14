package Bai2_MangVaPhuongThuc.thuchanh;

import java.util.Random;

public class GiaTriLonNhatMang2Chieu {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }
        System.out.println(" Max giá trị trong mảng random là " + maxValueInArr(arr));
    }

    public static int maxValueInArr(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
                if (arr[i][j] < 10) {
                    System.out.printf("%3s", arr[i][j] + " ");
                } else {
                    System.out.printf("%2s", arr[i][j] + " ");
                }
            }
            System.out.println();
        }
        return max;

    }
}
