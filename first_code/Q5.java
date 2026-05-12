import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1= sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2= sc.nextInt();
        if(num1>num2){
            System.out.println("Num is greater");
        }else if (num2>num1){
            System.out.println("Number 2 is greater");
        }
        else{
            System.out.println("equal");
        }
    }
}
