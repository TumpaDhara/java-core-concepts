package arrays;
/*1 time right rotation*/

import java.util.Arrays;
import java.util.Scanner;

public class RightRotateArray {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("please give a number for rotate a array : ");
        int k = obj1.nextInt();
        int[] arr1 = new int[]{1, 7, 67, 2, 9};
        int i = 0;
        int temp = arr1[0];
        for (i = 0; i < arr1.length - 1; i++) {
            arr1[i] = arr1[i + 1];
        }
        arr1[arr1.length - 1] = temp;
        System.out.println("The 1 time rotate array is :" + Arrays.toString(arr1));
    }
}
