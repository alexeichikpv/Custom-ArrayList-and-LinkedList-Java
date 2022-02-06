package org.example;

public interface CustomList<T> {

    void add(Object element);

    T printById(int id);

    T replace(int id, T element);

    T remove(int id);

    int size(int size);

}
