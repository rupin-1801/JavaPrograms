package string;

import java.util.Scanner;

/*
print all the characters of a given string in following format.
input : Hello World
output : H, e, l, l, o, , W, o, r, l, d
 */
public class Task2StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String inputString = sc.nextLine();
        for(int i = 0; i < inputString.length(); i++){
            if (i == inputString.length()-1)
                System.out.println(inputString.charAt(i));
            else
                System.out.print(inputString.charAt(i) + ",");
        }
    }
}
