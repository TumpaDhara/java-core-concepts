package Basic_Flow_Control_Practice_Question;


//write a java program that prints the odd numbers between 9 and 48 using a while loop.

public class OddNumbersUsingWhileLoop {
    public static void main(String[] args) {
       /* int i = 9;
        while (i <= 48) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }*/
//         Another approach ,,,,,
        int i = 9;
        while (i <= 48) {
                System.out.print(i + " ");
            i+=2;
        }
    }

}
