public class LeetCode125 {
    public static void main(String[] args){

        /*
        A phrase is a palindrome if, after converting all uppercase
        letters into lowercase letters and removing all
        non-alphanumeric characters, it reads the same forward
        and backward. Alphanumeric characters include letters and numbers.

//        Given a string s, return true if it is a palindrome, or false otherwise.

        Example 1:
        Input: s = "A man, a plan, a canal: Panama"
        Output: true
        Explanation: "amanaplanacanalpanama" is a palindrome.
        Example 2:
        Input: s = "race a car"
        Output: false
        Explanation: "raceacar" is not a palindrome.
        Example 3:
        Input: s = " "
        Output: true
        Explanation: s is an empty string "" after removing non-alphanumeric characters.
        Since an empty string reads the same forward and backward, it is a palindrome.
         */
        String s = "race a car";

        System.out.println(Solution.isPalindrome(s));
    }

    static class Solution{
       static public boolean isPalindrome(String s){

            boolean palindrome = false;
            StringBuilder temp = new StringBuilder();
            s = s.toLowerCase();
            for(int i=0; i<s.length(); i++){
                if((s.charAt(i) >96 && s.charAt(i) <123) || (s.charAt(i)>47 && s.charAt(i)<58)){
                    temp.append(s.charAt(i));
                }
            }
            if(temp.toString().isEmpty()) return true;

            if (temp.toString().contentEquals(temp.reverse())){
                palindrome = true;
            }
            return palindrome;
        }
    }

    //Solution 2:
    /*
    static public boolean isPalindrome(String s) {
    StringBuilder cleaned = new StringBuilder();
    s = s.toLowerCase();
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (Character.isLetterOrDigit(c)) {
            cleaned.append(c);
        }
    }

    String original = cleaned.toString();
    String reversed = cleaned.reverse().toString();

    return original.equals(reversed);
}

     */
}
