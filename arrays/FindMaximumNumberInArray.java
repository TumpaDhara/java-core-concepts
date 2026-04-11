package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaximumNumberInArray {
    public static void approach1(int[] newArray) {
        System.out.println("The array is : " + Arrays.toString(newArray));
        int i = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int smin = Integer.MAX_VALUE;
        int smax = Integer.MIN_VALUE;
        for (i = 0; i < newArray.length; i++) {
            if ((newArray[i] > max)) {
                max = newArray[i];
            }
            if ((newArray[i] < min)) {
                min = newArray[i];
            }
        }
        System.out.println("the maximum number of the array is : " + max);
        System.out.println("the minimum number of the array is : " + min);
        for (i = 0; i < newArray.length; i++) {
            if (newArray[i] != max && newArray[i] > smax) {
                smax = newArray[i];
            }
            if (newArray[i] != min && newArray[i] < smin) {
                smin = newArray[i];
            }
        }
        System.out.println("the second maximum number of the array is : " + smax);
        System.out.println("the second minimum number of the array is : " + smin);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers in the array :");
        int[] myArray = new int[5];
        for (int i = 0; i < 5; i++) {
            myArray[i] = sc.nextInt();
        }
        approach1(myArray);
    }
}
