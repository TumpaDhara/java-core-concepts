package stringpractice;
/*Question 2: Write a program that removes all spaces from a string.

Example:
Input: "Roshogolla is better than Laddu."
Output: "RoshogollaisbetterthanLaddu."*/

import java.util.Scanner;

public class RemoveSpacesInStringQuestion2 {
    static void approach1(String str){
        System.out.println("Before your string is : " + str);
        String result = "";
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                result += ch;
            }
        }
        System.out.println("After your string is  : " + result);
    }

    public static void approach2(String str){
        System.out.println("Before your string is : " + str);
        String result = str.replace(" ", "");
        System.out.println("After your string is  : " + result);
    }
    public static void approach3(String str){
        System.out.println("Before your string is : " + str);
        String result = str.replaceAll(" ", "");
        System.out.println("After your string is  : " + result);
    }
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        String input = "Rashogolla is better tahm Laddu.";
        approach1(input);
        System.out.println("");
        approach2(input);
        System.out.println("");
        approach3(input);
    }
}
