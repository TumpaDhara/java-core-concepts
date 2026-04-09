package ifelsepractice;

import java.util.Scanner;

public class Gender {
    public static void main(String[] args){
        Scanner obj1 =new Scanner(System.in);
        System.out.println("Enter gender :");
        String gender= obj1.next();
        if (gender == "male"){
            System.out.println("Male...");
        }
        else {
            System.out.println("Female..");
        }
    }
}
