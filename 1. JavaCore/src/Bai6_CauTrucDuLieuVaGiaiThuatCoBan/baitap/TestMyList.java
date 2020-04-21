package Bai6_CauTrucDuLieuVaGiaiThuatCoBan.baitap;

import Bai4_DaHinhVaKeThua.thuchanh.Circle;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Circle> myList = new MyList<>();
        myList.add(new Circle(10));
        myList.add(new Circle(15));
        myList.add(new Circle(12));
        myList.display();
        System.out.println("List được clone sang myCloneList và remove 1 phần tử");
        MyList<Circle> myCloneList = myList.getClone();
        Circle a = myCloneList.remove(1);
        myCloneList.display();




    }
}
