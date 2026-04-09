package Basic_Flow_Control_Practice_Question;

/*Write a program which takes total number of seconds from the user
and prints the number of hours, minutes and seconds.*/
import java.util.Scanner;

public class CalculateTimer {
    public static void main(String [] args){
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter the number of seconds : ");
        int totalSeconds = obj1.nextInt();
        int hour = totalSeconds/ 3600;
        int rSeconds = totalSeconds % 3600 ;
        int minutes = rSeconds / 60 ;
        int seconds = rSeconds % 60 ;
        System.out.println("Total number of seconds "+ totalSeconds + " = "+ hour +" hours, "+minutes+ " minutes, "+seconds +" seconds.");

    }

}
