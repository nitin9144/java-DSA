// Take integer inputs till the user enters 0 and print the largest number from all.
package conditional_loops;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int largest=0;
        while (true) {
            System.out.println("Enter the number: ");
            int n=sc.nextInt();
            // sum+=n;
            if(n>largest){
                largest=n;
            }
            if(n==0){
                System.out.println("Largest is "+largest);
                return;
            }
        }
    }
}
