package Basic_Flow_Control_Practice_Question;


/**
 * Write a program that takes a number from user and checks if it is a perfect number or not.
 */

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Please enter a positive number : ");
        int input = obj1.nextInt();
        int count = 0;
        for (int i = 1; i < input; i++) {
            if (input % i == 0) {
                count = count + i;
            }
        }
        if (count == input) {
            System.out.println("It is a perfect number.");
        } else {
            System.out.println("It is not a perfect number .");
        }
        obj1.close();
    }
}
