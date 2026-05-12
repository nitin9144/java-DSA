import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input 1:");
        int num1 =sc.nextInt();
        System.out.print("input 2:");
        int num2 =sc.nextInt();
        System.out.println("enter operator '+-*/' : ");
        char ch = sc.next().charAt(0);
        if(ch=='+'){
            System.out.println("Sum is : "+ (num1+num2));
        }
        else if(ch=='-'){
            System.out.println("Subtraction is : "+(num1 - num2));
        }
        else if(ch=='*'){
            System.out.println("Multiplication is : "+(num1 * num2));
        }
        else if(ch=='/'){
            System.out.println("division is : "+(num1 / num2));
        }
        else {
            System.out.println("invalid operator");
        }

    }
}
