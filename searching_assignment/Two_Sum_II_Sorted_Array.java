package searching_assignment;

import java.util.Arrays;

public class Two_Sum_II_Sorted_Array {

    public static int[] twoSum(int[] numbers, int target) {
        int low=0;
        int high=numbers.length-1;
        int[] ans=new int[2];
        while(low<high){
            int sum=numbers[low]+numbers[high];
            if(sum==target){
                ans[0]=low;
                ans[1]=high;
                return ans;
            }else if(sum>target){
                high--;
            }else{
                low++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=18;
        System.out.println(Arrays.toString(twoSum(arr, target))); //[1,2]
    }
}
