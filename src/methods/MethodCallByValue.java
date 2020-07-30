package methods;

//Create a method add which accept two arguments and return thier sum,
// we will modify formal arguments and check the effect on actual arguments.

public class MethodCallByValue {
    public static void main(String[] args) {
//      Actual arguments
        int no1 = 10;
        int no2 = 30;
        MethodCallByValue obj = new MethodCallByValue();
        System.out.println("Sum : " + obj.add(no1 , no2));
        System.out.println("Actual Arguments \n\tNumber 1 : " + no1 + "\n\tNumber 2 : " + no2);
    }
    public int add(int no1, int no2){
        int response = no1 + no2;
        no1 = 0;
        no2 = 0;
        System.out.println("Formal Arguments \n\tNumber 1 : " + no1 + "\n\tNumber 2 : " + no2);
        return response;
    }
}
