package ifelsepractice;

import java.util.Scanner;

public class Natural_Number {
    public static void main(String[] args) {
        Scanner obj1= new Scanner(System.in);
        System.out.print("Enter number :");
        int naturalnumber = obj1.nextInt();
        if(naturalnumber>0){
            int sum =naturalnumber*(naturalnumber+2)/2;
            System.out.println("Total sum of the number = "+ sum);
        }
        if(naturalnumber<0){
            System.out.println("It is a error.");
        }

    }
}
