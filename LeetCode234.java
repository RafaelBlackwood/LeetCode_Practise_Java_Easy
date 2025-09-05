import java.util.ArrayList;
import java.util.Objects;

public class LeetCode234 {
    public static void main(String[] args) {
        /*
        Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
        Example 1:
        Input: head = [1,2,2,1]
        Output: true
        Example 2:
        Input: head = [1,2]
        Output: false
         */
    }


     //Definition for singly-linked list.
     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

     static class Solution {
        public boolean isPalindrome(ListNode head) {
            ArrayList<Integer> list = new ArrayList<>();
            ListNode current = head;

            while (current != null) {
                list.add(current.val);
                current = current.next;
            }

            int start = 0;
            int end = list.size() - 1;
            boolean flag = true;
            while (start < end) {
                if(Objects.equals(list.get(start), list.get(end))) {
                    start++;
                    end --;
                }
                else return false;
            }

            return flag;
        }
    }
}
