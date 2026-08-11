package Sorting;

public class Missingnumber {

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            // if (correct >= nums.length) {
            //     i++;
            //     continue;
            // }
            if (nums[i]<nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);

            } else {
                i++;
            }
        }
        // int j = 0;
        // while (j < nums.length) {
        //     int correct = nums[j];

        //     if (nums[j] != correct) {
        //         return correct;
        //     } 
        //         j++;
        // }    
        // return j-1;
        for (int j = 0; j < nums.length; j++) {
            int correct = nums[j];

            if (nums[j] !=j){
                return j;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2,3, 4, 5};
        // missingNumber(nums);
// System.out.println(Arrays.toString(nums));
        System.out.println(missingNumber(nums));
    }
}
