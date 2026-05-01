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
    public ListNode deleteMiddle(ListNode head) {
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        if(n==1)return null;
        temp=head;
        int i=0;
        int mid=n/2;
        while(i!=mid-1){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        return head;
    }
}