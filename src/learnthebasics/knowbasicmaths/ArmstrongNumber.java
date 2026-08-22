package knowbasicmaths;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(checkArmstrong(num));
    }
    static boolean checkArmstrong(int num){
        int count=0;
        int sum=0;
        int dup=num;
        int dup2=dup;
        while(num>0){
            num/=10;
            count++;
        }
        while(dup>0){
            int lastDigit=dup%10;
            sum=(int)(sum+Math.pow(lastDigit,count));
            dup/=10;
        }
        return sum==dup2;
    }
}