package Basic_Flow_Control_Practice_Question;

/**
 * Write a program that takes the number of days a person as lived (i.e. his age) from the user and
 * prints his age in years, months and days.
 * Assume there are 365 days in 1 year and 30 days in 1 month.
 */

import java.util.Scanner;

public class CalculateAgeInDays {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Take the number of days a person as lived :  ");
        int numberofdays = obj1.nextInt();
        int years = numberofdays / 365;
        int rdays = numberofdays % 365;
        int month = rdays / 30;
        int days = rdays % 30;
        System.out.println("your age = "+ years + " years, " + month + " month, " + days + " days" );


        obj1.close();
    }
}
