import java.util.ArrayList;

public class LeetCode1290 {
    public static void main(String[] args) {

        /*
        Given head which is a reference node to a singly-linked list.
        The value of each node in the linked list is either 0 or 1.
        The linked list holds the binary representation of a number.

        Return the decimal value of the number in the linked list.
        The most significant bit is at the head of the linked list.

        Example 1:
        Input: head = [1,0,1]
        Output: 5
        Explanation: (101) in base 2 = (5) in base 10

        Example 2:
        Input: head = [0]
        Output: 0

         */


    }

  //Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static class Solution {
        public int getDecimalValue(ListNode head) {
            if(head == null) return 0;

            int decimal = 0;
            ArrayList<Integer> list = new ArrayList<>();

            for (ListNode cur = head; cur != null; cur = cur.next) {
                list.add(cur.val);
            }

            for(int i = 0; i < list.size(); i++)
            {
                decimal += (int) (list.get(i)*Math.pow(2,list.size()-i-1));
            }

            return decimal;
        }
    }
}
