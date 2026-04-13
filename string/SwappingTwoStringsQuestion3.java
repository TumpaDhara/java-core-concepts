package stringpractice;

import java.util.Scanner;

/*
* Question 3: Write a Java program to swap two strings without using a temporary variable.

Example:
Input:
str1 = "Gulab"
str2 = "Jamun"

Output:
After swapping:
str1 = Jamun
str = Gulab */
import java.lang.String;
public class SwappingTwoStringsQuestion3 {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter first string : ");
        String str1 = obj1.nextLine();
        System.out.print("Enter second string : ");
        String str2 = obj1.nextLine();
        str1 = str1+str2;
        str2 = str1.substring(0,str1.length()-str2.length());
        str1 = str1.substring(str2.length(),str1.length());
        System.out.println("after swapping : ");
        System.out.println("first string : "+ str1);
        System.out.println("second string : " + str2);

    }

}
