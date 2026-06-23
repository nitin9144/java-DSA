package Arrays;

public class Q13 {

    public static int removeDuplicates(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            
            if (  j<nums.length && nums[i] != nums[j]) {
                count++;
            }

        }
        return count+1;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
