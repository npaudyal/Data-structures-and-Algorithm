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
    public ListNode partition(ListNode head, int x) {
        
        ListNode small = new ListNode(-1);
        ListNode large = new ListNode(-1);
        
        small.next = head;
        
        ListNode scanner = small;
        ListNode tail = large;
        
        while(scanner.next != null ){
            
            if(scanner.next.val >= x) {
                
                tail.next = scanner.next;
                scanner.next = scanner.next.next;
                tail = tail.next;
                tail.next = null;
            } else {
                
                scanner= scanner.next;
            }
        }
        
        scanner.next = large.next;
        return small.next;
        
    }
}
