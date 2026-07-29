package Patterns;

import java.util.Scanner;

public class SymmetricButterflyPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        pattern20(n);
    }
    static void pattern20(int n){
        // 1st half
        for (int i = 0; i < n; i++) {
            // for stars
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            // for spaces
            for (int j = 0; j < (2*n-(2*i+2)); j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for (int i = 0; i < (n-1); i++) {
            // for stars
            for (int j = 0; j < (n-i-1); j++) {
                System.out.print("*");
            }
            // for spaces
            for (int j = 0; j < (2*i+2); j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 0; j < (n-i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}