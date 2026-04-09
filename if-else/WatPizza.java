package ifelsepractice;

import java.util.Scanner;

public class WatPizza {
    public static void main(String[] args){
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter your name :");
        String customername = obj1.nextLine();
        System.out.println("Enter your Email id :");
        String customeremail = obj1.nextLine();
        System.out.println("Enter your phone no. :");
        int phoneno = obj1.nextInt();
        System.out.println("Enter your address :");
        String adress = obj1.nextLine();
        System.out.println("Please ordered the pizza :");
        int no_of_ordered_pizza = obj1.nextInt();


    }
}
