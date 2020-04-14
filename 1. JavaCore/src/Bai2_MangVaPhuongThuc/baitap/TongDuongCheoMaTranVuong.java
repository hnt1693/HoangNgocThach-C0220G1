package Bai2_MangVaPhuongThuc.baitap;

import java.util.Random;

public class TongDuongCheoMaTranVuong {
    public static void main(String[] args) {
        int n =3;
        int[][] arr = new int[n][n];
        randomValueMatix(arr);
        tongDuongCheo(arr);
    }

    public static void randomValueMatix(int[][] a) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = random.nextInt(10);
                if (a[i][j] < 10) {
                    System.out.printf("%3s", a[i][j] +" ");
                } else {
                    System.out.printf("%2s", a[i][j] +" ");
                }
            }
            System.out.println();
        }
    }
    public static void  tongDuongCheo(int[][] a){
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                if(i==j){
                    sum1+=a[i][j];
                }
                if(i+j==a.length-1){
                    sum2+=a[i][j];
                }
            }

        }
        System.out.println("Tổng đường chéo chinh là : " +sum1);
        System.out.println("Tổng đương chéo phụ là :   " + sum2);
    }
}
