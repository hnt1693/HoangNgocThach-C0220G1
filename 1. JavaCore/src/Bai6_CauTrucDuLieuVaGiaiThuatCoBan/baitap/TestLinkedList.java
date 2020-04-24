package Bai6_CauTrucDuLieuVaGiaiThuatCoBan.baitap;


public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.addLast(5);
        myLinkedList.addFirst(6);
        myLinkedList.addFirst(7);
        myLinkedList.display();
        System.out.println();

        MyLinkedList<Integer> myCloneList = myLinkedList.getClone();
        System.out.println("Them phan tu 4 vao cuoi - sau do in cloneLinkedList");
        myCloneList.addLast(4);
        myCloneList.display();

        System.out.println();
//
        myCloneList.remove(1);

        System.out.println();
        myCloneList.display();

    }
}
