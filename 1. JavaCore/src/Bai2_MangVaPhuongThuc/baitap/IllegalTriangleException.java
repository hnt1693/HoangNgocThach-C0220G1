package Bai2_MangVaPhuongThuc.baitap;

import java.util.Scanner;

public class IllegalTriangleException extends RuntimeException {


    public IllegalTriangleException(String messenge) {
        super(messenge);
    }

    public static void checkPad(int pad1, int pad2, int pad3) throws IllegalTriangleException {
        if (pad1 < 0 || pad2 < 0 || pad3 < 0) {
            throw new IllegalTriangleException("Lỗi chiều dài cạnh là số âm");
        } else if (pad1 >= pad2 + pad3 || pad2 >= pad1 + pad3 || pad3 >= pad2 + pad1) {
            throw new IllegalTriangleException("Lỗi 3 cạnh không tạo nên 1 tam giác được");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 3 cạnh của tam giác :");
        System.out.println("Cạnh thứ 1 :");
        int pad1 = scanner.nextInt();
        System.out.println("Cạnh thứ 2 :");
        int pad2 = scanner.nextInt();
        System.out.println("Cạnh thứ 3 :");
        int pad3 = scanner.nextInt();
        checkPad(pad1, pad2, pad3);

    }


}
