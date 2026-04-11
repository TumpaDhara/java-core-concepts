package arrays;

import java.util.Arrays;
import java.util.Scanner;

/*You are give 2 sorted arrays.
Merge these two sorted arrays and print it.Such that the result array remains sorted.*/
public class MergeTwoSortedArray {
    public int[] mergingMethod(int [] a1, int [] a2){
        int [] extraArray = new int[a1.length + a2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i< a1.length && i < a2.length){
            if(a1[i]<=a2[j]){
                extraArray[k] = a1[i];
                k++;
                i++;
            }else {
                extraArray[k] = a1[j];
                k++;
                j++;
            }
        }
        return extraArray;
    }
    public static void main(String[] args) {
        int [] arr1 = new int[]{5,9,10,13,17,20};
        int [] arr2 = new int[]{1,7,9,14,25,30,32};
        System.out.println("After sorting");
    }
}
