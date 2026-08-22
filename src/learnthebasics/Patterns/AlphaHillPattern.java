package Patterns;

import java.util.Scanner;

public class AlphaHillPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern17(n);
    }
    static void pattern17(int n){
        char count2=(char)65;
        for (int i = 0; i < n; i++) {
            // spaces
            for (int j = 0; j < (n-i-1); j++) {
                System.out.print(" ");
            }
            // 1st part
            char count1=(char)65; // A
            for (int j = 0; j <=i ; j++) {
                System.out.print(count1++);
            }
            // 2nd part
            for (int j = 0; j < i; j++) {
                System.out.print(count2--);
            }
            if(i>=1){
            count2=(char)(65+i);

            }
            System.out.println();
        }
    }
}