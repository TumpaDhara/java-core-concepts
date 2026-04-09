package Basic_Flow_Control_Practice_Question;
/**
 * "Write a program which takes number_of_hours and number_of_minutes as input from user and passes it to a function
 * which converts the hours and minutes to seconds."
 */

import java.util.Scanner;

public class ConvertingHourToMinutes {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Take the number of hours : ");
        int hour = obj1.nextInt();
        System.out.print("Take the number of minutes : ");
        int minutes = obj1.nextInt();
        int convertHour = hour * 3600;
        int convertminutes = minutes * 60;
        System.out.println(hour + " Hour = " + convertHour + " seconds");
        System.out.println(minutes + " Minutes = " + convertminutes + " seconds");
        obj1.close();

    }
}
