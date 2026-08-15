package knowbasicmaths;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(checkPalindrome(num));
    }
    static boolean checkPalindrome(int num){
        int dup =num;
        int rev=0;
        while(num>0){
            int lastDigit=num%10;
            rev=rev*10+lastDigit;
            num/=10;
        }
        if(rev== dup){
            return true;
        }
        return false;
    }
}