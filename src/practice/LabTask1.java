/*
 * CREATED BY INTELLIJ IDEA
 * Author: Mayank Bhugra
 * Date: 25-07-2020
 * Time: 22:07
 */
package practice;

// Create a program to print a table of all primitive data types.

public class LabTask1 {
    public static void main(String[] args) {
        System.out.printf("%-15s %-15s %-20s %-15s\n","Data Type","Size in bites","Size in Bytes","Range");
        System.out.printf("%-20s %-15d %-15d %s %d %s %d\n","byte",Byte.SIZE,Byte.BYTES,"From",Byte.MIN_VALUE,"To",Byte.MAX_VALUE);
        System.out.printf("%-20s %-15d %-15d %s %d %s %d\n","short",Short.SIZE,Short.BYTES,"From",Short.MIN_VALUE,"To",Short.MAX_VALUE);
        System.out.printf("%-20s %-15d %-15d %s %d %s %d\n","int",Integer.SIZE,Integer.BYTES,"From",Integer.MIN_VALUE,"To",Integer.MAX_VALUE);
        System.out.printf("%-20s %-15d %-15d %s %d %s %d\n","long",Long.SIZE,Long.BYTES,"From",Long.MIN_VALUE,"To",Long.MAX_VALUE);
        System.out.printf("%-20s %-15d %-15d %s %f %s %f\n","float",Float.SIZE,Float.BYTES,"From",Float.MIN_VALUE,"To",Float.MAX_VALUE);
        System.out.printf("%-20s %-15d %-15d %s %f %s %f\n","double",Double.SIZE,Double.BYTES,"From",Double.MIN_VALUE,"To",Double.MAX_VALUE);
        System.out.printf("%-20s %-15d %-15d %s %s %s %s\n","char",Character.SIZE,Character.BYTES,"From",Character.MIN_VALUE,"To",Character.MAX_VALUE);
        System.out.printf("%-20s %-15s %-15f %s %s %s %s","boolean","1",1/8f,"Has ",Boolean.TRUE, "and",Boolean.FALSE );
    }
}
