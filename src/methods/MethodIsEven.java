package methods;

import java.util.Scanner;

public class MethodIsEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        System.out.println(isEven(number));
    }
    public static boolean isEven(int number){
        return number % 2 == 0;
    }
}
