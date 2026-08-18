package recursion;

import java.util.Scanner;

public class BasicRecursionProblems {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        basic1(1, n);
//        basic2(1,n);
//        basic3(n,n);
//        basic4(n,n);
        basic5(1,n);

    }

    // print name N times
    static void basic1(int i, int n){
        // base condition
        if(i>n){
            return;
        }
        System.out.println("Sagar Yadav");
        basic1(i+1,n);

    }
    // print linearly from 1 to N
    static void basic2(int i , int n){
        if(i>n) return;
        System.out.println(i);
        basic2(i+1,n);
    }
    // print from N to 1
    static void basic3(int i, int n){
        if(i<1) return;
        System.out.println(i);
        basic3(i-1,n);
    }

    // print lineraly from 1 to N (But by backtrack)
    static void basic4(int i, int n){
        if(i<1) return;
        basic4(i-1,n);
        System.out.println(i);
    }

    // print N to 1(but by backtrack)
    static void basic5(int i, int n){
        if(i>n) return;
        basic5(i+1,n);
        System.out.println(i);
    }


}