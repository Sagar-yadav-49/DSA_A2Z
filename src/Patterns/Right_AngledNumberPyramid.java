package Patterns;

public class Right_AngledNumberPyramid {
    public static void main(String[] args) {
        pattern3();
    }
    static void pattern3(){
        for (int i = 1; i <= 5; i++) {
            int count=1;
            for (int j = 1; j <=i ; j++) {
                System.out.print(count+++" ");
            }
            System.out.println();
        }
    }
}