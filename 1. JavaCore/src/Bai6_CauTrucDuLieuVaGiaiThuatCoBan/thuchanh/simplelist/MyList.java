package Bai6_CauTrucDuLieuVaGiaiThuatCoBan.thuchanh.simplelist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (elements.length == DEFAULT_CAPACITY) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int index) {
        if (index < 0 || index > size-1) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        } else {
            return (E) elements[index];
        }

    }
}
