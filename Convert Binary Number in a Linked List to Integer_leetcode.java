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
    public int getDecimalValue(ListNode head) {
        ListNode dummy=head;
        String str="";
        while(dummy!=null){
            str=str+dummy.val;
            dummy=dummy.next;
        }
        int ans=Integer.parseInt(str,2);
        return (ans);
    }
}
