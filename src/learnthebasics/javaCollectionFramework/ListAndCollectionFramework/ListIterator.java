package learnthebasics.javaCollectionFramework.ListAndCollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {
    public static void main(String[] args) {
        List<String> fruits =new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("kiwi");
        fruits.add("pineapple");
        // different ways to iterate over list
        //
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Fruit is: "+ fruits.get(i));
        }
        //
        for(String ele:fruits){
            System.out.println("Fruit is: "+ele);
        }
        // Iterator
        Iterator<String> fe= fruits.iterator();
        while(fe.hasNext()){
            System.out.println(fe.next());
        }

        // sublist() method
        List<String> subList=fruits.subList(1,3);
        System.out.println(subList);



    }
}

