package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void swap(int[] arr,int a,int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void  CyclicSort(int[] arr){
        // for (int i = 0; i < arr.length-1; i++) {
        int i=0;
        while(i<arr.length){
            int correct_index=arr[i]-1;
            if(i==correct_index){
                i++;
            }else{
                swap(arr, i, correct_index);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={2,5,4,3,1};
        CyclicSort(arr);
System.out.println(Arrays.toString(arr));
    }
}
