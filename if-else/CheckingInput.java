package ifelsepractice;


import java.util.Scanner;

/*"Write a program that takes a number from the user and check - if the number is greater than 30, print ""I am creating list"" " +
        "if the number is less than 30 but greater than 20, print ""just joking"". if the number is less than 20 but greater than 7, print
""hello world"". If the number is less than 7 print ""arghhh, this is annoying"".*/
public class CheckingInput {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter number :");
        int input = obj1.nextInt();
        if (input > 30) {
            System.out.println("I am creating list.");
        } else if (input < 30 && input > 20) {    //if use kora uchit bcz use korle else part normal pore thakbe na.
            System.out.println("Just joking.");

        } else if (input < 20 && input > 7) {
            System.out.println("hello world");
        } else if (input < 7) {
            System.out.println("arguhh");
        } else {

        }
    }
}
