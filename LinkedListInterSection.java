// https://leetcode.com/problems/intersection-of-two-linked-lists/description/

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
        if(headA==null || headB==null) return null;
        int lenA = length(headA);
        int lenB = length(headB);
        if(lenA>lenB){
            for(int i = 0;i<lenA-lenB;i++){
                headA = headA.next;
            }
        }else if(lenB>lenA){
            for(int i = 0;i<lenB-lenA;i++){
                headB = headB.next;
            }
        }
        while(headA!=null && headB!=null && headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
    
    private int length(ListNode head){
        int len=0;
        while(head!=null){
            len+=1;
            head=head.next;
        }
        return len;
    }
}
