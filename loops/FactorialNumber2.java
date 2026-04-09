package Basic_Flow_Control_Practice_Question;

/*Write a program that takes a number from the user and prints the factorial of that number using do-while loop.
        If the user enters a -ve number then print the message - "bhai, kya kar raha hai?".
        Keep doing it until the user enters a +ve number.*/

import java.util.Scanner;

public class FactorialNumber2 {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int input = obj1.nextInt();
        int fact = 1;
        do{
            if(input<=0){
                System.out.print("bhai, kya kar raha hai ? ");
                 input = obj1.nextInt();
            }
            if (input > 0) {
                for(int i = 1;i<=input;i++){
                    fact = fact * i;
                }
                System.out.print("The factorial number of "+ input + " = "+ fact);
            }

        }while (input<=0);

    }
}
