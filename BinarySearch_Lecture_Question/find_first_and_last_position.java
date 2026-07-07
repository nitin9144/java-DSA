//Find First and Last Position of Element in Sorted Array
package BinarySearch_Lecture_Question;

import java.util.Arrays;

public class find_first_and_last_position {

    public static int[] searchRange(int[] nums, int target) {
        int[] range = {-1, -1};
        int first = binarysearch(nums, target, true);
        int last = binarysearch(nums, target, false);
        range[0] = first;
        range[1] = last;
        return range;
    }

    public static int binarysearch(int[] nums, int target, boolean findfirstindex) {
        int ans=-1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findfirstindex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 5, 5,5, 7};
        System.out.println(Arrays.toString(searchRange(arr, 6)));
    }
}
