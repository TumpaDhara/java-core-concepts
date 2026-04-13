package stringpractice;

import java.util.Scanner;

public class CountingVowels {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter your string : ");
        String input = obj1.nextLine();
        int countvowels = 0;
        for(int i =0;i<input.length()-1;i++){
            char ch = input.charAt(i);
            if((ch =='a' || ch =='e' || ch=='i' || ch =='o' || ch=='u'|| ch == 'A' || ch =='E')){
                countvowels=countvowels+1;
            }
        }
        System.out.println("Total number of vowels = " + countvowels);
    }
}
