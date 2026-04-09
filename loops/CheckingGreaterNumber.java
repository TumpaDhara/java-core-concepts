package Basic_Flow_Control_Practice_Question;

/**
 * Write a program that takes a input from the user and then check if the number is greater than 10,
 * print "I am awesome!". If the number is not greater than 10, print "I am one of a kind!".
 * Regardless of the value, print "Testing your knowledge"
 */

import java.util.Scanner;

public class CheckingGreaterNumber {
    public static void main(String [] args){
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int input = obj1.nextInt();
        if(input>10){
            System.out.println("I am awesome !");
        }else {
            System.out.println("I am of one of a kind !");
        }
        System.out.println("Testing your knowledge.");
        obj1.close();
    }
}
