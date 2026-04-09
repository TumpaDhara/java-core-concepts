package ifelsepractice;

/*WAP to get input for sides of a triangle and check whether triangle is valid or not using if else.*/

import java.util.Scanner;

public class SidesOfTriangle {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter first side :");
        int a = obj1.nextInt();
        System.out.print("Enter second side :");
        int b = obj1.nextInt();
        System.out.print("Enter third side :");
        int c = obj1.nextInt();
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("It is a triangle.");
        } else {
            System.out.println("It is not a triangle");
        }
    }
}
