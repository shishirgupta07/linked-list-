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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
     
        ListNode ln=new ListNode();
        ListNode lstn=ln;
        while(l1!=null && l2!=null)
        {
            if(l1.val>l2.val)
            {
                lstn.next=l2;
                lstn=lstn.next;
                l2=l2.next;
            }
            else
            {
                lstn.next=l1;
                lstn=lstn.next;
                l1=l1.next;
            }
        }
        while(l1!=null)
        {
            lstn.next=l1;
                lstn=lstn.next;
                l1=l1.next;
        }
        while(l2!=null)
        {
            lstn.next=l2;
                lstn=lstn.next;
                l2=l2.next;
        }
            
        return ln.next;
    }
}