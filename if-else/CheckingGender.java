package ifelsepractice;

import java.util.Scanner;

public class CheckingGender {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter letter  :");
        char num = obj1.next().charAt(0);
        System.out.println(num);
        int len = String.valueOf(num).length();
        System.out.println(len);
    }
}
