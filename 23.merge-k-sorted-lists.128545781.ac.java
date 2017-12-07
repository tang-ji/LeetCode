import java.util.*;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null) return null;
        ListNode head = new ListNode(0);
        PriorityQueue<ListNode> P = new PriorityQueue<ListNode>(1, new Comparator<ListNode>(){
            public int compare(ListNode l1, ListNode l2){ return l1.val - l2.val;}
        });
        
        for(int i = 0; i < lists.length; i++) {
            if(lists[i] != null) P.offer(lists[i]);
        }
        ListNode tiny = head;
        while(!P.isEmpty()) {
            tiny.next = P.poll();
            tiny = tiny.next;
            if(tiny.next != null) P.offer(tiny.next);
        }
        
        return head.next;
    }
}