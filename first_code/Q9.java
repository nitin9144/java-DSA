import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the low");
        int low = sc.nextInt();
        System.out.println("enter the high");
        int high = sc.nextInt();

        while (low <= high) {
            int num = low;
            int temp = num;
            int a = 0;
            while (temp > 0) {
                int digit = temp % 10;
                a += digit * digit * digit;
                temp /= 10;
            }
            if (a == num) {
                System.out.println("armstrong no: " + num);
            }
            low++;
        }
        sc.close();
    }
}
