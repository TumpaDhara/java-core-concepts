package Basic_Flow_Control_Practice_Question;

/*Write a program to take 2 numbers as input and swap the values of those 2 variables.*/

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter first value : ");
        int input1 = obj1.nextInt();
        System.out.print("Enter second value : ");
        int input2 = obj1.nextInt();
        int temp;
        System.out.println("Given first number = "+ input1 + " and the second number = " + input2);
       /* temp = input2;
        input2 = input1;
        input1 = temp;*/

        // Another approach ,, Without using third variable....
        input1 = input1+input2;
        input2 = input1 - input2;
        input1 = input1 - input2;
        System.out.println("After swapping the first number = " + input1 +" and the second number = " + input2);
        obj1.close();
    }
}
