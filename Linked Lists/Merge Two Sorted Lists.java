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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null || list2 == null){
            if(list1 != null){
                return list1;
            }
            else {
                return list2;
            }
        }
        
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        ListNode a = list1;
        ListNode b = list2;
        while(a != null && b != null){
            if(a.val > b.val){
                prev.next = b;
                b = b.next;
            }
            else {
                prev.next = a;
                a = a.next;
            }
            prev = prev.next;
        }
        
        if(a != null){
            prev.next = a;
        }
        if(b != null){
            prev.next = b;
        }
        return dummy.next;
    }
}