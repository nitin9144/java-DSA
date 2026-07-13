package BinarySearch_Lecture_Question;

public class Search_in_rotated_sorted_array {

    public static int search(int[] nums, int target) {
        int pivot = findpeak(nums);
        System.out.println(pivot);
        int ans=-1;
        if(pivot==-1){
            ans =binarysearch(nums, target, 0, nums.length-1);
            return ans;
        }
        if(nums[pivot]==target){
            return pivot;
        }
        ans = binarysearch(nums, target, 0, pivot-1);
        if(ans==-1){
            ans=binarysearch(nums, target, pivot+1, nums.length-1);
        }
        return ans;
    }

    public static int findpeak(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low != high) {
            int mid = low + (high - low) / 2;
            if (mid < high && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (mid > low && nums[mid] < nums[mid - 1]) {
                return mid;
            } else if (nums[low] > nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int binarysearch(int[] nums, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3,1};
        int target = 1;
        System.out.println(search(nums, target));
    }
}
