import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();
        if(num == 0){
            System.out.println("nor even nor odd");
        }
        else if (num % 2 == 0){
            System.out.println("number is even");

        }
        else{
            System.out.println("number is odd");
        }

    }
}