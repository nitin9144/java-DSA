package Sorting;

import java.util.Arrays;

public class Missingnumber {

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];  
            if (correct>=nums.length) {
                i++;
                continue;
            }
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
                
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 0};
        missingNumber(nums);
System.out.println(Arrays.toString(nums));
    }
}
