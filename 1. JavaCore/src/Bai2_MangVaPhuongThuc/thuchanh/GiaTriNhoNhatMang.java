package Bai2_MangVaPhuongThuc.thuchanh;

import java.util.Random;

public class GiaTriNhoNhatMang {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(100);
        }
        showArray(arr);
        System.out.println("giá trị nhỏ nhất của mảng là : "  + minValueInArr(arr));
    }

    public static int minValueInArr(int[] arr) {
        int min = arr[0];
        ;
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
