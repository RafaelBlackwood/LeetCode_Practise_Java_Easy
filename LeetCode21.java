public class LeetCode21 {


    public static void main(String[] args) {

    }

    //Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    class Solution {

        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            //Dummy Node: Create a dummy node to simplify the merge process.
            ListNode dummy = new ListNode(0);
            //Current Pointer: Initialize a pointer to build the merged list.
            ListNode current = dummy;

            ListNode p1 = list1;
            ListNode p2 = list2;

            while (p1 != null && p2 != null) {
                if (p1.val <= p2.val){ //Compare the values of the nodes pointed to by p1 and p2
                    current.next = p1;
                    p1 = p1.next; // Move the pointer in the list from which the node was taken
                }
                else {
                    current.next = p2;
                    p2 = p2.next; // Move the pointer in the list from which the node was taken
                }
                current = current.next;
            }

            if (p1 != null) {
                current.next = p1;
            }
            if (p2 != null) {
                current.next = p2;
            }
            return dummy.next;
        }
    }



/*
class Solution {

    public static void main(String[] args){

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {


        ListNode temp = new ListNode(-5);


        ListNode head = temp;


        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                head.next = list1;

                list1 = list1.next;
            } else {

                head.next = list2;

                list2 = list2.next;
            }

            head = head.next;
        }


        if (list1 != null) {
            head.next = list1;
        } else {
            head.next = list2;
        }


        return temp.next;
    }
}
 */


}
