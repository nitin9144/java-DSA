// Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
package conditional_loops;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int negative = 0;
        int even_positive=0;
        int odd_positive=0;
        while (true) {
            System.out.println("Enter the number (0 for stop) : ");
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            if (num < 0) {
                negative += num;
            } else if (num > 0 && num % 2 == 0) {
                even_positive += num;
            } else if (num > 0 && num % 2 != 0) {
                odd_positive+=num;
            }
        }
        System.out.println("Sum of negative: "+negative);
        System.out.println("Sum of positive odd: "+odd_positive);
        System.out.println("Sum of positive even: "+even_positive);
    }
}
