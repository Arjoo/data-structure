package com.arjoo.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

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

        System.out.print("Original linkedlist : ");
        linkedListApplication.print();

        //****************
        // Reverse the linked list
        //****************
        //System.out.print("Reverse linkedlist : ");
        //linkedListApplication.reverse();
        //linkedListApplication.print();


        //****************
        // Recursive Reverse the linked list
        //****************
        // System.out.print("Reverse linkedlist : ");
        // linkedListApplication.reverseRecursive();

        //****************
        // Retrieve first element from the list
        //****************

        Optional<Integer> retrieveFirst = linkedListApplication.retrieveFirst();
        retrieveFirst.ifPresent(System.out::println);

        //****************
        // Print Linked list in reverse order
        //****************
        /*System.out.print("Reverse linkedlist : ");
        linkedListApplication.printInReverseOrder();
        System.out.println();*/


        //****************
        // Clearing the list
        //****************
        linkedListApplication.clear();
        size = linkedListApplication.size();
        System.out.println("After clearing size: " + size);



        //*********************
        // Sort a LinkedList using mergeSort
        //********************
        /*System.out.println("Sorting a linked List");

        SinglyLinkedListApplication<Integer> l1= new SinglyLinkedListApplication<>();
        l1.addAll(Arrays.asList(1, 3, 4, 5, 2, 9, 6));
        Node<Integer> head = l1.getHead();

        Comparator<Number> comparator = new Comparator<>() {
            @Override
            public int compare(Number i1, Number i2) {
                if(i1.equals(i2))
                    return 0;
                else {
                    return i1.intValue() < i2.intValue() ? -1 : 1;
                }
            }
        };
        Node<Integer> headOfSortedList = l1.sort(head, comparator);
        Node<Integer> temp = headOfSortedList;
        while (temp != null) {
            System.out.print(temp.value + ", ");
            temp = temp.next;
        }*/

    }
}
