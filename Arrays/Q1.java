package Arrays;

public class Q1 {
    static int[] method(int[] arr){
        int[] ans= new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i]=arr[arr[i]];
        }
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(method(new int[]{2,4,5}));
    }
}
