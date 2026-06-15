package Arrays;

import java.util.Arrays;

public class Q7 {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int count=0;
        int[] arr=new int[nums.length];

        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    continue;
                }
                if(nums[i]>nums[j]){
                    count+=1;
                }
            }
            arr[i]=count;
            count=0;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        int[] arr2 = smallerNumbersThanCurrent(arr);
        System.out.println(Arrays.toString(arr2));
    }
}
