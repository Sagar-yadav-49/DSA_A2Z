package learnthebasics.Patterns;

import java.util.Scanner;

public class HalfDiamondStarPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern10(n);
    }
    static void pattern10(int n){
        // 1st half
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}