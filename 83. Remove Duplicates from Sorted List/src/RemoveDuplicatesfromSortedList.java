
//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


class RemoveDuplicatesfromSortedList {
    public static void main(String[] array){

        /*
        Given the head of a sorted linked list, delete all duplicates
         such that each element appears only once. Return the linked list sorted as well.

            Example 1:
            Input: head = [1,1,2]
            Output: [1,2]

            Example 2:
            Input: head = [1,1,2,3,3]
            Output: [1,2,3]
         */
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode Current=head;

        while(Current!=null && Current.next!=null)
        {
            // if next node value is silmilar to current node
            // skip next node and update current.next
            if(Current.val==Current.next.val)
            {
                Current.next=Current.next.next;
            }
            else
            {
                Current=Current.next;
            }
        }
        return head;

    }
}
