package switchcase;

import java.util.Scanner;

public class CheckingVowel {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.println(" Please enter a character :");
        char input = obj1.next().charAt(0);
        switch (input){
            case 'a' :
                System.out.println("it is vowel.");
                break;
            case 'e':
                System.out.println("it is vowel");
                break;
            case 'i':
                System.out.println("it is vowel.");
                break;
            case 'o':
                System.out.println("it is vowel.");
                break;
            case 'u' :
                System.out.println("it is vowel.");
                break;
            case 'A':
                System.out.println("it is vowel");
                break;
            case 'E':
                System.out.println("it is vowel.");
                break;
            case 'I':
                System.out.println("it is vowel.");
                break;
            case 'O':
                System.out.println("it is vowel.");
                break;
            case 'U':
                System.out.println("it is vowel.");
                break;
            default:
                System.out.println("it is consonant.");
        }
        obj1.close();
    }
}
