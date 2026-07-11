package BinarySearch_Lecture_Question;

public class Peakindex_in_mountain {

    public static int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low != high) {
            int mid = low + (high - low) / 2;
            if(arr[mid]>arr[mid+1]){
                high=mid;
            }else if (arr[mid]<arr[mid+1]) {
                low=mid+1;
            }

        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {0, 2,3,4,5, 1, 0};
        int ans = peakIndexInMountainArray(arr);
        System.out.println("Peak index in mountain array: " + ans);

    }
}
