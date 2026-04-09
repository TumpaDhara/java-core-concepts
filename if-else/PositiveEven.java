package ifelsepractice;

import java.util.Scanner;

public class PositiveEven {
    public static void main(String[] args){
        Scanner obj1= new Scanner(System.in);
        System.out.println("Enter number :");
        int input =obj1.nextInt();
        if(input % 2==0){
            if(input > 0){
                System.out.println("its positive even.");
            }
            else{
                System.out.println("its negetive even.");
            }
        }
        else{
            if (input<0){
                System.out.println("its negetive odd.");
            }
            else{
                System.out.println("its positive odd.");
            }

        }
        obj1.close();
    }
}
