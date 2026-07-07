package Arrays;

public class Q20 {

    public static int removeDuplicates(int[] nums) {
        int count = 0;
        int i;
        int j=0;
        for (i = 0; i < nums.length; i++) {

            if (i < nums.length && nums[i] != nums[i+1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(arr));
    }
}