package stringBuffer;

import java.util.Scanner;

public class task1StringBufferAndBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Enter string buffer: ");
        stringBuffer.append(sc.nextLine());
        System.out.println("Enter string builder: ");
        stringBuilder.append(sc.nextLine());
        System.out.println("StringBuffer is: " + stringBuffer);
        System.out.println("stringBuilder is: " + stringBuilder);
        String string = stringBuffer + String.valueOf(stringBuilder);
        System.out.println("Concatination : " + string);
    }
}
