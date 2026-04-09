package Basic_Flow_Control_Practice_Question;



import java.util.Scanner;

/**
 * Write a java program that takes a number as input and displays its multiplication table upto 10.
 */
public class TableUpto10 {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter a number for printing multiplication table : ");
        int input = obj1.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(input + " x " + i + " = " + (input * i));
        }
        obj1.close();


    //    Write a program that prints from 1 to 5 using for loop.

        /*for (int i = 1 ;i<=5 ; i++){
            System.out.print(i + " ");
        }*/
    }

}
