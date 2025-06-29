public class LeetCode1528 {
    public static void main(String[] args) {

        //You are given a string s and an integer array indices of the same length.
        // The string s will be shuffled such that the character at the ith position
        // moves to indices[i] in the shuffled string.
        //
        //Return the shuffled string.
        //
        //
        //
        //Example 1:
        //
        //
        //Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
        //Output: "leetcode"
        //Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
        //Example 2:
        //
        //Input: s = "abc", indices = [0,1,2]
        //Output: "abc"
        //Explanation: After shuffling, each character remains in its position.

        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        Solution solution = new Solution();
        System.out.println(solution.restoreString(s,indices));
    }

    static class Solution{
        public String restoreString(String s, int[] indices){
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < indices.length; i++){
            for (int j = 0; j < indices.length; j++){
                if(i == indices[j]){
                    res.append(s.charAt(j));
            }
            }
        }
        return res.toString();


        //2
            /*
                   int length=s.length();
        StringBuilder sb=new StringBuilder("");
         char c[]=new char[length];

        for(int i=0;i<length;i++){

            c[indices[i]]=s.charAt(i);

        }
        sb.append(c);
        return sb.toString();
             */
        }
    }
}
