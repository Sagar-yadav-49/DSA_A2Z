package knowbasicmaths;

import java.util.*;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        checkPrime(num);
    }
    static void checkPrime(int num){
        int count=0;
        // Time Complexity :- O(sqrt(n)
        for (int i = 1; i*i <=num ; i++) {
            if(num%i==0){
                count++;
                if(num/i!=i){
                    count++;
                }
            }
        }
        if(count==2) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}