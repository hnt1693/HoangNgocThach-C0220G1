package Bai2_MangVaPhuongThuc.thuchanh;

import java.util.Random;

public class DaoNguocPhanTuTronMang {
    public static void main(String[] args) {
        int[] arr = new int[5];
        randomValueMatix(arr);
        revertArray(arr);
        showArray(arr);
        int n =3;
                  }

    public static void randomValueMatix(int[] a) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
            System.out.printf("%2s", a[i] + " ");
        }
        System.out.println();
    }

    public static void revertArray(int[] arr) {
        if (arr.length % 2 == 0) {
            for (int i = 0; i <arr.length/2 ; i++) {
                int temp = 0;
                temp =arr[i];
                arr[i] = arr[arr.length-1-i];
                arr[arr.length-1-i] = temp;
            }

        }else {
            for (int i = 0; i <=arr.length/2 ; i++) {
                int temp = 0;
                temp =arr[i];
                arr[i] = arr[arr.length-1-i];
                arr[arr.length-1-i] = temp;
            }
        }


    }
    static public void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
