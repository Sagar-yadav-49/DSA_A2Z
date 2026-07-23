package Patterns;

import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern7(n);
    }
    static void pattern7(int n){
        for (int i = 0; i < n; i++) {
            // for space
            for (int j = 0; j <(n-i) ; j++) {
                System.out.print(" ");
            }
            // for star
            for(int j=0;j<((2*i)+1);j++){
                System.out.print("*");
            }
            // for space
            for (int j = 0; j <(n-i) ; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}