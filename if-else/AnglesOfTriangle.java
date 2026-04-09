package ifelsepractice;
/*WAP to take input for angles of a triangle. Check whether a triangle
is valid or not if angles are given using if */

import java.util.Scanner;

public class AnglesOfTriangle {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter  first angle :");
        int A = obj1.nextInt();
        System.out.println("Enter second angle :");
        int B = obj1.nextInt();
        System.out.println("Enter third angle :");
        int C = obj1.nextInt();
        int totalangle = A + B + C;
        if (totalangle == 180) {
            System.out.println("It is triangle.");
        } else {
            System.out.println("It is not triangle");
        }
    }
}
