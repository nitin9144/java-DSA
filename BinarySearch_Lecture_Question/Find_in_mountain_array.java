package BinarySearch_Lecture_Question;

public class Find_in_mountain_array {

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int low = 0;
        int high = mountainArr.length() - 1;
        int peak = peakIndexInMountainArray(mountainArr);
        int ans = binarysearch(mountainArr, target, low, peak);
        if (ans == -1) {
            ans = binarysearch(mountainArr, target, peak, mountainArr.length() - 1);

        }
        return ans;
    }

    public static int peakIndexInMountainArray(MountainArray arr) {
        int low = 0;
        int high = arr.length() - 1;
        while (low != high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) > arr.get(mid + 1)) {
                high = mid;
            } else if (arr.get(mid) < arr.get(mid + 1)) {
                low = mid + 1;
            }

        }
        return low;
    }

    public static int binarysearch(MountainArray arr, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == target) {
                return mid;
            } else if (arr.get(mid) < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int binarysearch_decreasingorder(MountainArray arr, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == target) {
                return mid;
            } else if (arr.get(mid) < target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
