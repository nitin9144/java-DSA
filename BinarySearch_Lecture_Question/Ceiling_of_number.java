package BinarySearch_Lecture_Question;

public class Ceiling_of_number {
    public static char Ceiling(char[] arr,char target) {
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
                return arr[mid];
                // continue;
            }
        }
        return arr[low];
        }
    public static void main(String[] args) {
        char[] arr={'c','f','j'};
        System.out.println(Ceiling(arr,'g'));
    }
}
