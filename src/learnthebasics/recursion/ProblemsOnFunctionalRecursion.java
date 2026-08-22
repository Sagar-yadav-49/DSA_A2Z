package learnthebasics.recursion;

import java.util.Arrays;

public class ProblemsOnFunctionalRecursion {
    public static void main(String[] args) {
        int[] arr={14,5,1,3,6,7};
//        reverseTwoP(0, arr.length-1, arr);
        reverseOneP(0,arr);
        System.out.println(Arrays.toString(arr));
    }
    // Reverse an array

    // Recursion using two pointers
    static void reverseTwoP(int start, int end ,int[] arr){
        if(start>=end) return;
        // swapping // or we can make a swap function and call it down here
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverseTwoP(start+1,end-1,arr);
    }
    // Recursion using one pointer
    static void reverseOneP(int start, int[] arr){
        if(start>=(arr.length/2)) return;
        int temp=arr[start];
        arr[start]=arr[arr.length-start-1];
        arr[arr.length-start-1]=temp;
        reverseOneP(start+1,arr);
    }
}