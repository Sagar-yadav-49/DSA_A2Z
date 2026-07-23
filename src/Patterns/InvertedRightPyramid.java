package Patterns;

import java.util.Scanner;

public class InvertedRightPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern5(n);
    }
    static void pattern5(int n){
        int count=n;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=count ; j++) {
                System.out.print("*"+" ");
            }
            count--;
            System.out.println();
        }
    }
}