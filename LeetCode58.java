public class LeetCode58 {
    public static void main(String[] args) {
        /*
        Given a string s consisting of words and spaces, return the length of the last word in the string.

            A word is a maximal
            substring
             consisting of non-space characters only.

            Example 1:
            Input: s = "Hello World"
            Output: 5
            Explanation: The last word is "World" with length 5.

            Example 2:
            Input: s = "   fly me   to   the moon  "
            Output: 4
            Explanation: The last word is "moon" with length 4.

            Example 3:
            Input: s = "luffy is still joyboy"
            Output: 6
            Explanation: The last word is "joyboy" with length 6.

         */

        String s = "   fly me   to   the moon  ";

        System.out.println(LengthOfLastWord.lengthOfLastWord(s));
    }

    static class LengthOfLastWord {


        public static int lengthOfLastWord(String s) {
            int length = 0;
            String temp = s.replaceAll("\\s+$", "");

            for(int i=temp.length()-1;i>=0;i-- ){
                if(temp.charAt(i)!= ' ') length+=1;
                else break;
            }

            return length;
        }
    }

}
