package javaCollectionFramework.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq=new PriorityQueue<>(); // priority queue uses min heap , means it will remove lowest element first and
        // In case of Integer, by-default , lowest element has the highest priority
        //
        // change the priority, max heap, If b - a is positive, it means b is bigger than a, so b gets higher priority and moves to the top
//        Queue<Integer> pq=new PriorityQueue<>((a,b)->b-a); // uses a comparator in the parameter
        // This line of Java code creates a max-priority queue (a max-heap) where the largest integer always stays at the top (pq.peek()) and gets removed first (pq.poll()).
        //
        pq.offer(30);
        pq.offer(40);
        pq.offer(10);
        pq.offer(20);
        System.out.println(pq);
        // so when we try to remove element, firstly lowest element will be removed
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());


    }
}