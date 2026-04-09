package Basic_Flow_Control_Practice_Question;

/**
 * Write a program that prints the factors of the number 7832
 */

public class FactorsOf7832 {
    public static void main(String [] args ){
        for (int i = 1;i<=7832 ; i++){
            if(7832 % i ==0){
                System.out.print(i + " ");
            }
        }
    }
}
