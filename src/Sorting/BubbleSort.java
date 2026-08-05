package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
        int first=0;
            for (int j = 1; j < arr.length; j++,first++) {
                if(first==arr.length){
                    break;
                }
                if(arr[first]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[first];
                    arr[first]=temp;
                }
            }
        }
    }
}