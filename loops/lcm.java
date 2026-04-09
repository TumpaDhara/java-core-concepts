package Basic_Flow_Control_Practice_Question;

import java.util.Scanner;

/* Find lcm of (12,18)
2²
3²

LCM = 2² × 3² = 4 × 9 = 36*/
public class lcm {
    public static void main(String[] args){
        Scanner obj1 = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num1 = obj1.nextInt();
        System.out.println("enter a number : ");
        int num2 = obj1.nextInt();
        int max = Math.max(num1,num2);
        while(true){
            if(max % num1 ==0 && max % num2 ==0){
                System.out.println("lcm = "+ max);
                break;
            }
            max++;
        }
        // another formula also lcm = (A*B)/GCD;
    }
}
