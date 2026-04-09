package switchcase;

import java.util.Scanner;

import java.util.Scanner;
public class ContinueCalculator {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner (System.in);
        int var;
        do{
            System.out.println("Please enter first number :");
            int input1 = obj1.nextInt();
            System.out.println("Please enter second number :");
            int input2 = obj1.nextInt();
            System.out.println("Please enter arithmetic operator :");
            char operator = obj1.next().charAt(0);
            switch(operator){
                case '+' :
                    System.out.println("The addition of two number : " + (input1+input2));
                    break;
                case '-' :
                    System.out.println("The subtraction of two number : " +(input1-input2));
                    break;
                case '*' :
                    System.out.println("The multiplication of two number : " + (input1*input2));
                    break;
                case '%':
                    System.out.println("The devition of two number : "+ (input1%input2));
                    break;
                default:
                    System.out.println("Invalid operator");
            }
            System.out.println("If you want to continue then press 1 or exit then 0.....");
            var = obj1.nextInt();
        }while(var ==1 );
        System.out.println("Stop");
    }
}
