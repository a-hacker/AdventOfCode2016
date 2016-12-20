package main.Problem6;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Created by ahacker on 12/18/2016.
 */
public class CharCounter {

    private HashMap<Character, Integer> occurences;

    public CharCounter() {
        occurences = new HashMap<>(26);
    }

    public int getOccurences(char a){
        return occurences.get(a);
    }

    public char getMostCommon(){
        int highestVal = -1;
        char val = '@';
        for(Map.Entry<Character, Integer> entry : occurences.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            if (value > highestVal){
                val = key;
                highestVal = value;
            }
        }
        return val;
    }

    public char getLeastCommon(){
        int lowestVal = (int)Double.POSITIVE_INFINITY;
        char val = '@';
        for(Map.Entry<Character, Integer> entry : occurences.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            if (value < lowestVal){
                val = key;
                lowestVal = value;
            }
        }
        return val;
    }

    public void put(char c){
        if (occurences.containsKey(c)) {
            occurences.put(c, occurences.get(c) + 1);
        } else {
            occurences.put(c, 1);
        }
    }
}
