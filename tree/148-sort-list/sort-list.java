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
    public ListNode sortList(ListNode head) {
       if (head == null || head.next == null) return head;
        ListNode slow=head;
        ListNode fast=head.next;
        
        while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
        }
        ListNode mid=slow.next;
        slow.next=null;
        ListNode l1=sortList(head);
        ListNode l2=sortList(mid);

        return mergeList(l1,l2);
    }
    ListNode mergeList(ListNode l1,ListNode l2){
        if(l1==null)
        return l2;

        if(l2==null)
        return l1;

        ListNode res=new ListNode();
        if(l1.val<l2.val){
            res=l1;
            res.next=mergeList(l1.next,l2);
        }
        else{
             res=l2;
            res.next=mergeList(l1,l2.next);
        }
        return res;
    }
}