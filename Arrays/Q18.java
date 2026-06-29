package Arrays;

public class Q18 {
     public static boolean canJump(int[] nums) {
        int maxreach=0;
        for (int i = 0; i < nums.length-1; i++) {
            if (i>maxreach) {
                return false;
            }
            maxreach=Math.max(maxreach,i+nums[i]);
        }
        if (maxreach>=nums.length-1) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr= {3,2,1,0,4};
        System.out.println(canJump(arr));
    }
}
