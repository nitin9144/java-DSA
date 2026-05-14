//To find out whether the given String is Palindrome or not.

import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        boolean b = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.next();
        int String_length = str.length();
        int i = 0;
        int j = String_length - 1;
        while ( i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                b = false;
                break;
            }
            i++;
            j--;

        }
        if (b) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palinrome");
        }
    }
}
