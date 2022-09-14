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
        ListNode dummy=head;
        int count=1;
        while(dummy!=null){
            count++;
            dummy=dummy.next;
        }
        ListNode ans=null;
        if(count%2==0){
            for(int i=1;i<(count/2)+1;i++){
                ans=head;
                head=head.next;
            }
        }
        else{
            for(int i=1;i<=(count/2)+1;i++){
                ans=head;
                head=head.next;
            }   
        }
        return (ans);
    }
}
