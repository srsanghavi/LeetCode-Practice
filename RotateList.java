// https://leetcode.com/problems/rotate-list/description/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)return head;
        if(k == 0) return head;
        
        Boolean flag=false;  // True if list rotated
        ListNode temp = head, tail = null,tailPrev = null;
        
        // Find the length of the list
        int len=0;  
        while(temp.next!=null){
            len+=1;
            temp=temp.next;
        }
        len = len + 1;
        
        // Make the list a cicular list
        temp.next=head;
        
        // Avoid unnecessary rotations
        while(k>=len){
            k-=len;
        }
        
        // rotate the list
        while(len>k){
            flag = true;
            k+=1;
            tail = head;
            head=head.next;
        }
        if(flag) tail.next = null; // convert the list to a singly linked list
        
        return head;
    }
}