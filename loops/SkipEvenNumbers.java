package Basic_Flow_Control_Practice_Question;

/**
 *Write a program that prints all the even numbers between 4 to 67 but skips any number which is multiple of 3.
 */
public class SkipEvenNumbers {
    public static void main(String[] args) {
        for (int i = 4; i<= 67; i++){
            if(i % 2==0){
                if (i%3==0) continue;
                System.out.print(i + " ");
            }
        }

    }
}
