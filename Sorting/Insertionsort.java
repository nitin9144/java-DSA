package Sorting;

import java.util.Arrays;

public class Insertionsort {
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void insertionsort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if(arr[j-1]>arr[j]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    public static void main(String[] args) 
    {
            int[] arr={2,9,8,6,-1,5};
            insertionsort(arr);
            System.out.println(Arrays.toString(arr));
    }
}
 