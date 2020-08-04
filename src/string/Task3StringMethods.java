package string;

/*
Task3:
Print all the characters of given inputString, in the below format, using a method called void display(String inputString);
input : Hello World
Output : H, e, l, l, o, , W, o, r, l, d
 */

import java.util.Scanner;

public class Task3StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        Task3StringMethods task = new Task3StringMethods();
        String inputString = sc.nextLine();
        task.display(inputString);
    }
    void display(String inputString){
        for(int i = 0; i < inputString.length(); i++){
            if (i == inputString.length()-1)
                System.out.println(inputString.charAt(i));
            else
                System.out.print(inputString.charAt(i) + ",");
        }
    }
}
