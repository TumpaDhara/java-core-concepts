package stringpractice;

/*Question 5: Write a Java program to count how many times each character appears in a string.

        Example:
Input: "banana"
Output:
b - 1
a - 3
n-2*/

import java.util.*;

public class CountEachCharacterQuestion5 {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = obj1.nextLine();
        int count = 1;
        int flag = 1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count = 1;
            flag = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                    flag++;
                }
            }
            if (flag >= 1) {
                System.out.println(ch + " = " + count);
            }
        }
    }
}
