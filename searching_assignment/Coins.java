public class Coins {
     public static int arrangeCoins(int n) {
        int low=0;
        int high=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            int coins=mid*(mid+1)/2;
            if(coins==n){
                return mid;
            }else if(coins<n){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high;
    }
    public static void main(String[] args) {
        System.out.println(arrangeCoins(10));
    }
}
