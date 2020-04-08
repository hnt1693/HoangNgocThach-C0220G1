package MangVaPhuongThuc.baitap;

import java.util.Scanner;

public class IllegalTriangleException extends RuntimeException {


    public IllegalTriangleException(String messenge) {
        super(messenge);
    }

    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 3 cạnh của tam giác :");
        System.out.println("Cạnh thứ 1 :");
        int pad1 = scanner.nextInt();
        System.out.println("Cạnh thứ 2 :");
        int pad2 = scanner.nextInt();
        System.out.println("Cạnh thứ 3 :");
        int pad3 = scanner.nextInt();
        

    }

    public static class checkTriangle {

        public checkTriangle(int x, int y, int z) {
            if (x < 0 || y < 0 || z < 0) {
                throw new IllegalTriangleException("Lỗi chiều dài cạnh là số âm");
            }
        }
    }
}
