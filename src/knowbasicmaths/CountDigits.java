package knowbasicmaths;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(countDigits2(num));
    }
    static int countDigits(int num){
        int count=0;
        if(num==0){
            return 1;
        }
        while(num>0){
            num/=10;
            count++;
        }
        return count;
    }
    static int countDigits2(int num){
        if(num==0) return 1;
        int cnt=(int) (Math.log10(num)+1);
        return cnt;
    }
}