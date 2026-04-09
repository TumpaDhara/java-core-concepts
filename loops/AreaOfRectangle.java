package Basic_Flow_Control_Practice_Question;
/**
 * Write a program that takes length and width of rectangle and then print the area and perimeter of a rectangle.
 */

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Please enter the length of rectangle : ");
        int length = obj1.nextInt();
        System.out.print("Please wnter the width of rectangle : ");
        int width = obj1.nextInt();
        int area = length * width;
        System.out.println("The Area of rectangle = " + area);
        int perimeter = 2 * (length + width);
        System.out.println("The perimeter of rectangle : " + perimeter);
        obj1.close();

    }
}
