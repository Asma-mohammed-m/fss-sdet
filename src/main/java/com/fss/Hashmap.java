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
        namesSet.add("Divya");
        namesSet.add("balu");
        namesSet.add("Naveen");
        namesSet.add("Arjun");
 
        System.out.println("Unique Names: " + namesSet);
 
        System.out.println("\nHashMap Example:");
        HashMap<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Divya", 85);
        studentScores.put("balu", 92);
        studentScores.put("Naveen", 78);
        studentScores.put("Arjun", 90);
 
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
 
}
 