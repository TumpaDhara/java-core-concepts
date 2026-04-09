package Basic_Flow_Control_Practice_Question;

/**
 * "write a program that takes the age of the user and his nationality.
 * If the age >= 18 and nationality is ""Indian"",print ""you can vote"".
 * If the age is greater than or equal to 18 but nationality is not equal to ""Indian"",
 * print""bhag yaha se, doosre desh mein ja"".
 * If the age is not greater than 18, print ""abhi ghar jaa, bada ho ja, firr aana"""
 */

import java.util.Scanner;

public class CheckingNationality {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter your Age : ");
        byte age = obj1.nextByte();
        System.out.print("Enter your Nationality : ");
        String nationality = obj1.next();
        if (age >= 18 && nationality.equalsIgnoreCase("indian")) {
            System.out.println("You can vote .");
        } else if (age >= 18 ) {
            System.out.println("bhag yaha se, doosre desh mein ja");
        } else {
            System.out.println("abhi ghar jaa, bada ho ja, firr aana");
        }
        obj1.close();
    }
}
