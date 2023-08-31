import java.math.BigInteger;

public class AddBinary {
    public static void main(String[] args) {
        /*
        Given two binary strings a and b, return their sum as a binary string.

        Example 1:
        Input: a = "11", b = "1"
        Output: "100"

        Example 2:
        Input: a = "1010", b = "1011"
        Output: "10101"

         */

        System.out.println(addBinary("1010","1011"));
    }

    public static String addBinary(String a, String b) {
        BigInteger decimalA = new BigInteger(a, 2); // Convert binary string to BigInteger
        BigInteger decimalB = new BigInteger(b, 2);

        BigInteger sum = decimalA.add(decimalB);

        return sum.toString(2); // Convert BigInteger sum back to binary string
    }

}
