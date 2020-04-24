package Bai6_CauTrucDuLieuVaGiaiThuatCoBan.thuchanh.simplelist;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> integerMyList = new MyList<>();
        integerMyList.add(15);
        integerMyList.add(12);
        integerMyList.add(15);
        integerMyList.add(14);
        integerMyList.add(1);
        integerMyList.add(15);
        integerMyList.add(12);
        integerMyList.add(15);
        integerMyList.add(14);
        integerMyList.add(1);
        System.out.println(integerMyList.get(10));

    }
}
