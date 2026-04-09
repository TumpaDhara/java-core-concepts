package ifelsepractice;

import java.util.Scanner;

public class MaxThreeNumberNestedIf {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter first number :");
        int input = obj1.nextInt();
        System.out.println("Enter Second number :");
        int input2 = obj1.nextInt();
        System.out.println("Enter third number :");
        int input3 = obj1.nextInt();
        if (input > input2) {
            if (input > input3) {
                System.out.println("First numbeer is greatest.");
            } else {
                System.out.println("Third number is greatest.");
            }
        }
            if (input2 > input) {
                    System.out.println("Second value is greatest.");
            } else {
                    System.out.println("Third value is gretest.");

            }
        }

        }

