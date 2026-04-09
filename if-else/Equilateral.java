package ifelsepractice;


/*WAP to input sides of a triangle and check whether a triangle is equilateral,
scalene or isosceles triangle using if else.*/

// equilateral = 3equal sides
// scalene = 2 equal sides
// isosceles = none

import java.util.Scanner;

public class Equilateral {
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
        }
        if ((a == b)&&(b == c)) {
                System.out.println("it is equilateral");
        } else if ((a == b && c!=0) || (b == c && a!=0) || (c == a)) {
                System.out.println("it is scalence.");
            } else {
                System.out.println("it is isoscales.");
            }
        }
    }

