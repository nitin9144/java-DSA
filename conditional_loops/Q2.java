package conditional_loops;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        int a=0;
        int b=1;
        for (int i = 0; i < num; i++) {  
            System.out.println(a);
            int sum=a+b;
            a=b;
            b=sum; 
        } 
    }
}
