package ifelsepractice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        /*System.out.println("Enter character :");
        char ch = obj1.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("This character is uppercase.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("This character is lowercase");
        } else {
            System.out.println("Not an alphabetic number.");
        }*/


        System.out.println("Enter number :");
        int num = obj1.nextInt();
        if(num>=1 && num<=100){
            System.out.println("exist in range.");
        }
        else{
            System.out.println("Not exist.");
        }
        obj1.close();
    }
}
