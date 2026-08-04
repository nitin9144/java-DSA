package Sorting;

import java.util.Arrays;

public class Selectionsort {
    static void selectionsort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int smallest=arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<smallest) {
                    smallest=arr[j];
                }
            }
            arr[i]=smallest;
            
        }
    }
    public static void main(String[] args) {
        int[] arr={3,2,7,4};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
