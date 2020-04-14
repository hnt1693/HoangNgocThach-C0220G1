package Bai2_MangVaPhuongThuc.baitap;

import java.util.Random;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[5];

        randomValue(arr1);
        showArray(arr1);
        System.out.println();
        randomValue(arr2);
        showArray(arr2);
        System.out.println();
        int[] arr3 = concatArr(arr1,arr2);
        showArray(arr3);

    }

    static public void randomValue(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);

        }
    }

    static public void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static public int[] concatArr(int[] a, int[] b) {
        int[] c = new int[a.length+b.length];
        for (int i = 0; i < a.length; i++) {
            c[i]=a[i];
        }
        for (int i = 0; i <b.length ; i++) {
            c[i+a.length]=b[i];
        }
    return c;
    }
}

