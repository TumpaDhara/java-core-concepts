package Basic_Flow_Control_Practice_Question;

/*Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.*/

import java.util.Scanner;

public class ComputesTheValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value : ");
        int n = sc.nextInt();
        int result = n + (n * n) + (n * n * n);
        System.out.println("The result of the given expression : " + result);

        sc.close();
    }
}
