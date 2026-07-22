package Patterns;

public class InvertedNumberedRightPyramid {
    public static void main(String[] args) {
        pattern6();
    }
    static void pattern6(){
        int count1=5;
        for (int i = 1; i <=5 ; i++) {
            int count2=1;
            for (int j = 1; j <=count1 ; j++) {
                System.out.print(count2+++" ");
            }
            count1--;
            System.out.println();
        }
    }
}