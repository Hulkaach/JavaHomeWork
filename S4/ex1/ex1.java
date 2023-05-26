package JavaHomeWork.S4.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ex1 {
    /**
     * https://leetcode.com/problems/reverse-linked-list/
     * Сделать реверс List (1,2,3,4,5) -> (5,4,3,2,1)
     * 
     * @param args
     */
    public static void main(String[] args) {
    
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode x = null;
        ListNode current = head;
        while (current != null) {
            ListNode temp = current.next;
            current.next = x;
            x = current;
            current = temp;
        }
        return x;
    }

}
