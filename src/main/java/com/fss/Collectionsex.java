package com.fss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Collectionsex {
     public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(71);
        list.add(45);
        list.add(82);
        list.add(31);
        list.add(65);
        System.out.println("ArrayList: " + list);
        Collections.sort(list);
        System.out.println("Sorted ArrayList: " + list);

        HashSet<String> names = new HashSet<>();
        names.add("Ram");
        names.add("Rithika");
        names.add("Vicky");
        names.add("John");
        System.out.println("HashSet: " + names);

        HashMap<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Ram", 95);
        studentScores.put("Rithika", 92);
        studentScores.put("Vicky", 78);
        studentScores.put("John", 90);
        System.out.println("HashMap: " + studentScores);
    }
}
