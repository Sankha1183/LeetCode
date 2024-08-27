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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null){
            return null;
        }
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode prev=temp;
        for(int i=1;i<left;i++){
            prev=prev.next;
        }
        ListNode curr=prev.next;
        ListNode next=null;
        // ListNode tail=curr;
        for(int i=0;i<right-left;i++){
            next=curr.next;
            curr.next=next.next;
            next.next=prev.next;
            prev.next=next;

        }
        return temp.next;
    }
}