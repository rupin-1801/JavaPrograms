package arrays;
import java.util.Scanner;

//  Print sum of even elements

public class sumOfEvenElements {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Integers");
        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }
        for(int element : arr){
            if(element % 2 == 0)
                sum += element;
        }
        System.out.println("Sum of even numbers is: " + sum);
    }
}
