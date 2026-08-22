package learnthebasics.knowbasicmaths;

import java.util.Scanner;

public class ExtractionOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        extractDigits(num);
    }
    static void extractDigits(int num){
        while(num>0){
            int lastDigit=num%10;
            num/=10;
            System.out.println(lastDigit);
        }
    }
}