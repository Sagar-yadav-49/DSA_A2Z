package learnthebasics.knowbasicmaths;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(reverse(num));

    }
    static int reverse(int num){
        int rev=0;
        int num2=num;
        num=Math.abs(num);
        while(num>0){
            int lastDigit =num%10;
            rev=rev*10+ lastDigit;
            num/=10;
        }
        if(num2<0){
            rev*=-1;
        }
        return rev;
    }
}