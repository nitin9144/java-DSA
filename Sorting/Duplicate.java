package Sorting;

public class Duplicate {

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static int findDuplicate(int[] nums) {
        int i=0;
        while (i<nums.length) {
            if (nums[i]!=i+1) {
                int correct=nums[i]-1;
                if(nums[i]!=nums[correct]){
                    swap(nums, i, correct);
                }else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,4,4,2};
        System.out.println(findDuplicate(arr));

    }
}
