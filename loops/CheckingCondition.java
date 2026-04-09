package Basic_Flow_Control_Practice_Question;

/**
 * "Write a program that takes a number from the user and check-
 * if the number is greater than 30,print ""I am creating list""
 * if the number is less than 30 but greater than 20, print ""just joking"".
 * if the number is less than 20 but greater than 7, print""hello world"".
 * If the number is less than 7 print ""arghhh, this is annoying""."
 */

import java.util.Scanner;

public class CheckingCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int input = sc.nextInt();
        if (input > 30) {
            System.out.println("I am creating list .");
        } else if (input < 30 && input > 20) {
            System.out.println("just joking.");
        } else if (input < 20 && input > 7) {
            System.out.println("helo world .");
        }else {
            System.out.println("arghhh, this is annoying");
        }
        sc.close();
    }
}
