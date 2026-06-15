// 1480. Running Sum of 1d Array
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

// Return the running sum of nums.

 

// Example 1:

// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
package Arrays;
import java.util.*;
public class Q3 {
    public static int[] runningSum(int[] nums) {
        int n=nums.length;
        int summ=0;
        int[] sum=new int[n];
        for (int i = 0; i < n; i++) {
            summ+=nums[i];
            sum[i]=summ;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,1,1};
        int[] arr2=runningSum(arr);
        System.out.println(Arrays.toString(arr2));
    }
}
