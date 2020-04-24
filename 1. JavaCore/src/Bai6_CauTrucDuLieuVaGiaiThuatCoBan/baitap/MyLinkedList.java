package Bai6_CauTrucDuLieuVaGiaiThuatCoBan.baitap;

import org.w3c.dom.Node;

import java.util.Arrays;

public class MyLinkedList<E> {
    private Node head = null;
    int numNode = 0;

    public MyLinkedList() {
    }

    void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNode++;
    }

    int size() {
        return numNode;
    }

    MyLinkedList<E> getClone() {
        MyLinkedList<E> cloneLinkedList = new MyLinkedList<>();
        Node temp = head;
        while (temp != null) {
            cloneLinkedList.addLast((E) temp.getData());
            temp = temp.next;

        }


        return cloneLinkedList;
    }

    void addLast(E element) {
        if (head == null) {
            head = new Node(element);
            head.next = null;
            numNode++;
        } else {
            getNode(numNode - 1).next = new Node(element);
            getNode(numNode).next = null;
            numNode++;
        }
    }

    void add(int index, E element) {
        if (index < 0 || index > numNode) {
            throw new IndexOutOfBoundsException("Lỗi chèn ngoài phạm  vi");
        } else if (index == 0) {
            addFirst(element);

        } else {
            Node temp = getNode(index - 1);
            Node temp2 = getNode(index);
            temp.next = new Node(element);
            temp.next.next = temp2;
            numNode++;

        }

    }

    E remove(int index) {
        if (index < 0 || index > numNode) {
            throw new IndexOutOfBoundsException("Lỗi index ngoài phạm vi List");
        } else {
            if (index == 0) {
                Node temp = getNode(index);
                System.out.println(temp.toString());
                head = getNode(index + 1);
                numNode--;
                return (E) temp.getData();

            } else if (index == numNode - 1) {
                Node temp = getNode(index);
                getNode(index - 1).next = null;
                numNode--;
                return (E) temp.getData();

            } else {
                Node temp = getNode(index);
                getNode(index - 1).next = getNode(index + 1);
                numNode--;
                return (E) temp.getData();
            }


        }
    }

    boolean contain(E element) {
        Node temp = head;
        while (temp != null) {
            if (temp.getData().equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        return false;

    }

    E getFirst() {
        return (E) get(0);
    }

    E getLast() {
        return (E) get(numNode - 1);
    }

    boolean remove(E e) {
        boolean isRemoved = false;
        while (indexOf(e) != -1) {
            remove(indexOf(e));
            isRemoved = true;
        }
        return isRemoved;
    }

    void clear() {
        head = null;
    }

    int indexOf(E o) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.getData().equals(o)) {
                return index;
            }
            temp = temp.next;
            index++;

        }
        return -1;
    }

    void display() {
        Node index = head;
        while (index != null) {
            System.out.println(index.getData());
            index = index.next;
        }
    }

    public E get(int index) {
        if (index < 0 || index > numNode) {
            throw new IndexOutOfBoundsException("Lỗi ngoài phạm vi truy xuất. List mảng có : " + numNode + " truy xuất tại vị trí " + index);
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return (E) temp.getData();
        }

    }

    private Node getNode(int index) {
        if (index < 0 || index > numNode) {
            throw new IndexOutOfBoundsException("Lỗi ngoài phạm vi truy xuất. List mảng có : " + numNode + " truy xuất tại vị trí " + index);
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }

    }

    public class Node {

        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }


    }
}
