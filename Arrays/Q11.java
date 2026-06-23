// Maximum subarray 
package Arrays;

public class Q11 {
    //Brute Force
    // public static int maxSubArray(int[] nums) {
    //     int max_sum=nums[0];
    //     int curnt_max=0;
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = i; j < nums.length; j++) {
    //             curnt_max=0;
    //             for (int k = i; k <=j; k++) {
    //                 curnt_max+=nums[k];
    //             }
    //             if(curnt_max>max_sum){
    //                 max_sum=curnt_max;
    //             }
    //         }
    //     }

    //     return max_sum;
    // }
    //kadan's algorithm
    public static int maxSubArray(int[] nums) {
        int max_sum = nums[0];
        int curnt_max = 0;
        for (int i = 0; i < nums.length; i++) {
            curnt_max += nums[i];
            if (curnt_max > max_sum) {
                max_sum = curnt_max;
            }
            if (curnt_max < 0) {
                curnt_max = 0;
            }
        }

        return max_sum;
    }

    public static void main(String[] args) {
        int[] arr = {-1};
        System.out.println(maxSubArray(arr));
    }
}
