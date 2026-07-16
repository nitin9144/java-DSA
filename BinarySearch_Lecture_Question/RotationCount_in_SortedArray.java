package BinarySearch_Lecture_Question;

public class RotationCount_in_SortedArray {

    public static int rotation_count(int[] nums) {
        int peak=peak(nums);
        
        return peak+1;
    }
    public static int peak(int[] arr){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while (low!=high) { 
            int mid=low+(high-low)/2;
            if(mid>low && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid<high && arr[mid]<arr[mid-1]){
                return mid-1;
            }else if(arr[low]>arr[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        System.out.println(rotation_count(arr));
    }
}
