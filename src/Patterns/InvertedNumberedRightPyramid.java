package Patterns;

import java.util.Scanner;

public class InvertedNumberedRightPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern6(n);
    }
    static void pattern6(int n){
        int count1=n;
        for (int i = 1; i <=n ; i++) {
            int count2=1;
            for (int j = 1; j <=count1 ; j++) {
                System.out.print(count2+++" ");
            }
            count1--;
            System.out.println();
        }
    }
}