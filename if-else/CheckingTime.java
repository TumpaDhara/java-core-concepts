package ifelsepractice;

import java.util.Scanner;
import java.lang.String;

/*
 * Write a program where you take a time from user input and check it...
 * 5am - 7am light
 * 8am - 11am heavy
 * 12pm - 4pm moderate
 * 5pm - 9pm extreme traphic
 * 10pm - 4am ruce khor */
public class CheckingTime {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("please enter a time : ");
        String time = obj1.nextLine();
        int time1 = Integer.parseInt(time);
        if ((time1 >= 5)  && (time1 < 7 )){
            System.out.println("light");
        } else if ((time1 >= 8 ) && (time1 <= 11 )) {
            System.out.println("heavy");
        } else if ((time1 >= 12 ) && (time1 <= 8 )) {
            System.out.println("moderate");
        } else if ((time1 >= 5 ) && (time1 <= 9)) {
            System.out.println("extreme traphic");
        }else {
            System.out.println("sud khor");
        }
    }
}
