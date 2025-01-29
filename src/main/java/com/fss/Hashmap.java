package com.fss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {

        System.out.println("ArrayList Example:");
        ArrayList<Integer> array = new ArrayList<>();
        array.add(10);
        array.add(5);
        array.add(20);
        array.add(15);

        System.out.println("Original List: " + array);

        Collections.sort(array);
        System.out.println("Sorted List: " + array);

        System.out.println("\nHashSet Example:");
        HashSet<String> namesSet = new HashSet<>();
        namesSet.add("Aravind");
        namesSet.add("babu");
        namesSet.add("arun");
        namesSet.add("Aravind");

        System.out.println("Unique Names: " + namesSet);

        System.out.println("\nHashMap Example:");
        HashMap<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Akash", 85);
        studentScores.put("chandru", 92);
        studentScores.put("dinesh", 78);
        studentScores.put("inigo", 90);

        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
