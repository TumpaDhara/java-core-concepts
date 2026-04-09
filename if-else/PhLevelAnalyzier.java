package ifelsepractice;

import java.util.Scanner;

public class PhLevelAnalyzier {
    public static void main(String[] args){
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter ph value from 0 to 14 :");
        byte ph = obj1.nextByte();
        if(ph<7){
            System.out.println("Ph level is low.water change is required.");
        } else if ((ph>=7) && (ph<=8)) {
            System.out.println("ph level is fine.");
        }
        else {
            System.out.println("ph level is high, partial water is changed.");
        }
    }
}
