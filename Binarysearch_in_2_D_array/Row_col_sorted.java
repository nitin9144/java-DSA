import java.util.Arrays;

public class Row_col_sorted {
      public static int[] binarysearch(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }
            if (target > matrix[row][col]) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        //  int[][] arr = {{10, 20, 30, 40}, {15, 25, 35, 45}, {28, 29, 37, 49}};
         int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        int target = 5;
        System.out.println(Arrays.toString(binarysearch(arr, target)));
    }
}
