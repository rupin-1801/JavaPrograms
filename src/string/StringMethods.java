package string;

/*
we are going to implement string methods.
task 1 :
print the length of input string, accept the input string from user.
 */

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String inputString = sc.nextLine();
        System.out.println(inputString.length());
    }
}
