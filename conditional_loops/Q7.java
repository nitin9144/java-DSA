// Armstrong Number
package conditional_loops;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int temp=num;
        int sum =0;
        while (temp>0) {
            int last=temp%10;
            sum+=Math.pow(last, 3);
            temp/=10;
        }
        if(sum==num){
            System.out.println("Armstrong Number!");
        }else{
            System.out.println("Not an armstrong number");
        }
    }
}
