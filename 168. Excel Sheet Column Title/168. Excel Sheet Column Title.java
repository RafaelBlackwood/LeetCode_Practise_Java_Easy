package ViewModel;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 168. Excel Sheet Column Title
        /*The task:
            Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
                For example:
                    A -> 1
                    B -> 2
                    C -> 3
                    Z -> 26
                    AA -> 27
                    AB -> 28
                ...

                Example 1:
                    Input: columnNumber = 1
                    Output: "A"
                    Example 2:
                    Input: columnNumber = 28
                    Output: "AB"
                    Example 3:
                    Input: columnNumber = 701
                    Output: "ZY"
         */



        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number that is greater than 0: ");
        int columnNumber = input.nextInt();

        StringBuilder line = new StringBuilder();


        System.out.println(ExcellSheet(columnNumber,line));
    }
    static String ExcellSheet(int columnNumber,StringBuilder line){
        while(columnNumber>0){
            columnNumber--;

            line.append((char)(columnNumber%26+65));
            columnNumber = columnNumber/26;
        }

        return line.reverse().toString();

    }
}
