package Basic_Flow_Control_Practice_Question;

import java.util.Scanner;

public class BinaryForm {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        int input = obj1.nextInt();
        int temp = input;
        String count = "";
        while (input != 0){
            int rem = input % 2;
            count = rem + count;
            input = input /2;
        }
        System.out.println("Binary form of "+ temp + " = "+count);
    }
}
