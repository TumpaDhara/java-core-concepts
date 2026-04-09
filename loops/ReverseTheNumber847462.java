package Basic_Flow_Control_Practice_Question;

/*Write a program that reverses the number 847462 and prints it.*/



public class ReverseTheNumber847462 {
    public static void main(String[] args) {
        System.out.print("The reverse number of 847462 = ");
        int temp = 847462;
        int rem = 0;
        while (temp > 0){
            rem = temp % 10;
            System.out.print(rem);
            temp = temp / 10;
        }

    }
}
