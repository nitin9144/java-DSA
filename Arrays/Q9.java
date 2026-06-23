// Check if the Sentence Is Pangram
package Arrays;
public class Q9 {
      public static boolean checkIfPangram(String sentence) {
        char ch;
        for (int i = 97 ; i <123; i++) {
            ch=(char) i;
            // System.out.println(ch);
            if(sentence.indexOf(ch) >= 0){
                continue;
            }else{
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }
}
