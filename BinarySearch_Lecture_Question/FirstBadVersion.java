package BinarySearch_Lecture_Question;

public class FirstBadVersion {

    public static boolean isBadVersion(int version) {
        return true;

    }

    public static int firstBadVersion(int n) {
        int low=1;
        int high= n;
        while(low<high){
            int mid=low+(high-low)/2;
            if(isBadVersion(mid)){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }

    public static void main(String[] args) {

    }
}
