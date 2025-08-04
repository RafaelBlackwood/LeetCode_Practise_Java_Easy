public class LeetCode206 {
    public static void main(String[] args) {
        /*
        Given the head of a singly linked list, reverse the list,
        and return the reversed list.

        Example 1:
        Input: head = [1,2,3,4,5]
        Output: [5,4,3,2,1]
        Example 2:
        Input: head = [1,2]
        Output: [2,1]
        Example 3:
        Input: head = []
        Output: []
         */
        // Step 1: Build the list: 1 → 2 → 3 → 4 → 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution sol = new Solution();
        ListNode reversed = sol.reverseList(head);

        while (reversed != null) {
            System.out.print(reversed.val + " ");
            reversed = reversed.next;
        }

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode previous = null;
            ListNode current = head;

            while(current != null){
                ListNode nextStep = current.next;
                current.next = previous;
                previous = current;
                current = nextStep;
            }
            return previous;
        }
    }
}
