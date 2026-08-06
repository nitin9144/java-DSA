package Binarysearch_in_2_D_array;

import java.util.*;

public class Sorted_row_and_colums {

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
        int[][] arr = {{10, 20, 30, 40}, {15, 25, 35, 45}, {28, 29, 37, 49}};
        int target = 35;
        System.out.println(Arrays.toString(binarysearch(arr, target)));
    }
}
