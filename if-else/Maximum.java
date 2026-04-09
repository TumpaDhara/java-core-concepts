package ifelsepractice;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter first Number :");
        int firstnum = obj1.nextInt();
        System.out.println("Enter second Number :");
        int secondnum = obj1.nextInt();
        System.out.println("Enter third Number :");
        int thirdnum = obj1.nextInt();
        if (firstnum > secondnum && firstnum > thirdnum) {
            System.out.println("First number is greatest.");
        } else if (secondnum > thirdnum) {
            System.out.println("second number is greatest.");

        } else {
            System.out.println("Third number is greatest.");
        }


    }
}
