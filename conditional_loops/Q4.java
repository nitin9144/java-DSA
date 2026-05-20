package conditional_loops;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while (true) {
            System.out.println("Enter the number: ");
            int n=sc.nextInt();
            sum+=n;
            if(n==0){
                System.out.println("Sum is "+sum);
                return;
            }
        }
    }
}
