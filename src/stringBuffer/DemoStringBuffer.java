package stringBuffer;

public class DemoStringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer1 = new StringBuffer(20);
        StringBuffer stringBuffer2 = new StringBuffer("hello");
        System.out.println("Capacity of first sb : " + stringBuffer.capacity() + "\tLength is : " + stringBuffer.length());
        System.out.println("Capacity of second sb : " + stringBuffer1.capacity() + "\tLength is : " + stringBuffer1.length());
        System.out.println("Capacity of third sb : " + stringBuffer2.capacity() + "\tLength is : " + stringBuffer2.length());
    }
}
