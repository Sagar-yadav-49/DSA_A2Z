package learnthebasics.hashing;

import java.util.Arrays;
import java.util.Scanner;

public class CharacterHashing {
    public static void main(String[] args) {
//        String str="sagar";
//        char c='b';
//        System.out.println(func(str,c));

        // Character hashing
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();

        //
//        funLower(str);
        //
        funUpp(str);
    }


    // only allow lowerCase letters
    static void funLower(String str) {
        Scanner sc=new Scanner(System.in);
        // Pre-computation
        int hash[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i) - 'a']++;
        }
//        System.out.println(Arrays.toString(hash));
        System.out.println("Enter number of queries");
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            char c = sc.next().charAt(0);
            // fetching
            System.out.println(hash[c - 'a']);

        }
    }
    // if upperCase are also there
    static void funUpp(String str){
        Scanner sc=new Scanner(System.in);
        // pre-computation
        int[] hash=new int[256];
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i)]++;
        }

        System.out.println("Enter number of queries");
        int q=sc.nextInt();
        for (int i = 0; i <q ; i++) {
            char c=sc.next().charAt(0);
            System.out.println(hash[c]);
        }
    }
    // Standard Procedure
//    static int func(String str, char c){
//        int count=0;
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i)==c) count++;
//        }
//        return count;
//    }
}