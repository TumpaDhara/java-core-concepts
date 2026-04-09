package Basic_Flow_Control_Practice_Question;

/*
 * Write a Java program that takes two numbers as input and displays the product of two numbers.
 */

import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number : ");
        int input1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int input2 = sc.nextInt();
        System.out.println("The product of two numbers : " + (input2 * input1));
        sc.close();
    }
}
