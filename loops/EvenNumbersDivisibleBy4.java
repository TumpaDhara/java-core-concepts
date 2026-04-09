package Basic_Flow_Control_Practice_Question;


//  write a program that prints the even numbers divisible by 4 between 7 and 78 using do-while loop.

public class EvenNumbersDivisibleBy4 {
    public static void main(String[] args){
        int i = 7;
       do{
          if(i % 2 == 0){
              if(i % 4 == 0){
                  System.out.print(i + " ");
              }
          }
          i++;
       }while (i<=48);
    }
}
