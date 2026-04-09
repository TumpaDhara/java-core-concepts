package Basic_Flow_Control_Practice_Question;

/**
 * Write a program that prints the factorial of number 7 using do while loop and while loop.
 */

public class FactorialNumberOf7 {
    public static void main(String[] args) {
        int i = 1;
        int fact = 1;

        // Using while loop

        /*while(i<=7){
            fact = fact * i;
            i++;
        }*/


        // Using do-while loop
        do{
            fact = fact * i;
            i++;
        }while (i<=7);
        System.out.println("The factorial number of 7 = " + fact);

    }
}
