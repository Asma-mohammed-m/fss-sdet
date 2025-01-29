package com.fss;
 
public class Array {
 
    public void createArray() {
        int[] Array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
 
    }
 
    public void findSmallAndLargestValue() {
        int[] given = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
 
        int smallValue = given[0];
        int largeValue = given[0];
 
        for (int i = 0; i < given.length; i++) {
 
            if (given[i] > largeValue) {
                largeValue = given[i];
 
            }
            if (given[i] < smallValue) {
                smallValue = given[i];
 
            }
 
        }
        System.out.println("smallValue : " + smallValue);
        System.out.println("largeValue : " + largeValue);
 
    }
 
    public void printReverseOrder() {
        int[] given = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] answer = new int[given.length];
 
        for (int i = given.length - 1; i >= 0; i--) {
            for (int j = 0; j < given.length; j++) {
                answer[given.length - 1 - i] = given[i];
            }
        }
 
        for (int res : answer) {
            System.out.println(res);
        }
    }
 
    public void sumAndAverage() {
        int[] given = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
 
        for (int i = 0; i < given.length; i++) {
            sum = sum + given[i];
        }
        int average = sum / given.length;
        System.out.println("Sum : " + sum);
        System.out.println("Average : " + average);
    }
 
    public static void main(String[] args) {
        Array a = new Array();
        a.findSmallAndLargestValue();
        a.printReverseOrder();
        a.sumAndAverage();
    }
 
}