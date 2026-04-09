package ifelsepractice;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args){
        Scanner obj1= new Scanner(System.in);
        System.out.println("Enter Number :");
        int input = obj1.nextInt();
        if(input ==0){
            System.out.println("Given number is zero.");
        } else if (input >0) {
            System.out.println("Given number is positive.");

        }
        else{
            System.out.println("Given number is negative.");
        }
    }
}
