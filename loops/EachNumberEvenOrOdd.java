package Basic_Flow_Control_Practice_Question;


/*Write a program that takes a number from the user -  say 't'.
        now, take "t " number of numbers from the user and for each number,check if it is even or odd.*/


import java.util.Scanner;

public class EachNumberEvenOrOdd {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int t = obj1.nextInt();
        for (int i = 1;  i <=t; i++){
            System.out.print("Please enter a number : ");
            int input = obj1.nextInt();
            if(input % 2 == 0){
                System.out.println("This is even number.");
            }else {
                System.out.println("This is odd number.");
            }
        }
        obj1.close();
    }
}
