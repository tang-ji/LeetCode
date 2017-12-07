/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int num(ListNode l) {
            while (l.next != null) {
                return num(l.next) + 1;
            }
            return 1;
        }
        
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int n;
        int n1 = num(l1);
        int n2 = num(l2);
        if (n1 <= n2) n = n2;
        else n = n1;
        n += 1;
        int[] Num = new int[n];
        
        for (int i = 0; i < n1; i++) {
            Num[i] = l1.val;
            l1 = l1.next;
        }
        
        for (int i = 0; i < n2; i++) {
            Num[i] += l2.val;
            l2 = l2.next;
        }
        
        for (int i = 0; i < n - 1; i++) {
            Num[i + 1] += Num[i] / 10;
            Num[i] = Num[i] % 10;
        }
        
        if (Num[n - 1] == 0 && n != 1) n -= 1;
        ListNode[] L = new ListNode[n];
        L[0] = new ListNode(Num[n - 1]);
        L[0].next = null;
        for (int i = 1; i < n; i++) {
            L[i] = new ListNode(Num[n - 1 - i]);
            L[i].next = L[i - 1];
        }
        return L[n - 1];
    }
}