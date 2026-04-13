package stringpractice;

import java.util.Scanner;

public class FindDuplicateNumbers {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter a string :");
        String input = obj1.nextLine();
        String result="";
        for(int i = 0;i<input.length()-1;i++){
            if(result.indexOf(input.charAt(i))==-1){
                result = result+input.charAt(i);
            }

        }
        System.out.println("it is a string without  duplicate characters : "+ result);
    }
}
