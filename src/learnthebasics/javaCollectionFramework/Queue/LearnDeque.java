package learnthebasics.javaCollectionFramework.Queue;

import java.util.ArrayDeque;

public class LearnDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        dq.offer(10);

        dq.offerLast(20);
        dq.offerFirst(30);
        dq.offerFirst(40);
        dq.offerFirst(50);
        System.out.println(dq);

        // remove element
        System.out.println(dq.poll());
        System.out.println(dq.pollLast());
        System.out.println(dq.pollFirst());
        System.out.println(dq);
        // viewing element
        System.out.println(dq.peek());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());


    }
}