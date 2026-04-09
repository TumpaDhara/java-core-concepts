package Basic_Flow_Control_Practice_Question;

/*Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.*/

import java.util.Scanner;

public class ArithmeticOpearation {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int input1 = obj1.nextInt();
        System.out.print("Enter second number : ");
        int input2 = obj1.nextInt();
        System.out.println("The addition of two numbers = " + (input1 + input2));
        System.out.println("The subtraction of two numbers = " + (input1 - input2));
        System.out.println("The multiplication of two numbers = " + (input1 * input2));
        System.out.println("The devition of two numbers = " + (input1 / input2));
        System.out.println("The remainder of two numbers = " + (input1 % input2));
        obj1.close();
    }
}
