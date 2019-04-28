package string.problems;

import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

        Anagram.isAnagram("CAT", "ACT");
        Assert.assertEquals("CAT", "");

        boolean pa = Palindrome.isPalindrom("MOM");
        Assert.assertEquals(true, pa);

        Permutation.permutation("", "ABC");


    }
}
