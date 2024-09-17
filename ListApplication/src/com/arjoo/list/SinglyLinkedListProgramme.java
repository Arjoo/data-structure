package com.arjoo.list;

import java.util.Arrays;
import java.util.List;

public class SinglyLinkedListProgramme {
    public static void main(String[] args) {
        SinglyLinkedListApplication<Integer> linkedListApplication = new SinglyLinkedListApplication<>();

        //****************
        // Creating List
        //****************
        linkedListApplication.add(10);
        linkedListApplication.add(20);
        linkedListApplication.add(30);

        //****************
        // Adding element at specific position List
        //****************
        linkedListApplication.add(1, 50);
        linkedListApplication.add(2, 40);

        //****************
        // Add collection
        //****************
        List<Integer> elements = Arrays.asList(100, 200, 300);
        linkedListApplication.addAll(elements);

        //****************
        // Add collection at index
        //****************
        elements = Arrays.asList(500, 600, 700);
        linkedListApplication.addAll(3, elements);

        //****************
        // Print complete list
        //****************
        linkedListApplication.print();

        //****************
        // Contains element
        //****************
        int element = 600;
        boolean contains = linkedListApplication.contains(element);
        System.out.println("\nContains : "+ contains);

        //****************
        // Size of the list
        //****************
        int size = linkedListApplication.size();
        System.out.println("Size: " + size);

        //****************
        // Get element from of the list
        //****************
        int indexElement = linkedListApplication.get(7);
        System.out.println("indexElement: " + indexElement);

        //****************
        // Find index of the element
        //****************
        int index = linkedListApplication.indexOf(600);
        System.out.println("index: " + index);

        //****************
        // Clearing the list
        //****************
        linkedListApplication.clear();
        size = linkedListApplication.size();
        System.out.println("After clearing size: " + size);

    }
}
