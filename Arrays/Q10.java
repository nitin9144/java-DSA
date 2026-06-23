package Arrays;

public class Q10 {

    static public int[][] flipAndInvertImage(int[][] image) {
        int temp;
        int row_length = image.length;
        int col_length = image[0].length;
        //rev hoz
        for (int k = 0; k < row_length; k++) {
            int[] temp_arr_row=image[k];
            int i=0;
            int j=col_length-1;
            while(i<j){
                temp=temp_arr_row[i];
                temp_arr_row[i]=temp_arr_row[j];
                temp_arr_row[j]=temp;
                i++;j--;
            }
        }
        for (int k = 0; k < row_length; k++) {
           for (int i = 0; i < image.length; i++) {
            if (image[k][i]==0) {
                image[k][i]=1;
            }else if (image[k][i]==1) {
                image[k][i]=0;
                
            }
           }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        image = flipAndInvertImage(image);
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(image[i][j]);
            }
            System.out.println();
        }

    }
}
