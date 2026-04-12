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
    public void reorderList(ListNode head) {
      Stack<Integer> st=new Stack<>();
      ListNode temp=head;
      ListNode prev=head;
      ListNode nxt=head;
      int n=0;
      while(temp!=null){
        temp=temp.next;
        n++;
      }temp =head;
        int mid=(n+1)/2;
      int [] arr=new int[mid];
      for(int i=0; i<mid; i++){
        arr[i]=temp.val;
        temp=temp.next;
      }
        while(temp!=null){
        st.push(temp.val);
        temp=temp.next;
      }
      temp=head;
      for(int j=0; j<n; j++){
        if(j%2==0){
             temp.val=arr[j/2];
             System.out.println(arr[j/2]);
            temp=temp.next;
        }else{
            temp.val=st.pop();
            temp=temp.next;
        }
      }
    }
}