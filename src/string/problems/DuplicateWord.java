package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        String[] duplicateWord = st.split(" ");
        int length = st.length();
        Map<String, Integer> Map = new HashMap<>();
        for (String string : duplicateWord) {
            Integer num = Map.get(string);
            if (num == null) {
                num = 0;
            }
            Map.put(string, num + 1);

        }
        for (Map.Entry<String, Integer> duplicate : Map.entrySet()) {
            System.out.println("'" + duplicate.getKey() + "'" + ":" + duplicate.getValue() + "time(s)" + " :length" + duplicate.getKey().length());

        }

    }

}


