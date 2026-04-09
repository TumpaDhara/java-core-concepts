package Basic_Flow_Control_Practice_Question;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args){
        Scanner obj1 = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = obj1.nextInt();
        int fact = 1;
        for (int i = 1;i<=num;i++){
            fact = fact*2;
        }
        System.out.println("the number of power : "+fact);
        obj1.close();
    }
}
