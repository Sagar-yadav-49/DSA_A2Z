package learnthebasics.Patterns;

import java.util.Scanner;

public class AlphaTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern18(n);
    }
    static void pattern18(int n){
        char count=(char)(65+n-1);
        for (int i = 0; i < n; i++) {
            int var=count-i;
            for (int j = 0; j <=i ; j++) {
                System.out.print((char)var+" ");
                var++;
            }
            System.out.println();
        }
    }
}