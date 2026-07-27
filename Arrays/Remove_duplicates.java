package Arrays;

import java.util.Arrays;

public class Remove_duplicates {

    public static int[] removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (j < nums.length && nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }

        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 5, 5};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }
}
