package Patterns;

import java.util.Scanner;

public class TheNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern22(n);
    }
    static void pattern22(int n){
        for (int i = 0; i < (2*n-1); i++) {
            for (int j = 0; j < (2*n-1); j++) {
                int top=i, left=j,right=(2*n-2)-j, bottom=(2*n-2)-i;
                System.out.print(n-Math.min(Math.min(top,left),Math.min(right,bottom)));
            }
            System.out.println();
        }
    }
}