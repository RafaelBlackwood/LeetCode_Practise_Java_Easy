public class LeetCode172 {
    public static void main(String[] args) {

    }
    static class Solution {
        public int trailingZeroes(int n) {
            return n/3125+n/625+n/125+n/25+n/5;
        }
    }
}
