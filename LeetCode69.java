public class LeetCode69 {

    public static void main(String[] args) {

        /*
        Given a non-negative integer x, return the square root of x
        rounded down to the nearest integer. The returned integer should be non-negative as well.
        You must not use any built-in exponent function or operator.
        For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

        Example 1:
        Input: x = 4
        Output: 2
        Explanation: The square root of 4 is 2, so we return 2.

        Example 2:
        Input: x = 8
        Output: 2
        Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
         */

        Sqrt_x sqrt = new Sqrt_x();
        System.out.println(sqrt.mySqrt(25));
    }


    static class Sqrt_x {

        public  int mySqrt(int x) {
            long i = 0;
            long square = 0;

            while (square <= x) {
                i++;
                square = i * i;
            }

            return (int) (i - 1);
        }


    }

}
