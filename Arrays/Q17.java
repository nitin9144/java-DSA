package Arrays;

import java.util.Arrays;

public class Q17 {

    public static void reverse(int[] arr, int low, int high) {
        int temp;
        int i = low, j = high;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotate(int[] nums, int k) {
        // for (int i = 0; i < k; i++) {
        // }
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));

    }
}
