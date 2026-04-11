package arrays;

import java.util.Arrays;
import java.util.Scanner;

/* k times array rotate*/
public class kTimesRotateArray {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.print("please give a number for rotate a array : ");
        int k = obj1.nextInt();
        int[] arr1 = new int[]{1, 7, 67, 2, 43, 12, 9};
        int[] k1 = new int[k];
        int i = 0;
        int arr1Size = arr1.length;
        for (i = k1.length-1; i >= 0; i--) {
            k1[i] = arr1[i];
        }
        int j = 0;
        for (i = arr1.length-1; i < k; i--) {
            arr1[j]=arr1[i];
            j++;
        }
        for (i = 0; i< arr1Size;i++){
        }
        System.out.println("The "+ k + " times rotate array is : "+ Arrays.toString(k1));
        System.out.println("The "+ k + " times rotate array is : "+ Arrays.toString(arr1));
    }

}
