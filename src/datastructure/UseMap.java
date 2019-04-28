package datastructure;


import java.util.*;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */
        List<String> city = new ArrayList<>();
        city.add("Dhaka");
        city.add("Sylhet");
        city.add("Comilla");
        city.add("Khulna");

        List<String> division = new ArrayList<>();
        division.add("Rajshahi");
        division.add("Chittagong");
        division.add("Rangpur");
        division.add("Faridpur");

        List<String> players = new LinkedList<>();
        players.add("Apu");
        players.add("Dipu");
        players.add("Ross");
        players.add("Siam");

        Map<String, List<String>> map = new HashMap<>();
        map.put("Mcity", city);
        map.put("DVSIN", division);
        map.put("playername", players);

        for (Map.Entry<String, List<String>> mp : map.entrySet()) {
            System.out.println(mp.getKey() + "------> " + mp.getValue());

        }

    }

}
