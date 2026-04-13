package stringpractice;

import java.util.Scanner;

public class CountNumberOfWords {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter a string :");
        String input = obj1.nextLine();
        int wordcount = input.trim().split("\\s+ ").length; // trim function is used for deleting triling spaces.
        // split function is used for count words.
        System.out.println("Total number of words : "+ wordcount);
    }
}
