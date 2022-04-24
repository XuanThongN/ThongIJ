package collections;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;
    private E[] elements;

    public MyArrayList() {
        this.elements = (E[]) new Object[DEFAULT_SIZE];
    }

    private void ensureCapacity() {
        int newSize = elements.length + DEFAULT_SIZE;
        elements = Arrays.copyOf(elements, newSize);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public E get(int index) {
        return elements[index];
    }

    @Override
    public void add(E e) {
        if (this.size >= elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }

    @Override
    public void add(int index, E e) {
        if (this.size >= elements.length) {
            ensureCapacity();
        }
        for (int i = size; i >= index; i--) {
            E temp = elements[i];
            elements[i] = elements[i+1];
            elements[i+1] = temp;
        }
        elements[index] = e;
        size++;
    }

    @Override
    public E remove(int index) {
        E deletedElement = elements[index];
        for (int i = index; i < elements.length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return deletedElement;
    }

    @Override
    public boolean contain(E e) {
        for (E a : elements) {
            if (a == e) return true;
            break;
        }
        return false;
    }

    @Override
    public int indexOf(E e) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == e) return i;
            break;
        }
        return -1;
    }

    @Override
    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    @Override
    public String toString() {
        for (E a: elements
             ) {
            return (String) a;
        }
        return elements.toString();
    }


}
