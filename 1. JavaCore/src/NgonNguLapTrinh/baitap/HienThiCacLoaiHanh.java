package NgonNguLapTrinh.baitap;

public class HienThiCacLoaiHanh {
    public static void main(String[] args) {
        showRect(4, 5);
        showEmptyRect(4, 5);
        showTriangle(5);
    }

    public static void showRect(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        ;
    }

    public static void showEmptyRect(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (((i < 1) || (i == a - 1)) || (j < 1 || j == b - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }


            }
            System.out.println();
        }
        ;
    }

    public static void showTriangle(int a) {
        for (int i = 0; i <a ; i++) {
            for (int j = 0; j <a ; j++) {
                if(i<=j){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
