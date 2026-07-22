package Patterns;

public class Right_AngledNumberPyramid_II {
    public static void main(String[] args) {
        pattern4();
    }
    static void pattern4(){
        int count=1;
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(count+" ");
            }
            count++;
            System.out.println();
        }
    }
}