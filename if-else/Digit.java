package ifelsepractice;

import java.util.Scanner;

public class Digit {
    public static void main(String[] args){
        Scanner obj1 =new Scanner(System.in);
        System.out.println("Enter Number :");
        int input = obj1.nextInt();
        if(input>99 && input<1000){
            System.out.println("Given number is 3 digit.");
        }
        else{
            System.out.println("Given number is not 3 didit.");
        }
    }
}
