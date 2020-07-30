package practice;// Check whether user is eligible for marriage or not.
// By accepting gender and age from user.(M - 21, F - 18)
//
import java.util.Scanner;
public class SelectionProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Gender (male/female) :");
        String gender = sc.next();
        System.out.println("Enter your Age:");
        int age = sc.nextInt();
        if(gender.equals("male") && age > 20)
            System.out.println("You are eligible for marriage.");
        else if(gender.equals("female") && age > 17)
            System.out.println("You are eligible for marriage.");
        else
            System.out.println("You are not eligible for marraige");
    }
}
