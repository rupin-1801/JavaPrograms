package methods;

import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args) {
        int no1 = 10;
        int no2 = 20;
        int no3 = 30;
        double no4 = 40.0;
        System.out.println(add(no1, no2));
        System.out.println(add(no1, no2, no3));
        System.out.println(add(no1, no2, no4));
    }
    public static int add(int no1, int no2){
        System.out.println("Two argument add is executing :");
        int response = 0;
        response = no1 + no2;
        return response;
    }
    public static int add(int no1, int no2, int no3){
        System.out.println("Three argument add is executing :");
        int response = 0;
        response = no1 + no2 + no3;
        return response;
    }
    public static double add(double no1, double no2, double no3){
        System.out.println("Three argument double add is executing :");
        double response = 0;
        response = no1 + no2 + no3;
        return response;
    }
}
