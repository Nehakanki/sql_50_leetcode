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
    public int countNode(ListNode head){
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

   
     public ListNode middleLL(int count,ListNode head){
        int middle = (count/2)+1;
        ListNode temp = head;
        for(int i=1;i<middle;i++){
        temp=temp.next;
       }
       return temp;
    }

    public ListNode middleNode(ListNode head) {
        
        int count = countNode(head);
       ListNode ans = middleLL(count,head);
       return ans;
    }
}