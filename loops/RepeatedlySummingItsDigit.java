package Basic_Flow_Control_Practice_Question;


import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * Write a program to take a positive number from the user and find the digit root of the number .
 * The digit root of a number is obtained by repeatedly summing its digits
 * untill a single single-digit number is obtained.
 * Input : N=9875
 * Output : 2
 * Explanation : 9+8+7+5 =29.  2+9 =11. 1+1 = 2
 */
public class RepeatedlySummingItsDigit {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Please enter a positive number : ");
        int input = obj1.nextInt();
        int temp,count=0, rem;
        while (input>9){
            int length = String.valueOf(input).length();
            for (int i = 1; i <= length; i++) {
                rem = input % 10;
                count = count + rem;
                input = input / 10;
            }
            if(count > 9){
                input = count;
                count = 0;
            }
        }
        System.out.println("The ans of repeatedly summing its digit = " + count);
        obj1.close();
    }
}
