public class LeetCode28 {

    public static void main(String[] args){
        /*
        Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
        or -1 if needle is not part of haystack.

        Example 1:
        Input: haystack = "sadbutsad", needle = "sad"
        Output: 0
        Explanation: "sad" occurs at index 0 and 6.
        The first occurrence is at index 0, so we return 0.

        Example 2:
        Input: haystack = "leetcode", needle = "leeto"
        Output: -1
        Explanation: "leeto" did not occur in "leetcode", so we return -1.
         */


        String haystack = "sadbutsad";
        String needle = "sad";

        System.out.println(Find_the_Index_of_the_First_Occurrence_in_a_String.strStr(haystack,needle));

    }

    static class Find_the_Index_of_the_First_Occurrence_in_a_String {


        public static int strStr(String haystack, String needle) {

            int firstIndex = haystack.indexOf(needle);

            if(firstIndex>=0 & firstIndex<=haystack.length()) return firstIndex;
            else return -1;
        }
    }

}
