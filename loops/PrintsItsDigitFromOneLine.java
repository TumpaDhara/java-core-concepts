package Basic_Flow_Control_Practice_Question;

import java.util.Scanner;

/**
 * Write a program that takes a number from the user - say 't'.Now, take 't' number of numbers from the user
 * and for each number, print it's digits separately in 1 line .If those numbers are -ve ,
 * take the input again after printing the massege - "sahi se number de".
 */
public class PrintsItsDigitFromOneLine {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int t = obj1.nextInt();
        int rem, count = 1,input;
        String digit = "";
        while (count > 0) {
            count=0;
            for (int i = 1; i <= t; i++) {
                System.out.print("Enter a number : ");
                input = obj1.nextInt();
                if (input < 0) {
                    count++;
                }
                int length = String.valueOf(input).length();
                for (int j = 1; j <= length; j++) {
                    rem = input % 10;
                    System.out.print(rem +" ");
                    input = input / 10;
                }
                System.out.println();
            }
            if (count > 0) {
                System.out.println("Sahi se number de ......");
            }
        }
        obj1.close();
    }
}
