// 1929. Concatenation of Array
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

// Specifically, ans is the concatenation of two nums arrays.
// Return the array ans
package Arrays;
import java.util.Arrays;

public class Q2 {

    static public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int i;
        int[] ans = new int[2 * n];
        for (i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int[] arr2 = getConcatenation(arr);
        System.out.println(Arrays.toString(arr2));

    }
}
