import java.util.ArrayList;
import java.util.Arrays;

public class Longest_Common_Prefix {
    public static void main(String[] args){
        /*
        Write a function to find the longest common prefix string amongst an array of strings.
           If there is no common prefix, return an empty string "".

           Example 1:
           Input: strs = ["flower","flow","flight"]
           Output: "fl"

           Example 2:
           Input: strs = ["dog","racecar","car"]
           Output: ""
           Explanation: There is no common prefix among the input strings.
         */

        String[] strings =  {"flower","fanclub","flight"};


        String a= longestCommonPrefix(strings);

        System.out.println(a);


    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length==0) return "";

        Arrays.sort(strs);

        int count = 0;

        for(int j=0;j<strs[0].length();j++){
            if(strs[0].charAt(j)==strs[strs.length-1].charAt(j)){
             count+=1;
            }
            else{
                break;
            }
        }
        if(count == 0) return "";
        else return strs[0].substring(0,count);

    }

//Solution 1
/*
     public static String longestCommonPrefix(String[] strs) {

         ArrayList<Integer> indices = new ArrayList<>();
         boolean flag = false;

         if (strs.length==0) return "";

         else if(strs.length>1) {
             String shortestString = strs[0]; // Initialize with the first element

             for (int i = 1; i < strs.length; i++) {
                 if (strs[i].length() < shortestString.length()) {
                     shortestString = strs[i]; //finding the shortest string
                 }
             }

             for (int i = 0; i < shortestString.length(); i++) {
                 for (int j = 1; j < strs.length; j++) {
                     if (strs[0].charAt(i) == strs[j].charAt(i)) flag = true;
                     else {flag = false; break;}
                 }
                 if (flag) indices.add(i);
                 else break;
             }

             if (indices.size() != 0) return strs[0].substring(indices.get(0), indices.size());
             else return "";
         }
         else return strs[0];


    }

 */

//Solution 2
    /*
public static String longestCommonPrefix(String[] strs) {
    int count = 0;
    Arrays.sort(strs);
    String start = strs[0];
    String end = strs[strs.length - 1];

   for(int i = 0 ;i < start.length() && i < end.length();i++) {
       if (start.charAt(i) == end.charAt(i)) count++;
        else break;
    }

    return start.substring(0, count);
}
     */


//Solution 3
/*
     public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

 */

    //Explanation:
    /*
    Если массив strs пустой, функция немедленно возвращает пустую строку "".

    Если массив не пустой, код инициализирует prefix первым элементом массива.

    Затем цикл начинается со второго элемента массива и проверяет, начинается ли текущая строка (strs[i]) с текущего значения prefix.

    Если начало strs[i] не совпадает с prefix(indexOf возвращает индекс первого вхождение префикса в строку(а это начало слова, то есть 0), то есть
    Допустим у вас слово flower проверяется,является ли flow частью flower,т.к. не является мы сокращаем flower до flowe и потом снова
     до flow , т.к. теперь получились равные параметры мы в переменную
     префикс сохраняем flow-> берем следюущее слово flight и сравниваем с flow т.к. такого вхождения нет укорачиваем его flo и снова fl ->
     вхождение появилось и мы его сохранили в переменную prefix = fl)  , внутренний while цикл выполняется.

    Он постепенно сокращает prefix, убирая по одному символу с конца, пока strs[i] не станет префиксом этой укороченной версии prefix.

    Если в результате укорачивания prefix становится пустой строкой, это означает, что нет общего префикса для всех строк, и функция возвращает пустую строку.

    Если prefix остается непустой, цикл переходит к следующему элементу strs.

    После завершения внешнего цикла, prefix содержит наибольший общий префикс для всех строк.
     */
}
