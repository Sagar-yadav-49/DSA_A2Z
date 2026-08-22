package learnthebasics.knowbasicmaths;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println(optimalApproach(num1,num2));
    }
    // Time Complexity -> O(min(num1,num2)
    static int findGcd1(int num1, int num2){
        int gcd=1;
        int min=Math.min(num1,num2);
        for (int i = 1; i <= min; i++) {
            if(num1%i==0 && num2%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    // in some cases like , GCD(20,40) it gives better time complexity -> O(1)
    // but case like, GCD(11,13) it also gives -> O(min(num1,num2)
    static int findGcd2(int num1, int num2){
        int gcd=1;
        int min=Math.min(num1,num2);
        for (int i = min; i >=1; i--) {
            if(num1%i ==0 && num2%i ==0){
                gcd=i;
                break;
            }
        }
        return gcd;
    }

    static int optimalApproach(int num1, int num2){
        int gcd=1;
        while(num1>0 && num2>0){
            if(num1>num2) num1=num1%num2;
            else num2=num2%num1;
        }
        if(num1==0) gcd=num2;
        else gcd=num1;
        return gcd;
    }
}