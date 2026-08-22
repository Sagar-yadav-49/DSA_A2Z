package learnthebasics.javaCollectionFramework.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // add element
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);

        System.out.println(q);
        // remove element
        q.poll();
        System.out.println(q);

        System.out.println(q.peek());
        System.out.println();
        // ways of iterating in queue
//        while(!q.isEmpty()){ // till queue becomes empty, print the element and remove it
//            System.out.println(q.poll());
//        }
        System.out.println();
        //
        for (int ele : q) {
            System.out.println(ele);
        }
        // use of iterator
        Iterator<Integer> i = q.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}