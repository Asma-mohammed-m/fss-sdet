package com;
public class ArraysAndManipulation {
    public static void main(String[] args) {
        // Create an array ntegers with 10 elements
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1; // Assign values from 1 to 10
        }
        System.out.print("Array of integers : ");
        for (int number : array) {
            System.out.print(number + " ");
        }

        // Find the largest and smallest element in the array
        int largest = array[0];
        int smallest = array[0];
        int sum = 0;

        for (int num : array) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
            sum += num;
        }

        // Calculate the average
        double average = (double) sum / array.length;

        // Reverse the array
        System.out.print("\nReversed Array: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nLargest element: " + largest);
        System.out.println("Smallest element: " + smallest);
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);
    }
}
