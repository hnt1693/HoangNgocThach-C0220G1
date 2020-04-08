package MangVaPhuongThuc.baitap;

import java.util.Random;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] ar1 = new int[10];
        randomValue(ar1);
        showArray(ar1);
        System.out.println();
        int index;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Nhập vào vị trí bạn muốn xóa");
            index = scanner.nextInt();
        }while (index<0||index>=ar1.length);
        deleteValueByIndex(index,ar1);
        showArray(ar1);
    }

    static public void randomValue(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);

        }
    }

    static public void deleteValueByIndex(int index, int[] arr) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }

    static public void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
