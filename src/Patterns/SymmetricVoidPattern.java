package Patterns;

import java.util.Scanner;

public class SymmetricVoidPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern19(n);
    }
    static void pattern19(int n){
        // 1st half
        for (int i = 0; i < n; i++) {
            // for stars
            for (int j = 0; j <(n-i) ; j++) {
                System.out.print("*");
            }
            // for spaces
            for (int j = 0; j < 2*i; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 0; j <(n-i) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for (int i = 0; i < n; i++) {
            // for stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // for spaces
            for (int j = 0; j < (2*n-(2*i+2)); j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}