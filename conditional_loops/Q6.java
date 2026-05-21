// Calculate Distance Between Two Points

package conditional_loops;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter point 1 X:");
        double x1=sc.nextDouble();
        System.out.println("Enter point 1 Y:");
        double y1=sc.nextDouble();
        
        System.out.println("Enter point 2 X:");
        double x2=sc.nextDouble();
        System.out.println("Enter point 2 Y:");
        double y2=sc.nextDouble();

        double Distance= Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
        System.out.println(Distance);
        
    }
}