package ifelsepractice;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter number :");
        int abs = obj1.nextInt();
        if (abs < 0) {
            abs = -abs;   //+5 and -5 both are 5 units away from 0 ,that's why their absolute value is 5.
            System.out.println("Absolute value : " + abs);// absolute value always gives non negative result.
        } else {
            System.out.println("Given value is zero or positive number.");  // ak kothay kono sankhar (+/-) baad diye j man ta thake setakei absolute value bola hoi.
        }

    }
}
