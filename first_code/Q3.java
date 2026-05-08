
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Principle:");
        int p = sc.nextInt();
        System.out.println("enter the Rate:");
        int r = sc.nextInt();
        System.out.println("enter the Time:");
        int t = sc.nextInt();
        int si=(p*r*t)/100;
        System.out.println("simple interest is :"+si);

    }
}
