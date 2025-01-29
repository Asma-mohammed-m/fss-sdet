package project1;

public class ArrayInteger {

	public static void main(String[] args) {
		int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1; 
        }
        System.out.println("Array elements:");
        for (int number : num) {
            System.out.print(number + " ");
        }
    

	}

}
