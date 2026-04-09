package Basic_Flow_Control_Practice_Question;

/**
 * Write a program that takes the radius of a circle from user as input to print the area and perimeter of a circle.
 */

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter the radius of a circle : ");
        int r = obj1.nextInt();
        double area = Math.PI * r * r;
        System.out.println("The area of circle = " + r);
        double perimeter = 2 * Math.PI * r;
        System.out.println("The area of perimeter = " + perimeter);
        obj1.close();
    }
}
