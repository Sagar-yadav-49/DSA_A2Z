package Patterns;

public class InvertedRightPyramid {
    public static void main(String[] args) {
        pattern5();
    }
    static void pattern5(){
        int count=5;
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=count ; j++) {
                System.out.print("*"+" ");
            }
            count--;
            System.out.println();
        }
    }
}