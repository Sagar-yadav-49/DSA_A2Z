package learnthebasics.knowbasicmaths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class printAllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        betterApproach(num);
    }
    static void printDivisors(int num) {
        for (int i = 1; i <= num; i++) {
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
    static void printDivisors2(int num) {
        for (int i = 1; i <= (num/2); i++) {
            if(num%i==0){
                System.out.println(i);
            }
        }
        System.out.println(num);
    }
    static void betterApproach(int num){
        List<Integer> list=new ArrayList<>();
        // time complexity:- O(sqrt(n)
        for (int i = 1; i*i<=num; i++) {
            if(num%i==0){
                list.add(i);
                if((num/i)!=i){
                    list.add(num/i);
                }
            }
        }
        // O(n log n) ->  n is the number of factors
        // O(number of factors * log(number of factors))
        Collections.sort(list);
        // O(number of factors)
        for(int ele:list){
            System.out.println(ele);
        }
        // time complexity of overall code is
        // O(sqrt(N)) + O(n log(n) + O(n)
        // where , N is the input
        // n is the number of factors
    }
}