package stringpractice;

import java.util.Scanner;

public class IsPalindrome {
   /*
   *  public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str = obj1.nextLine();
        String count = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            count = count + str.charAt(i);
        }
        if (count.equalsIgnoreCase(str)) {
            System.out.println("It is palindrome.");
        } else {
            System.out.println("It is not palindrome.");
        }
    }*/
        static boolean isPalindrome2(String s) {
            String temp =s;
            /*for(int i = s.length()-1;i>=0;i--){
                count+=s.charAt(i);
            }*/
            String count = new StringBuilder(s).reverse().toString();
            System.out.println(count);
            if(count.equalsIgnoreCase(temp)){
                return true;
            }else{
                return false;
            }
        }
        public static void main(String[] args){
            Scanner obj1 = new Scanner(System.in);

            System.out.println("Enter a String : ");
            String str = obj1.nextLine();
            boolean res = isPalindrome2(str);
            System.out.println(res);
        }
    }