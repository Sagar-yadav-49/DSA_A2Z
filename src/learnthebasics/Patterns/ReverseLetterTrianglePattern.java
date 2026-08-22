package learnthebasics.Patterns;

import java.util.Scanner;

public class ReverseLetterTrianglePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        pattern15(n);
    }
    static void pattern15(int n){
        for (int i = 0; i < n; i++) {
            char count=(char) 65;
            for (int j = 0; j <(n-i) ; j++) {
                System.out.print(count++);
            }
            System.out.println();
        }
    }
}