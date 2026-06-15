package Arrays;
import java.util.*;
public class Q5 {
    public static int[] shuffle(int[] nums, int n) {
        int i=0,j=n;
        int[] arr=new int[2*n];
        for (int k = 0; k < 2*n; k+=2) {
            if(j>2*n){
                return arr;
            }
            arr[k]=nums[i];
            arr[k+1]=nums[j];
            i++;j++;

        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={2,5,1,3,4,7};
        int[] arr2=shuffle(arr, 3);
        System.out.println(Arrays.toString(arr2));
    }
}
