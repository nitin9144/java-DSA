package Arrays;

import java.util.Arrays;

public class Q16 {
    public static  int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int prefix=1,sufix=1;
        for (int i = 0; i < ans.length; i++) {
            ans[i]=prefix;
            prefix*=nums[i];
        }
        for (int i = nums.length-1; i >=0; i--) {
         ans[i]*= sufix;
         sufix*=nums[i];   
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr={2,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)) );
    }
}
