package Arrays;

public class Q18 {
     public static boolean canJump(int[] nums) {
        int i=0;
        while(i<nums.length) {
            i++;
            for (int j = 0; j < nums[i]; j++) {
                i++;
            }
            if(i==nums.length-1){   
                return true;
            }else{
                return false;
            }

        }
        
        return false;
    }
    public static void main(String[] args) {
        int[] arr= {2,3,1,1,4};
        System.out.println(canJump(arr));
    }
}
