package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ReversedArray {
    public static void approach1(int [] nArray){
        System.out.println("Using appraoch 1 :");
        System.out.println("Before array : " + Arrays.toString(nArray));
        int []  extraArray=new int[nArray.length];
        int j = 0;
        for(int i = nArray.length-1; i >= 0; i--){
            extraArray[j]=nArray[i];
            j++;
        }
        System.out.println("Reversed array : " + Arrays.toString(extraArray));
    }
    public static void  approach2(int[] nArray){
        System.out.println("Using approach 2 : ");
        System.out.println("Before array : " + Arrays.toString(nArray));
        int i = 0, j = nArray.length-1;
        int temp;
        while(i<j){
            temp = nArray[i];
            nArray[i] = nArray[j];
            nArray[j] = temp;
            i++;
            j--;
        }
        System.out.println("Reversed array : " + Arrays.toString(nArray));
    }
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        int[] myArray = new int[5];
        System.out.println("Please enter elements :");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = obj1.nextInt();
        }
        obj1.close();
        approach1(myArray);
        approach2(myArray);
       /* System.out.print("[ ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.print("]");*/
       // System.out.println("The array is : " + Arrays.toString(myArray));
    }
}
