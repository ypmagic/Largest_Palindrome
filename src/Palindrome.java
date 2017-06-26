/**
 * This class defines a palindrome.
 */
public class Palindrome {

    private int palin;

    public Palindrome (int number) {
        this.palin = number;
    }

    public boolean isPalindrome () {
        String s = "" + this.palin;
        if (s.length() == 6) {
            if (s.substring(0, 1).equals(s.substring(5, 6))) {
                if (s.substring(1, 2).equals(s.substring(4, 5))) {
                    if (s.substring(2, 3).equals(s.substring(3, 4))) {
                        return true;
                    }
                }
            }
        }
        else if (s.length() == 5) {
            if (s.substring(0, 1).equals(s.substring(4, 5))) {
                if (s.substring(1, 2).equals(s.substring(3, 4))) {
                    return true;
                }
            }
        }
        return false;
    }
}
