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
    public boolean isPalindrome(ListNode head) {
        
        Stack<Integer> my_stack = new Stack<>();
         ListNode curr = head;
        
        while(curr != null) {
            my_stack.push(curr.val);
            curr = curr.next;
        }
        
        while(head != null) {
                
            int top = my_stack.pop();
            if(head.val == top) {
                head = head.next;
            }
            else {
                return false;
            }
            
        }
        
        return true;
    }
}
