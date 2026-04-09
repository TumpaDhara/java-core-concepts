package ifelsepractice;


/*Write a program to take the input for number of units of electricity consumed  and then calculate total electricity bill according to the given condition:
        For first 50 units Rs. 0.50/unit
        For next 100 units Rs. 0.75/unit
        For next 100 units Rs. 1.20/unit
        For unit above 250 Rs. 1.50/unit
        An additional surcharge of 20% is added to the bill*/
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter unit :");
        int unit = obj1.nextInt();
        float bill;
        int surcharge = (20 / 100);
        if (unit>0 && unit <= 50) {
            bill = unit * 0.50f;
        } else if (unit>50 && unit<=150) {
            int extraunit= unit-50;
            bill = (50*0.5f)+(extraunit*0.75f);
        } else if (unit>150 && unit<=250) {
            int extraunit = unit-150;
            bill  = (50*0.5f)+(150*0.75f)+(extraunit*1.2f);
        } else {
            int extraunit = unit-250;
            bill = (50*0.5f)+(150*0.75f)+(250*1.2f)+(extraunit*1.5f);
            bill+=surcharge;
        }

        System.out.println("Total electricity bill =" + " " + bill);
        obj1.close();
    }
}
