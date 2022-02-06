package org.example;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        CustomList<Integer> listOfInts = new CustomArrayList<>();
//        Stream.of(4, 8, 15, 16, 23, 42, 23, 16, 15, 8, 4, 8, 15, 16).forEach(listOfInts::add);
//        System.out.println("Ваш лист: ");
//        System.out.println(listOfInts);
        CustomLinkedList<Integer> customLinkedList = new CustomLinkedList<>();
        customLinkedList.add(2);
        customLinkedList.add(5);
        customLinkedList.add(69);
        customLinkedList.add(8);
        customLinkedList.add(12);
        customLinkedList.add(69);
        customLinkedList.add(21);
        customLinkedList.add(45);
        customLinkedList.getAll();
        System.out.println("*************************");
//        System.out.println("Удаляемый эелемент - " + customLinkedList.remove(69));
//        customLinkedList.getAll();
//        System.out.println("*************************");
        System.out.println("Заменяемый эелемент - " + customLinkedList.replace(69, 420));
        customLinkedList.getAll();
        System.out.println("*************************");

    }
}