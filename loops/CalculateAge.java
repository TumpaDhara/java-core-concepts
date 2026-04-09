package Basic_Flow_Control_Practice_Question;
/**
 * Write a program to take 2 integer values ( years and months ) for age of a person and calculate how many days he has lived.
 * Use 365 days for each year and 30 days for each month. Print the age in number of days.
 */

import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter the age in years : ");
        byte years = obj1.nextByte();
        System.out.print("Enter the age in days : ");
        byte month = obj1.nextByte();
        int numberOfDays = (years * 365) + (month * 30);
        System.out.println("The age in number of days = " + numberOfDays);
        obj1.close();
    }
}
