package Patterns;

import java.util.Scanner;

public class Right_AngledNumberPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern3(n);
    }
    static void pattern3(int n){
        for (int i = 1; i <= n; i++) {
            int count=1;
            for (int j = 1; j <=i ; j++) {
                System.out.print(count+++" ");
            }
            System.out.println();
        }
    }
}