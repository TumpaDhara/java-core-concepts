package Basic_Flow_Control_Practice_Question;

import java.util.Scanner;

/**
 * Write a program that takes a +ve number from the user and if it is an armstrong or not.
 * If the user enters a -ve number, ask for the input again after giving the messeage "neend meiin hai kya ?"
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int input = obj1.nextInt();
        int rem,count = 0,temp;
        while (input < 0) {
            System.out.println("neend mein hai kya?");
            System.out.print("Again, enter a number : ");
            input = obj1.nextInt();
        }
        temp = input;
        int length = String.valueOf(input).length();
        for (int i = 1; i<=length; i++){
            rem = input % 10;
            count = count + (rem*rem*rem);
            input = input / 10;
        }
        if(count == temp){
            System.out.println("It is a armstrong number.");
        }else {
            System.out.println("It is not a armstrong number.");
        }
        obj1.close();
    }
}
