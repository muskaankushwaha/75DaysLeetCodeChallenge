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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp= head;
       
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        
        int k=count-n;
        int i=1;
        if(count==1&&n==1)return null;
        if(k==0){
            head=head.next;
            temp.next=temp.next.next;
            
            return head;
        }
        
        while(temp!=null){
            if(i==k){
                break;
            }
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        return head;
    }
}