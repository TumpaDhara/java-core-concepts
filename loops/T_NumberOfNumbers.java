package Basic_Flow_Control_Practice_Question;
/*
 * Write a program that takes a number from the user - say "t" . Now take 't' number of numbers from the user and
 * print it's factors which are greater than 23 . If the user enters a number less than 81,
 *  prompt the user again to enter the correct number. */

import java.util.Scanner;

public class T_NumberOfNumbers {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int t = obj1.nextInt();
        for (int i = 1; i <= t; i++) {
            System.out.print("Enter a number : ");
            int input = obj1.nextInt();
            while (input < 81) {
                System.out.print("Again enter a number : ");
                input = obj1.nextInt();
            }
            System.out.print("Factors are : ");
            for (int j = 1; j <= input; j++) {
                if (input % j == 0) {
                    if (j > 23) {
                        System.out.print(j + " ");
                    }
                }
            }
            System.out.println();

        }
        obj1.close();
    }
}
