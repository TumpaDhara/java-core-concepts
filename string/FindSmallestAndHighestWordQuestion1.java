package stringpractice;
/*Question 1: Write a program to print the smallest and largest word in a given sentence.

        Example:
        Input: "Java is a powerful language"
        Output:
        Smallest word: a
        Largest word powerful*/

import java.lang.String;
import java.util.Scanner;

public class FindSmallestAndHighestWordQuestion1 {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter a string  : ");
        String input = obj1.nextLine();
        String[] wordcount = input.split(" ");
        int i = 1;
        String largestWord = wordcount[0];
        String smallestWord = wordcount[0];

        while (i < wordcount.length) {
            if ((largestWord.length()) < ((wordcount[i].length()))) {
                largestWord = wordcount[i];
            }
            if ((smallestWord.length()) > ((wordcount[i].length()))) {
                smallestWord = wordcount[i];
            }
            i++;
        }

        System.out.println("Largest word : " + largestWord);
        System.out.println("Smallest word : " + smallestWord);
    }
}
