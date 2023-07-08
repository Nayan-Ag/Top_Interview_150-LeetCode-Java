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
        if(head==null) return null;
        ListNode curr = head;
        int siz = size(head);
        k = k%siz;
        for(int i=0;i<(siz-k-1) ;i++ ){
            if(curr == null) return head;
            curr = curr.next;
        }
            
        ListNode temp = curr;
        while(curr.next!=null) curr = curr.next;
        curr.next = head;
        head = temp.next;
        temp.next = null;
        return head;
    }
    int size(ListNode head){
        int count = 0;
        while(head!=null){
            head = head.next;
            count++;
        }
        return count;
    }
}