package String;

import java.util.Arrays;

public class Next_greater_element {

    public static int nextGreaterElement(int n) {

        String str = String.valueOf(n);
        int[] arr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }
        return 0;
    }

    public static void main(String[] args) {
        int n = 12;

        String str = String.valueOf(n);
        int[] arr = new int[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }
        
        System.out.println(Arrays.toString(arr));
    }
}
