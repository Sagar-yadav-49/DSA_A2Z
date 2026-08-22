package learnthebasics.recursion;

import java.util.Scanner;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        sumPara(n,0);
        System.out.println(sumFunc(n));
    }
    // Parametrized way
    static void sumPara(int i,int sum){
        if(i<1) {
            System.out.println(sum);
            return;
        }
        sumPara(i-1,sum+i);
    }
    // Functional Way
    static int sumFunc(int n){
        if(n==0) return 0;
        return n+sumFunc(n-1);
    }
}