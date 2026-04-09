package ifelsepractice;

import java.util.Scanner;

public class InputAlphabetDigit {
    public static void main(String[] args){
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter number :");
        char alpha='h';
        if((alpha>='A' && alpha<='Z') || (alpha>='a' && alpha<='z')){
            System.out.println("alphabet");
        } else if (alpha>=0 && alpha<=9){
            System.out.println("digit");

            }
        else {
            System.out.println("special character");
        }

    }
}
