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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
       
      ListNode sum = new ListNode(-1);
        ListNode curr = sum;
        int val = 0;
        
      while(l1!=null || l2!=null || val!=0) {
            
          if(l1 != null) {
              
              val = val + l1.val;
              l1 = l1.next;
              
          }
          if(l2 != null) {
              
              val = val + l2.val;
              l2 = l2.next;
              
          }
          
          curr.next = new ListNode(val%10);
          curr = curr.next;
          val = val/10;
          
      }
       return sum.next; 
    }
}
