// Write a function to check if a given triplet is a Pythagorean triplet or not.
public class Q2 {
    static boolean py_triplet(int a,int b,int c){
        if((a*a)==(b*b)+(c*c)){
            return true;
        } 
        return false;
    }
    public static void main(String[] args) {
        System.out.println(py_triplet(6, 3, 4));
    }
}
