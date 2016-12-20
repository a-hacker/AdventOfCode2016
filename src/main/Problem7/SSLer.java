package main.Problem7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by ahacker on 12/18/2016.
 */
public class SSLer {

    private static final List<Character> specChars;

    static {
        specChars = Arrays.asList('[', ']');
    }

    public static boolean isTLS(String ip){
        BoundedStringQueue current = new BoundedStringQueue(3);
        HashSet<String> SSLStrings = new HashSet<>();
        ArrayList<String> ABAStrings = new ArrayList<>();
        boolean hypernet = false;
        for (char c : ip.toCharArray()) {
            if (specChars.contains(c)) {
                current.clear();
                hypernet = !hypernet;
                continue;
            }
            current.add(c);
            if (supportsABA(current.toString())) {
                if (hypernet) {
                    ABAStrings.add(current.toString());
                } else {
                    SSLStrings.add(current.toString());
                }
            }
        }
        for (String aba : ABAStrings){
            char[] babChars = {aba.charAt(1), aba.charAt(0),aba.charAt(1)};
            StringBuilder bab = new StringBuilder().append(babChars);
            if (SSLStrings.contains(bab.toString())){
                return true;
            }
        }
        return false;
    }

    public static boolean supportsABA(String input){
        StringBuilder sb = new StringBuilder(input);
        if (input.length() != 3){
            return false;
        } else if (input.charAt(0) == input.charAt(1)){
            return false;
        } else if (sb.reverse().toString().equals(input)) {
            return true;
        } else {
            return false;
        }
    }
}
