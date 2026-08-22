package learnthebasics.recursion;
import java.util.Scanner;

public class CheckPalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int len=str.length();
        System.out.println(checkPalindromeString(0, str, len));
    }
    static boolean checkPalindromeString(int start, String str, int len){
        if(start>len/2) return true;
        if(str.charAt(start)!=str.charAt(len-start-1)){
            return false;
        }
        return checkPalindromeString(start+1, str, len);
    }
}