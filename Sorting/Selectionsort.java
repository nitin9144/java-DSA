package Sorting;

import java.util.Arrays;

public class Selectionsort {

    static void selectionsort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            int temp=arr[i];
            arr[i] = arr[smallest];
            arr[smallest]=temp;

        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 7, 4,7,7,9,12,1,4,14,21};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
