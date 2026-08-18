package recursion;

public class UnderstandingRecursion {
    public static void main(String[] args) {
//        withoutConditionRecursion();
        withBaseCondition();
    }
    static void withoutConditionRecursion(){
        System.out.println(1);
        withoutConditionRecursion();
    }

    static int count=0;
    static void withBaseCondition(){
        if(count==4){
            return;
        }
        System.out.println(count);
        count++;
        withBaseCondition();
    }

}