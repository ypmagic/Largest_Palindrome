/**
 * A product of xxx and xxx results in xxxxxx. The palindrome's range is from 100 to 999.
 */
public class LargestPalindrome {

    public static void main (String[] args) {
        System.out.println("Welcome to the Palindrome Calculator!");
        System.out.println("This calculator gets the largest palindrome for the product of 100 to 999");
        System.out.println();

        int largestPalin = 0;

        for (int i = 100; i < 1000; i++) {
            for (int k = 100; k < 1000; k++) {
                Palindrome p = new Palindrome (i*k);
                if (p.isPalindrome() && i*k > largestPalin) {
                    largestPalin = i*k;
                }
            }
        }

        System.out.println();
        System.out.println("Good news! I found the largest palindrome made from the product of two three-digit integers.");
        System.out.println("The largest palindrome is: " + largestPalin);
    }

}
