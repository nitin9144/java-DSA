// reverse string
package conditional_loops;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        char[] arr=str.toCharArray();
        int len=str.length();
        int i=0;
        int j=len-1;
        char temp;
        while (i!=j) {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(arr);
    }
}
