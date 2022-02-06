package org.example;

import java.util.Objects;

public class CustomLinkedList<T> {

    private Elem head;

    public CustomLinkedList() {
        head = null;
    }

    public class Elem {
        public T data;
        public Elem next;

        public Elem(T data) {
            this.data = data;
            next = null;
        }
    }

    public void add(T data) {
        Elem newElem = new Elem(data);
        Elem currentElem = head;
        if (head == null) {
            head = newElem;
        } else {
            while (currentElem.next != null) {
                currentElem = currentElem.next;
            }
            currentElem.next = newElem;
        }
    }


    //если элемент удалён, завершить работу метода
    // все решалось одним брейком?
    public T remove(T data) {
        Elem currentElem = head;
        Elem previousElem = null;
        while (currentElem.next != null) {
            if (currentElem.data.equals(data)) {
                if (currentElem == head) {
                    head = currentElem.next;
                } else {
                    previousElem.next = currentElem.next;
                    break;
                }
            }
            previousElem = currentElem;
            currentElem = currentElem.next;
        }
        return data;
    }

    //если элемент заменён, завершить работу метода
    // все решалось одним брейком?
    public T replace(T data, T newData) {
        Elem currentElem = head;
        while (currentElem.next != null) {
            if (currentElem.data.equals(data)) {
                currentElem.data = newData;
                break;
            } else {
                currentElem = currentElem.next;
            }
        }
        return data;
    }

    public void getAll() {
        Elem element = head;
        if (head != null) {
            System.out.println(head.data);
        }
        while (Objects.requireNonNull(element).next != null) { //while Objects.nonNull(element) (хочу заметить шо так нихуя не работает)
            element = element.next;
            System.out.println(element.data);
        }
    }
}
