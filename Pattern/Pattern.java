package Pattern;

public class Pattern {

    public static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern_2(int row) {
        for (int i = 1; i <= 2*row; i++) {
            int cols=i<row ? i:2*row-i;
            for (int j = 0; j < cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    public static void pattern_3(int row) {
        for (int i = 1; i <= row; i++) {
            int cols=2*i-1;
            for (int j = 0; j < cols; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < cols; j++) {       
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern_3(n);
    }
}
