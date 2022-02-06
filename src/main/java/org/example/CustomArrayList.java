package org.example;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class CustomArrayList<T> implements CustomList<T> {
    private int size = 0;
    private int capacity = 10;

    Object[] objects = new Object[capacity];

    @Override
    public void add(Object element) {
        if (size < capacity) {
            if (objects[size] == null) {
                objects[size] = element;
                size++;
            }
        } else {
            int oldCapacity = objects.length;
            int newCapacity = oldCapacity + ((oldCapacity * 3) / 2);
            objects = Arrays.copyOf(objects, newCapacity);
            objects[oldCapacity] = element;
            size++;
            capacity = newCapacity;
        }
    }

    @Override
    public T printById(int id) {
        checkPos(id);
        return (T) objects[id];
    }

    @Override
    public T replace(int id, T element) {
        checkPos(id);
        T replacedElement = (T) objects[id];
        objects[id] = element;
        return replacedElement;
    }

    @Override
    public T remove(int id) {
        checkPos(id);
        T removedElement = (T) objects[id];
        objects[id] = null;
        return removedElement;
    }

    public void checkPos(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(id));
        }
    }

    public String outOfBoundsMsg(int id) {
        return "\nТы всё сломал. Элемента с индексом " + id + " не существует в массиве.";
    }

    @Override
    public int size(int size) {
        return size;
    }

    @Override
    public String toString() {
        return "------------------------------------------------------------------------\n" +
                "Size of your list is " + size +
                ", and capacity is " + capacity +
                "\n" + Arrays.toString(objects) +
                "\n------------------------------------------------------------------------";
    }

}
