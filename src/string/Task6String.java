package string;

import java.util.Scanner;

public class Task6String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text;
        System.out.println("Enter th string: ");
        text = sc.nextLine();
        System.out.println("Result is : " + toogleCase(text));
    }
    static String toogleCase(String text){
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if((character > 64) && (character < 92)){
                text = text.substring(0, i) + (char)(character + 32) + text.substring(i+1);
            }
            else if ((character > 96) && (character < 123)){
                text = text.substring(0, i) + (char)(character - 32) + text.substring(i+1);
            }

        }
        return text;
    }
}
