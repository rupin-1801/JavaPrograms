/*
 * CREATED BY INTELLIJ IDEA
 * Author: Mayank Bhugra
 * Date: 25-07-2020
 * Time: 22:25
 */

package practice;

// Create a program in Java to demonstrate declaration, initialization and usage of static and
// non-static variables.

public class LabTask4 {
    public static void main(String[] args) {
        System.out.println("Static Variable "+Thar.favourite4x4);
        Thar t = new Thar();
        System.out.println("Non-Static "+t.likeOffRoading);
    }
}
class Thar {
    static String favourite4x4 = "Thar";
    String likeOffRoading = "Yes";
}