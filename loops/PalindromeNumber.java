package Basic_Flow_Control_Practice_Question;

/**
 * Write a program to take a number from the user and check if it is a palindrome or not.
 * like 121 is  Palindrome number. .
 */

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int input = obj1.nextInt();
        String temp = String.valueOf(input);
        String count = "";
        int length = String.valueOf(input).length();
        for (int i = 1; i <= length; i++) {
            int rem = input % 10;
            count = count + rem;
            input = input / 10;
        }
        if (temp.equalsIgnoreCase(count)) {
            System.out.println("It is a palindrome number .");
        } else {
            System.out.println("It is not a palindrome number.");
        }
        obj1.close();
    }
}
