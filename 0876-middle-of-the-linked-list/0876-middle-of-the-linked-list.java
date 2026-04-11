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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int n = 0;
        int k = 0;
        while (temp != null) {
            temp = temp.next;
            n++;
        }
        k = (n / 2) + 1;
        int i = 1;
        temp = head;
        while (i < k) {
            temp = temp.next;
            i++;
        }
        return temp;
    }
}