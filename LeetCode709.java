public class LeetCode709 {
    public static void main(String[] args){
        //Given a string s, return the string after
        // replacing every uppercase letter with the same lowercase letter.
        //
        //Example 1:
        //
        //Input: s = "Hello"
        //Output: "hello"
        //Example 2:
        //
        //Input: s = "here"
        //Output: "here"
        //Example 3:
        //
        //Input: s = "LOVELY"
        //Output: "lovely"

        Solution s = new Solution();
        String str= "LOVEY";
        System.out.println(s.toLowerCase(str));
    }

    static class Solution{
        public String toLowerCase(String s) {

            //1
            //return s.toLowerCase();

            //2
            StringBuilder new_str = new StringBuilder();
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                    new_str.append((char)((int)s.charAt(i)+32));
                }
                else{
                    new_str.append(s.charAt(i));
                }
            }

            return new_str.toString();
        }
    }
}
