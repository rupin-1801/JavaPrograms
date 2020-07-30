/*
 * CREATED BY INTELLIJ IDEA
 * Author: Mayank Bhugra
 * Date: 25-07-2020
 * Time: 22:15
 */

package practice;

//   Create a program in Java to create local variables with the var keyword. Assign the value of
//   all 8 primitive data types to 8 variables.

public class LabTask2 {
    public static void main(String[] args) {
        // object = student
        var studentAge = (byte) 20;
        var studentRollNo = (short) 256;
        var studentPhoneNo = 9313415766L;
        var studentEnrollment = 191500447;
        var studentPercentage = 84.05f;
        var studentCPI = 8.4d;
        var studentGrade = 'O';
        var studentPassStatus = true;
        System.out.println("Student Age = "+studentAge);
        System.out.println("Student Roll no. = "+studentRollNo);
        System.out.println("Student contact no. = "+studentPhoneNo);
        System.out.println("Student Enrollment no. = "+studentEnrollment);
        System.out.println("Student Percentage = "+studentPercentage);
        System.out.println("Student CPI = " +studentCPI);
        System.out.println("Student Grade = "+studentGrade);
        System.out.println("Student Pass Status"+studentPassStatus);
    }
}
