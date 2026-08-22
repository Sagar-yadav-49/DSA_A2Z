package learnthebasics.Patterns;

import java.util.Scanner;

public class NumberCrownPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern12(n);
    }
    static void pattern12(int n){
        for (int i = 0; i < n; i++) {
            // for number
            int count1=1;
            for (int j = 0; j <=i ; j++) {
                System.out.print(count1++);
            }
            // for spaces
            for (int j = 0; j < ((2*n)-((2*i)+2)); j++) {
                System.out.print(" ");
            }
            // for number
            int count2=i+1;
            for (int j = 0; j <=i ; j++) {
                System.out.print(count2--);
            }

            System.out.println();
        }
    }
}