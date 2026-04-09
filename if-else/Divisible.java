package ifelsepractice;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = obj1.nextInt();
        /*if(number % 5==0){
            System.out.println("This number is divisible by 5.");
        }
        else{
            System.out.println("This number is not divisible by 5");
        }*/

       /* if (number % 2 == 0 || number % 7 == 0) {
            System.out.println("This number is divisible by 2 or 7.");
        } else {
            System.out.println("This number is not divisible by 2 or 7.");
        }*/

        /*if (number % 2 == 0 && number % 3 == 0) {
            System.out.println("This number is divisible by both 2 and 3");
        } else {
            System.out.println("This number is not divisible by both 2 and 3");
        }*/
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("This number is multiple by 3 and 5.");
        } else {
            System.out.println("This number is not multiple by 3 and 5.");
        }

    }
}
