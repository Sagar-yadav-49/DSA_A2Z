package Patterns;

import java.util.Scanner;

public class HollowRectanglePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        pattern21(n);
    }
    static void pattern21(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                if(i==0 || i==(n-1)|| j==0 ||j==(n-1)){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
