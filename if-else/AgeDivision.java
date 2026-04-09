package ifelsepractice;
/* Write a program to calculate the age deviation of a person given their age and the average age*/
import java.util.Scanner;

public class AgeDivision {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter Age :");
        int age = obj1.nextInt();
        if (age > 4 && age < 12) {
            System.out.println("Child...");
        } else if (age > 13 && age < 19) {
            System.out.println("Teenager....");
        } else if (age > 20 && age < 34) {
            System.out.println("Young adult.....");

        } else {
            System.out.println("Senior......");
        }

    }
}
