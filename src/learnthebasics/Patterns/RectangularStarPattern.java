package Patterns;

import java.util.Scanner;

public class RectangularStarPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern1(n);
    }
    static void pattern1(int n){

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}