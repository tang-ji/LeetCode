/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        Set<Integer> L = new HashSet<>();
        ListNode h = head;
        L.add(h.val);
        while(h.next != null) {
            if(L.contains(h.next.val)) {
                h.next = h.next.next;
                continue;
            }
            L.add(h.next.val);
            h = h.next;
        }
        return head;
    }
}