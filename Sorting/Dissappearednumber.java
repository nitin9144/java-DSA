package Sorting;

public class Dissappearednumber {

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);

            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            int correct = nums[j];

            if (nums[j] != j) {
                return j;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 4, 5};
    }
}
