package Patterns;

public class RectangularStarPattern {
    public static void main(String[] args) {
        pattern1();
    }
    static void pattern1(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}