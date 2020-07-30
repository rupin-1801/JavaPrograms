package arrays;

import java.util.Scanner;

public class sumOfArrayElements {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Integers");
        for(int index = 0; index < 5; index++){
            arr[index] = sc.nextInt();
        }
        for(int element : arr){
            sum += element;
        }
        System.out.println("Sum of array elements is: " + sum);
    }
}
