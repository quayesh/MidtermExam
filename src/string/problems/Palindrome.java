package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        System.out.println(isPalindrom("dad"));
    }


    public static boolean isPalindrom(String x) {
        if (x.length() <= 1) {
            return true;
        }
        if (x.charAt(0) == x.charAt(x.length() - 1)) {
            return isPalindrom(x.substring(1, x.length() - 1));
        } else {
            return false;
        }


    }
}