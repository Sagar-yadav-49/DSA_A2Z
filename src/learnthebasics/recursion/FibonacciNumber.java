package learnthebasics.recursion;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // function call for without recursion method
//        System.out.println(fibonacciNum(n));

        //
        System.out.println(fibonacciNumber(n));
    }
    // by using for loop with no recursion
//    static int fibonacciNum(int n){
//        int num=0;
//        if(n==0) return 0;
//        if(n==1) return 1;
//        int firstNum=0;
//        int secondNum=1;
//        int nextNum=0;
//        for (int i = 2; i <= n; i++) {
//            nextNum=firstNum+secondNum;
//            firstNum=secondNum;
//            secondNum=nextNum;
//        }
//        return secondNum;
//    }
        static int fibonacciNumber(int n){
             if(n<=1) return n;
             return fibonacciNumber(n-1)+fibonacciNumber(n-2);
        }
}   