public class Sorted_matrix {
    public static int[] search_matrix(){

    }
    public static int[] binarysearch(int[][] matrix,int row,int cstart,int cend,int target){
        while(cstart<=cend){
            int mid=cstart+(cend-cstart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }if(matrix[row][mid]<target){
                cstart=mid+1;
            }else{
                cend=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        
    }
}
