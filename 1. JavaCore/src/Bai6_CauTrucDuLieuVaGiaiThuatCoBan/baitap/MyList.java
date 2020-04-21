package Bai6_CauTrucDuLieuVaGiaiThuatCoBan.baitap;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(int index, E element) {
        if (size == elements.length || element == null) {
            ensureCapacity();
        }
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Lỗi chỉ số index : " + index + " với size : " + size);
        } else {
            for (int i = size; i > index; i--) {
                elements[i] = elements[i - 1];

            }
            elements[index] = element;
            size++;
            System.out.println(elements.length + "size" + size);
        }
    }

    boolean add(E e) {

        if (size == elements.length || elements == null) {
            ensureCapacity();
        }

        elements[size] = e;
        size++;

        return true;
    }

    E remove(int index) {
        E elementInIndex = (E) elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return elementInIndex;
    }

    int size() {
        return this.size;
    }

    public MyList<E> getClone() {
        MyList<E> cloneList = new MyList<>();
        cloneList.size = this.size;
        cloneList.elements = Arrays.copyOf(elements, elements.length);
        return cloneList;
    }

    public boolean contains(E o) {
        for (Object ob : elements
        ) {
            if (ob.equals(o)) {
                return true;
            }
        }
        return false;
    }

    E get(int index) {
        if (index < 0 || index > elements.length) {
            throw new IndexOutOfBoundsException("Lỗi index :" + index + " nằm ngoài size :" + size);
        } else {
            return (E) elements[index];
        }
    }

    void clear() {
        size = 0;
        elements = new Object[0];
    }

    void display() {
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                System.out.println(elements[i]);
            }
        }

    }

    void ensureCapacity() {
        int newCapacity = elements.length * 2 + 1;
        elements = Arrays.copyOf(elements, newCapacity);
    }
}
