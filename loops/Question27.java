package Basic_Flow_Control_Practice_Question;
/*
Write a program that takes a number from the user. If the number is smaller than 43,
tell the user to enter a number again. Keep doing it until he enters a number greater than or equal to 43.
After getting the appropriate number,
find the total number of factors of the input number except itself
and print if it is an even number or odd number.*/


import java.util.Scanner;

public class Question27 {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter a number :");
        int input = obj1.nextInt();
        while (input < 43) {
            System.out.print("Enter a number again :");
            input = obj1.nextInt();
        }
        System.out.print("The factors of given number = ");
        for (int i = 1; i < input; i++) {
            if (input % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        if (input % 2 == 0) {
            System.out.println("It is an even number.");
        } else {
            System.out.println("It is an odd number.");
        }
        obj1.close();
    }
}
