package Arrays;

public class Q1 {
    static int[] method(int[] nums){
        int[] ans= new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i]=nums[nums[i]];
        }
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(method(new int[]{2,4,5}));
    }
}
