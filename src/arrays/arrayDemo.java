package arrays;

import java.util.Arrays;

public class arrayDemo {
    public static void main(String[] args) {
        int[] marks = new int[5];
        System.out.println("printing default values of int array:");
        for (int mark : marks) {
            System.out.print(mark);
            System.out.print(", .");
        }
        System.out.println("\nprinting from library function");
        System.out.println(Arrays.copyOf(marks, 8)[0]);
        char[] charArray;
        charArray = new char[5];
        System.out.println("printing default values of char array:");
        for (char mark : charArray) {
            System.out.print(mark + ", ");
        }
    }
}
