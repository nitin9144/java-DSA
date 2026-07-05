package BinarySearch_Lecture_Question;

public class Find_Smallest_Letter_Greater_Than_Target {

    // public static char nextGreatestLetter(char[] letters, char target) {
    //     int low = 0;
    //     int high = letters.length - 1;
    //     while (low <= high) {
    //         int mid = low + (high - low) / 2;
    //         if (target > letters[mid]) {
    //             low = mid + 1;

    //         } else  {
    //             high = mid - 1;
    //         } 
    //     }
    //     // if (low==letters.length) {
    //     //     return letters[0];
    //     // }
    //     return letters[low % letters.length];
    // }
    public static char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target >= letters[mid]) {
                low = mid + 1;

            } else  {
                high = mid - 1;
            } 
        }
        // if (low==letters.length) {
        //     return letters[0];
        // }
        return letters[low % letters.length];
    }

    public static void main(String[] args) {
        // char[] letters={'x','x','y','y'};
        char[] letters = {'c', 'f', 'j'};
        char target = 'f';
        System.out.println(nextGreatestLetter(letters, target));
    }
}
