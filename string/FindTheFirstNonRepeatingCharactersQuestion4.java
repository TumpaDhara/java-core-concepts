package stringpractice;
/*
* Question 4: Write a Java program to find the first non-repeating character in a string.

Example:
Input: "swiss"
Output : w */


import java.util.Scanner;
import java.lang.String;
public class FindTheFirstNonRepeatingCharactersQuestion4 {
    public static void approach1(String a){
        for (int i = 0; i < a.length(); i++) {
            int flag = 0;
            char ch1 = a.charAt(i);
            for (int j = i + 1; j < a.length(); j++) {
                char ch2 = a.charAt(j);
                if (ch1==ch2) {
                    flag++;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("The first non- repeating character in a string : " + ch1);
                break;
            }
        }
    }
    public static void approach2(String a){
        for(int i = 0;i<a.length(); i++){
            if(a.indexOf(i)==a.lastIndexOf(i)){
                System.out.println("The first non- repeating character in a string :" + a.indexOf(i));
            }
        }

    }

    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String input = obj1.nextLine();
        approach1(input);
        approach2(input);
    }
}

