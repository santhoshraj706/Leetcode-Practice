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
        int l=0;
        ListNode temp=head;
        if(head==null || head.next==null){
            return head;
        }
        while(temp!=null){
            l++;
            temp=temp.next;
        }
        for(int i=0;i<(k%l);i++){
            ListNode curr=head;
            while(curr.next!=null){
                if(curr.next.next!=null){
                    curr=curr.next;
                }else{
                    break;
                }
            }
            ListNode last=curr.next;
            curr.next=null;
            last.next=head;
            head=last;
        }
        return head;
    }
}