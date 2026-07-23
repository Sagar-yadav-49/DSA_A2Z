package Patterns;

import java.util.Scanner;

public class DiamondStarPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern9(n);
    }
    static void pattern9(int n){
        // first half
        for (int i = 0; i < n; i++) {
            // for spaces
            for (int j = 0; j < (n-i-1); j++) {
                System.out.print(" ");
            }
            // for star
            for (int j = 0; j < ((2*i)+1); j++) {
                System.out.print("*");
            }
            // for spaces
            for (int j = 0; j < (n-i-1); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        // 2nd half
        for (int i = 0; i < n; i++) {
            // for spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // for star
            for (int j = 0; j < (2*n-(2*i+1)); j++) {
                System.out.print("*");
            }
            // for spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}