package string.problems;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {


        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String str1 = "restful";
        String str2 = "fluster";
        String str3 = "customer";
        String str4 = "storescum";
        if (isAnagram(str1, str2) == true) {
            System.out.println(str1 + " is an Anagram word !!!!");
        } else {
            System.out.println(str1 + "is not an Anagram word");

        }
        if (isAnagram(str3, str4) == true) {
            System.out.println(str3 + "ia an Anagram word!!!");

        } else {
            System.out.println(str3 + "is not an Anagram word");
        }
    }

    public static boolean isAnagram(String first, String second) {
        char[] charArray = first.toCharArray();
        char[] charArray2 = second.toCharArray();
        Arrays.sort(charArray);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray, charArray2);
    }


}

