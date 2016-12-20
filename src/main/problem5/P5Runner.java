package main.problem5;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by ahacker on 12/17/2016.
 */
public class P5Runner {

    public static String validChars ="01234567";

    public static final HashMap<Integer, Character> password = new HashMap<Integer, Character>();

    public static void updateMap(Integer key, Character value){
        if (password.get(key) == 'y'){
            password.put(key, value);
        }
    }

    public static boolean isFull(){
        for (Integer key : password.keySet()) {
            if (password.get(key) == 'y') {
                return false;
            }
        }
        return true;
    }

    public static void instantiateMap(){
        for (char key : validChars.toCharArray()){
            password.put(Integer.parseInt(String.valueOf(key)), 'y');
        }
    }

    public static void main(String[] args){
        instantiateMap();
        Hasher hasher = new Hasher("ffykfhsq");
        while (!isFull()) {
            String hash = hasher.calcNextHash();
            if (validChars.contains(String.valueOf(hash.charAt(5)))) {
                updateMap(Integer.parseInt(String.valueOf(hash.charAt(5))), hash.charAt(6));
            }
        }
        StringBuilder sb = new StringBuilder();
        System.out.print(password.get(0));
        System.out.print(password.get(1));
        System.out.print(password.get(2));
        System.out.print(password.get(3));
        System.out.print(password.get(4));
        System.out.print(password.get(5));
        System.out.print(password.get(6));
        System.out.print(password.get(7));
    }
}
