package ifelsepractice;

import java.util.Scanner;

public class checkingAlphabet {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter values :");
        char num = obj1.next().charAt(0);
        if ((num >= 48) || (num<=57)){
            System.out.println("It is digit.");
        } else if ((num >=97) || (num <= 121) || (num > 65) || (num < 89)) {
            System.out.println("It is character");
        } else {
            System.out.println("It is special character");
        }


    }
}
