package conditional_loops;

import java.util.Scanner;

public class Q3_Subtraction_of_Sum_and_Product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();

        int temp=n;
        int sum=0;
        int pro=1;
        while (temp>0) {
            int last_digit=n%10;
            sum+=last_digit;
            pro*=last_digit ;
            temp/=10;
        }
        int diff=pro-sum;
        System.out.println(diff);
    }
}
