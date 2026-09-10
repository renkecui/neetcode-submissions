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
        // dummy node to have a starting node
        ListNode dummy = new ListNode(0);
        // pointer node
        // starts off at the initial starting node
        ListNode pointer = dummy;

        while (list1 != null && list2 != null) {
            // compare the node val from the 2 lists
            if (list1.val < list2.val) {
                // the next item
                pointer.next = list1;
                list1 = list1.next;
            } else {
                // assign this item to the next item in the list
                pointer.next = list2;
                list2 = list2.next;
            }
            // iterate the pointer
            pointer = pointer.next;
        }
        // edge case
        // assign the rest of the list to the end of the pointer
        if (list1 != null) {
            pointer.next = list1;
        } else {
            pointer.next = list2;
        }

        // we don't want to return the first node of dummy
        // we want to return the second one
        return dummy.next;
    }
}