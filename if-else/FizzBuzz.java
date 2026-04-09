package ifelsepractice;

/*Write a program that takes a number as input and check -If the number is divisible by both 3 and 5,print "FizzBuzz".
 If it's divisible only by 3, print "Fizz". If it's divisible only by 5, print "Buzz".Otherwise, print "ekta bhalo number de*/


import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter number :");
        int input = obj1.nextInt();
        if ((input % 3 == 0) && (input % 5 == 0)) {
            System.out.println("FizzBuzz.");
        } else if (input % 3 == 0) {
            System.out.println("Fizz.");
        } else if (input % 5 == 0) {
            System.out.println("Buzz.");
        } else {
            System.out.println("Akta valo number de.");
        }
        obj1.close();
    }
}
