/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lA = length(headA), lB = length(headB);
        while(lA > lB) {
            headA = headA.next;
            lA--;
        }
        while(lB > lA) {
            headB = headB.next;
            lB--;
        }
        while(headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
    
    protected int length(ListNode head) {
        int i = 0;
        ListNode tiny = head;
        while(tiny != null) {
            tiny = tiny.next;
            i++;
        }
        return i;
    }
}