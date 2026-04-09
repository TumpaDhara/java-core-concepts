package Basic_Flow_Control_Practice_Question;

/*Write a Java program that accepts an integer (n) and prints it with the message "Hello, you entered the
        number <input_number>"*/


import java.util.Scanner;

public class HelloPrint {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter a integer value :");
        int input_number = obj1.nextInt();
        System.out.println("hello, you entered the number " + input_number);
        obj1.close();
    }
}
