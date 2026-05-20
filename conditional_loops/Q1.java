package conditional_loops;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius:");
        int r =sc.nextInt();
        System.out.println("Enter Height:");
        int h =sc.nextInt();

        double v=(Math.PI*r*r*h)/3;
        System.out.println("Volume of cone is : "+v);
    }
}
