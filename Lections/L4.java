package JavaHomeWork.Lections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class L4 {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(123);
        list1.add(321);
        list1.add(456);
        System.out.println(list1);

        Queue<Integer> list2 = new LinkedList<Integer>();
        list2.add(432);
        list2.add(986);
        list2.add(456);
        System.out.println(list2);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(123);
        pq.add(967);
        pq.add(786);
        pq.add(12);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

        Deque<Integer> deque = new ArrayDeque<>();
        Deque<Integer> deque2 = new ArrayDeque<>();
        deque.addFirst(12);
        deque.add(45);
        deque.addFirst(999990);
        deque.addLast(88);
        System.out.println(deque);
        deque.removeFirst();
        deque.pollLast();
        System.out.println(deque.getLast());
        System.out.println(deque.peekFirst());

        
        String str = "1 2 3 + *";
        var it = str.split(" ");
        System.out.println(it);
        Stack<Integer> st = new Stack<Integer>();
        
        
    }

}
