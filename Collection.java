package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Collection {
    public static void main(String[] args) {
        // Create an ArrayList of integers, add some elements, and print the list
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8758);
        numbers.add(163);
        numbers.add(89);
        numbers.add(231);
        System.out.println("ArrayList: " + numbers);

        // Sort the list in ascending order and print the sorted list
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);

        // Create a HashSet to store unique names and display them
        HashSet<String> names = new HashSet<>();
        names.add("Peter Parker");
        names.add("Iron Man");
        names.add("Thor");
        names.add("Peter Parker"); // Duplicate entry, will not be added
        System.out.println("HashSet: " + names);

        // Create a HashMap to store student names as keys and their scores as values
        HashMap<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Peter Parker", 85);
        studentScores.put(" Iron Man", 92);
        studentScores.put("Thor", 78);
        studentScores.put("Vision", 90);
        System.out.println("HashMap: " + studentScores);
    }
}

