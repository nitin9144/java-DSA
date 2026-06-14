package Array_lecture;

import java.util.Arrays;

public class L1 {
    public static void main(String[] args) {
        // int[] p=new int[5];

        // int[] r={1,2,3,4,5};

        // for (int i = 0; i < 5; i++) {
        //     p[i]=r[i];
        // }
        // r[0]=1111;
        // p[0]=1000;
        // System.out.println(Arrays.toString(p));
        // System.out.println(Arrays.toString(r));
        // System.out.println(Arrays.toString(p));
        int[][] arr_2D= {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        // System.out.println(arr_2D[0][2]);
        for (int[] row : arr_2D) {
            System.out.println(Arrays.toString(row));
        }
    }
}
