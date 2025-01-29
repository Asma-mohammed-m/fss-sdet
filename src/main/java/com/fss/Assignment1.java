package com.fss;

import java.util.Arrays;


public class Assignment1 {
    
    public static void main(String[] args) {
        int arr[] = {12,40,35,24,5,66,47,88,955,1};
        int smallest = arr[0]; 
        int biggest = arr[0];
        int sum = arr[0];
        int[] reversedArr = new int[arr.length];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<smallest){
                smallest = arr[i];
                
            }
            if(arr[i]>biggest){
                biggest = arr[i];
                
            }
            sum = sum + arr[i];
            for(int j=0;j<arr.length;j++)
            {
            reversedArr[j] = arr[arr.length-1-j];
            }
        }
        float average = sum/arr.length;
        System.out.println("Length of Array:"+ arr.length); 
        System.out.println("Smallest number in the Array:" +smallest);
        System.out.println("Biggest number in the Array:" +biggest);
        System.out.println("Sum of all Elements:" +sum);
        System.out.println("Average of all Elements:" +average);
        System.out.println("Reversed Array" +Arrays.toString(reversedArr));
    
    }

}
