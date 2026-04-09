package Basic_Flow_Control_Practice_Question;

import java.util.Scanner;

/* Find GCD of two numbers using a loop*/
public class Gcd {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int fnum = obj1.nextInt();
        System.out.print("Enter second number : ");
        int fnum2 = obj1.nextInt();
        int temp = 0;
        int fact=Integer.MIN_VALUE;
        if (fnum > fnum2) {
            temp = fnum;
        } else {
            temp = fnum2;
        }
        for (int i = 1;i<temp;i++){
            if(fnum % i==0 && fnum2 % i ==0){
                if(i>fact){
                    fact=i;
                }
            }
        }
        System.out.println("GCD of your given number = " + fact);
        obj1.close();
    }
}
