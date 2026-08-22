package learnthebasics.Patterns;

import java.util.Scanner;

public class AlphaRampPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern16(n);
    }
    static void pattern16(int n){
        char count=(char) 65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(count);
            }
            System.out.println();
            count++;
        }
    }
}