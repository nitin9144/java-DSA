
import java.util.Arrays;


public class square_of_sorted_array {

    public static  int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] sq = new int[nums.length];
        int i = nums.length - 1;
        for (int j = 0; j < sq.length; j++) {
            nums[j]=nums[j]*nums[j];
        }
        while (left <= right) {
            if (nums[left] <= nums[right]) {
                sq[i] = nums[right];
                right--;
                i--;
            } else {
                sq[i] = nums[left];
                left++;
                i--;
            }
        }
        return sq;
    }

    public static void main(String[] args) {
        int[] arr={-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
}
