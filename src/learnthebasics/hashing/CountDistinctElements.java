package learnthebasics.hashing;

import java.util.HashSet;

public class CountDistinctElements {
    public static void main(String[] args) {
        int[] arr={5,5,5,5};
        System.out.println(countElement(arr));
    }
    static int countElement(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int ele:arr){
            set.add(ele);
        }
        return set.size();
    }
}