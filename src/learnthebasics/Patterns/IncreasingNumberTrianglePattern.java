package Patterns;

import java.util.Scanner;

public class IncreasingNumberTrianglePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        pattern13(n);
    }
    static void pattern13(int n){
        int count=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(count+++" ");
            }
            System.out.println();
        }
    }
}