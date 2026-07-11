package BinarySearch_Lecture_Question;

public class Binarysearch_in_infinite_array {
    public static int binarysearch_infinite_array(int[] arr,int target){
        int window_size=2;
        int low=0;
        int high=1;
        int ans=-1;
        int newlow=0;
        while(target>arr[high] ){
            newlow=high+1;
            high=high+(high-low+1)*2;
        }
        ans=binarysearch(arr, target, newlow, high);
        return ans;
    }
    public static int binarysearch(int[] arr, int target, int low, int high){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={3, 5, 7, 9, 10, 90, 100, 130, 350};
        int target=90;
        int ans=binarysearch_infinite_array(arr, target);
        if(ans==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: "+ans);
        }
        
    }
}
