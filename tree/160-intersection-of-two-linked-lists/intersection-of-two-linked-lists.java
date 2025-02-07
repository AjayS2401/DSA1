/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA==null || headB==null)
        return null;

        int l1=getLength(headA);
        int l2=getLength(headB);

        while(l1>l2){
            headA=headA.next;
            l1--;
        }
        while(l2>l1){
            headB=headB.next;
            l2--;
        }

       while(headA!=headB){
        headA=headA.next;
        headB=headB.next;
       }

        return headA;
    }
    int getLength(ListNode head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
}