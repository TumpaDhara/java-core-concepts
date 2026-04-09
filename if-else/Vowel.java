package ifelsepractice;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args){
        Scanner obj1 =new Scanner(System.in);
        System.out.println("Enter character :");
        char ch =obj1.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            System.out.println("This character is vowel.  ");
        }
        else{
            System.out.println("This character is consonant.");
        }

    }
}
