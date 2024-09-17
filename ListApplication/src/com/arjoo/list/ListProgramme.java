package com.arjoo.list;

import java.util.Arrays;
import java.util.List;

public class ListProgramme {
    public static void main(String[] args) {
        ListApplication<Integer> listApplication = new ListApplication<>();

        //****************
        // Creating List
        //****************
        listApplication.add(10);
        listApplication.add(20);
        listApplication.add(30);

        //****************
        // Adding element at specific position List
        //****************
        listApplication.add(1, 50);
        listApplication.add(2, 40);

        //****************
        // Add collection
        //****************
        List<Integer> elements = Arrays.asList(100, 200, 300);
        listApplication.addAll(elements);

        //****************
        // Print complete list
        //****************
        listApplication.print();

        //****************
        // Size of the list
        //****************
        int size = listApplication.size();
        System.out.println("\nSize: " + size);

    }
}
