public class Sqrt {
    public static int mySqrt(int n) {
           if (n == 0 || n == 1) {
            return n;
        }

        int low = 1;
        int high = n;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Use long to prevent overflow
            long square = (long) mid * mid;

            if (square == n) {
                return mid;
            } else if (square < n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        
    }
}
