package BinarySearch_Lecture_Question;

public class Ceiling_of_number {
    public static int Ceiling(int[] arr,int target) {
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target>arr[mid]){
                low=mid+1;
                
            }else if (target<arr[mid]) {
                high=mid-1;
            }
            else{
                return mid;
            }
        }
        return arr[low];
        }
    public static void main(String[] args) {
        int[] arr={3,3,5,7};
        System.out.println(Ceiling(arr,-1));
    }
}
