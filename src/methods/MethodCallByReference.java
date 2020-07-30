package methods;

//Create a method add which accept two arguments and return thier sum,
// we will modify formal arguments and check the effect on actual arguments.

import java.util.Arrays;

public class MethodCallByReference {
    public static void main(String[] args) {
//      Actual arguments
        int[] brr = {10, 20, 53, 52};
        MethodCallByReference obj = new MethodCallByReference();
        System.out.println("Sum : " + obj.add(brr));
        System.out.println("Actual Arguments : " + Arrays.toString(brr));
    }
    public int add(int[] arr){
        int response = 0;
        for(int i = 0; i < arr.length; i++){
            response += arr[i];
            arr[i] = 0;
        }
        System.out.println("Formal Arguments : " + Arrays.toString(arr));
        return response;
    }
}
