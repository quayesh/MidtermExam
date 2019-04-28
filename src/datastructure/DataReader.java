package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Set;

public class DataReader {

    public static void main(String[] args)throws FileNotFoundException {
        /*
         * User API to read the below textFile and print to console.
         * Use BufferedReader class.
         * Use try....catch block to handle Exception.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
         * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
         * order from LinkedList and retrieve as FILO order from Stack.
         *
         * Demonstrate how to use Stack that includes push,peek,search,pop elements.
         * Use For Each loop/while loop/Iterator to retrieve data.
         */

        String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
        FileReader fr = null;
        BufferedReader br = null;
        String string = "";
        String data = "";
        try {
            fr = new FileReader(textFile);
            br = new BufferedReader(fr);
            while ((string = br.readLine()) != null) {
                data = data + string;
                System.out.println(string.trim());
            }
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                fr = null;
            }
            if (br != null) {
                br = null;
            }
        }
        String[] arrayOfselfDriving = data.split(" ");
        System.out.println(arrayOfselfDriving.length);
        Set<String> unique = (Set<String>) new HashMap<Object, Object>();
        for (String arrayOfDriving : arrayOfselfDriving) {
            if (unique.add(arrayOfDriving) == false) {
                System.out.println(arrayOfDriving + "---->has duplicate word in tech next");
            }
        }
        for (int i = 0; i < arrayOfselfDriving.length; i++) {
            for (int j = i + 1; j < arrayOfselfDriving.length; j++) {
                if (arrayOfselfDriving[i].equals(arrayOfselfDriving[j])) {
                    System.out.println(arrayOfselfDriving[i] + "----->has Duplicate word in the self driving-car-text");
                }
            }


        }


    }

}
