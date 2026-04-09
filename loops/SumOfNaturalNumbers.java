package Basic_Flow_Control_Practice_Question;

/**
 * Write a program that takes a number - say "n" from the user and prints the sum of first "n" natural numbers.
 * If the user enters 0 or any -ve number as input, ask for the input again.
 * Do this until the user enters a positive integer.
 */

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int input = sc.nextInt();
        do {
            if (input < 1) {
                System.out.print("Enter a positive  number : ");
                input = sc.nextInt();
            }
            int sum = 0;
            if (input > 0) {
                for (int i = 1; i <= input; i++) {
                    sum += i;
                }
                System.out.println("The sum of all natural numbers = " + sum);
            }
        } while (input <= 0);
        sc.close();
    }
}
