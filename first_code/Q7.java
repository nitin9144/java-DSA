import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        int n1=0;
        int n2=1;
        for (int i = 0; i < num; i++) {
            System.out.println(n1);
            int n3=n1+n2;
            n1=n2;
            n2=n3;
        }
    }
}
