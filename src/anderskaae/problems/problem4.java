package anderskaae.problems;

/*
        A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
        Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class problem4 {

    public problem4() {

    }

    public int largestPalindrome() {
        int max = 999;
        int largestPalindromic = 0;
        for (int i = 0; i < max; i++) {

            for (int j = 500; j < max + 1; j++) {
                String current = Integer.toString(max * j);
                String currentReverse = new StringBuilder(current).reverse().toString();
                if (current.equals(currentReverse) && Integer.parseInt(current) > largestPalindromic) {
                    largestPalindromic = Integer.parseInt(current);
                }
            }
            max--;
        }

        return largestPalindromic;
    }

}
