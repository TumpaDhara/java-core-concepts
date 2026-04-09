package ifelsepractice;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter temperature :");
        int temp =obj1.nextInt();
        if(temp<15){
            System.out.println("Cold.....");
        } else if (temp>15 && temp<59) {
            System.out.println("warm....");
        }
        else{
            System.out.println("hot...");
        }

    }
}
