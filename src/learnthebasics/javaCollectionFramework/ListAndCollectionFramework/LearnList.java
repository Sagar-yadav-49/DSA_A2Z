package learnthebasics.javaCollectionFramework.ListAndCollectionFramework;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class LearnList {
    public static void main(String[] args) {
        // ArrayList is dynamic in size
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(34);
        list.add(21);

        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.isEmpty());

        System.out.println(list.contains(34));

        //
        list.remove(1);
        System.out.println(list);

        //
        list.remove(Integer.valueOf(10));
        System.out.println(list);

        List<Integer> list2=new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);

        list.addAll(list2);
        System.out.println(list);

        list.removeAll(list2);
        System.out.println(list);

        System.out.println();


        // LinkedList
        List<Integer> newList=new LinkedList<>(); // internal working changed
    }
}