package stringBuffer;

public class Demo2StringBuffer {
    public static void main(String[] args) {
        String string = "The quick brown fox jumps over a lazy dog.";
        StringBuffer stringBuffer = new StringBuffer();
//        for(int i = 0; i < string.length(); i++){
//            stringBuffer.append(string.charAt(i));
//            System.out.println("capacity : " + stringBuffer.capacity() +
//                    "\tLength : " + stringBuffer.length());
//        }
//        stringBuffer.ensureCapacity(20);
//        System.out.println(stringBuffer);
//        System.out.println("capacity : " + stringBuffer.capacity() +
//                "\tLength : " + stringBuffer.length());
//        stringBuffer.delete(0, stringBuffer.length());
//        capacity will remain 70 after deletion.
        stringBuffer.append(string);
        System.out.println(stringBuffer);
        System.out.println("capacity : " + stringBuffer.capacity() +
                "\tLength : " + stringBuffer.length());
        stringBuffer.insert(0, "Anagram 1 : ");
        System.out.println(stringBuffer);
        stringBuffer.delete(7, 9);
        System.out.println(stringBuffer);
        stringBuffer.replace(stringBuffer.length() - 4,
                stringBuffer.length() - 1, "Cat");
        System.out.println(stringBuffer);
    }
}
