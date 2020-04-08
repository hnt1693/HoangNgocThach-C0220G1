package MangVaPhuongThuc.baitap;

import java.util.Random;
import java.util.Scanner;

public class ChenVaoMang {
    public static void main(String[] args) {
        int[] arr = new int[10];
        randomValue(arr);
        Scanner scanner = new Scanner(System.in);
        showArray(arr);
        System.out.println();
        int index;
        do {
            System.out.println("bạn nhập vị trí muốn chèn (0-9)");
            index = scanner.nextInt();
        } while (index > 9 || index < 0);
        System.out.println("Giá trị : ");
        int value = scanner.nextInt();

        insertValueToArray(index, value, arr);
        showArray(arr);

    }


    static public void randomValue(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);

        }
    }

    static public void insertValueToArray(int index, int value, int[] arr) {
        for (int i = arr.length - 2; i > index - 1; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = value;

    }

    static public void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
