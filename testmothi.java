import java.util.Arrays;

public class testmothi {
    public static void main(String[] args) {
        
        int[] a = {6, 25, 32, 7, 23, 49, 2, 24, 16, 30};

        
        int largest = a[0];
        int smallest = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
            if (a[i] < smallest) {
                smallest = a[i];
            }
        }
        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        reverseArray(a);
        System.out.println("\nArray elements after reversing:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Element at index " + i + ": " +a[i]);
        }
      
    
        System.out.println("Normal Array List: " + Arrays.toString(a));
     //   System.out.println("Reversed Array List: " + Arrays.toString(a));
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
        System.out.println("Sum of elements: " + sum);
      //  System.out.println("Average of elements: " + average);
    }
    public static void reverseArray(int[] a) {
        int start = 0;
        int end = a.length - 1;
        
        while (start < end) {
            // Swap elements at start and end
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            // Move the indices towards the center
            start++;
            end--;
        }
    }
}
