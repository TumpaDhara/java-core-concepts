package Basic_Flow_Control_Practice_Question;
/**
 * "Write a program that takes 3 numbers from the user.
 * If the first number is greater than the 3rd number, print the addition of the 3 numbers.
 * If the 1st number is equal to the 2nd number, make 1st number equal to 3rd number and print the
 * message ""Kya struggle hai!"". Print the message ""question dhyan se padho""."
 */

import java.util.Scanner;

public class CheckingCondition2 {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter First number : ");
        int input1 = obj1.nextInt();
        System.out.print("Enter second number : ");
        int input2 = obj1.nextInt();
        System.out.print("Enter Third number : ");
        int input3 = obj1.nextInt();
        if (input1 > input3) {
            System.out.println("The addition of third number = " + (input1 + input2 + input3));
        }
        if (input1 == input2) {

            if (input1 > input3) {
                int temp = input1 - input3;
                input3 = temp + input3;
            } else {
                int temp = input3 - input1;
                input1 = temp + input1;
            }
            System.out.println("Kya struggle hai!");
            System.out.println("question dhyan se padho");

        }
        obj1.close();
    }
}
