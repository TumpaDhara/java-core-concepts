package ifelsepractice;


/*WAP program to input basic salary of an employee and calculate gross salary according to given conditions.
        Basic Salary <= 10000 : HRA = 20%, DA = 80%
        Basic Salary is between 10001 to 20000 : HRA = 25%, DA = 90%
        Basic Salary >= 20001 : HRA = 30%, DA = 95%.*/

import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter salary :");
        int basicsalary = obj1.nextInt();
        float HRA, DA, grosssalary;
        if (basicsalary <= 10000) {
            HRA = 0.02f * basicsalary;
            DA = 0.08f * basicsalary;
            grosssalary = basicsalary + HRA + DA;

        } else if ((basicsalary >= 10001) && (basicsalary < 20000)) {
            HRA = 0.25f * basicsalary;
            DA = 0.09f * basicsalary;
            grosssalary = basicsalary + HRA + DA;

        } else {
            HRA = 0.03f * basicsalary;
            DA = 0.95f * basicsalary;
            grosssalary = basicsalary + HRA + DA;

        }
        System.out.println("you get grosssalary " + grosssalary);

    }
}
