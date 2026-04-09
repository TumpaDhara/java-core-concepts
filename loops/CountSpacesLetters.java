package Basic_Flow_Control_Practice_Question;

/**
 * Write a java program to count letters ,spaces,numbers and other characters in an input string.
 */

import java.util.Scanner;

public class CountSpacesLetters {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String input = obj1.nextLine();
        int lcounter = 0, scounter = 0, ncounter = 0, ocounter = 0;
        int length = input.length();
        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            if ((Character.isLetter(ch))) {
                lcounter++;
            } else if (Character.isSpaceChar(ch)) {
                scounter++;
            } else if (Character.isDigit(ch)) {
                ncounter++;
            } else {
                ocounter++;
            }
        }
        System.out.println("The number of letter in string = " + lcounter);
        System.out.println("The number of space in string = " + scounter);
        System.out.println("The number of numbers in string = " + ncounter);
        System.out.println("The number of other characters in string = " + ocounter);

    }
}
