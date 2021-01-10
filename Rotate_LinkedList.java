/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        int count =1;
        
        while(fast.next != null) {
            count++;
            fast =  fast.next;
        }
        
        for(int i=1; i<count - k % count; i++) {
            slow = slow.next;
        }
        
        fast.next = head;
        head = slow.next;
        slow.next = null;
        return head;
        
        
    }
}
