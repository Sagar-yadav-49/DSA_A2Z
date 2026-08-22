package Patterns;

import java.util.Scanner;

public class IncreasingLetterTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern14(n);
    }
    static void pattern14(int n){
        for (int i = 0; i < n; i++) {
            char count=(char) 65;
            for (int j = 0; j <=i ; j++) {
                System.out.print(count++);
            }
            System.out.println();
        }
    }
}