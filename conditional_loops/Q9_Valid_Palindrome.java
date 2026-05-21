package conditional_loops;

import java.util.Scanner;

public class Q9_Valid_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        // Two-pointer approach
        int i = 0;
        int j = str.length() - 1;
        boolean isPalindrome = true;

        while (i < j) {
            // Skip non-alphanumeric characters
            while (i < j && !Character.isLetterOrDigit(str.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(str.charAt(j))) {
                j--;
            }

            // Compare characters ignoring case
            if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (isPalindrome) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

        sc.close();
    }
}
