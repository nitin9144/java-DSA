package String;

public class Occurence_in_String {
    public static boolean  compare(String haystack,String needle,int i){
        int flag=0;
        int count=0;
        int index=i;
        
        for (int j = 0; j < needle.length(); j++) {
            if (needle.charAt(j)== haystack.charAt(index)) {
                count++;
                index++;
            }
        }
        if (count==needle.length()) {
            return true;
        }
        return false;
    }
      public static int strStr(String haystack, String needle) {
        if(needle.length()==0 || needle.length()>haystack.length()){
            return -1;
        }
       for (int i = 0; i < haystack.length(); i++) {
        if(haystack.charAt(i)==needle.charAt(0)){
            if(compare(haystack,needle,i)){
                return i;
            }
        }
       }
       return -1;
    }
    public static void main(String[] args) {
        String haystack = "aaaa";
        String needle = "aaa";
        System.out.println(strStr(haystack, needle) );
    }
}
