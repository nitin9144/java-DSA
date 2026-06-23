// Find Numbers with Even Number of Digits
package Arrays;

public class Q12 {
    public static int findNumbers(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            int n=0;
            int temp=nums[i];
            while(temp>0){
                temp/=10;
                n+=1;
            }
            if (n%2==0) {
                count+=1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
}
