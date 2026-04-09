package switchcase;

/*
Write a calculator program that takes two numbers and an operator (+, -, *, /) as input
 and performs the corresponding arithmetic operation using a switch-case statement.
*/

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.println(" Please enter a arithmetic operator :");
        char operator = obj1.next().charAt(0);
        System.out.print("Enter first value :");
        int input1= obj1.nextInt();
        System.out.print("Enter second value :");
        int input2= obj1.nextInt();
        switch (operator){
            case '+':
                System.out.println("Addition of two number = " + (input1+input2));
                break;
            case '-':
                System.out.println("Subtraction of two number = " + (input1-input2));
                break;
            case '*':
                System.out.println(" Multiplication of two number = " + (input1*input2));
                break;
            case '/':
                System.out.println("Devition of two number :" + (input1/input2));
            default:
                System.out.println("Invalid operator");

        }
        obj1.close();
    }
}
