package main.Problem7;

import java.util.Arrays;
import java.util.List;
import java.util.Queue;

/**
 * Created by ahacker on 12/18/2016.
 */
public class TLSer {

    private static final List<Character> specChars;

    static {
        specChars = Arrays.asList('[', ']');
    }

    public static boolean isTLS(String ip){
        BoundedStringQueue current = new BoundedStringQueue(4);
        boolean isTLS = false;
        boolean hypernet = false;
        for (char c : ip.toCharArray()) {
            if (specChars.contains(c)) {
                current.clear();
                hypernet = !hypernet;
                continue;
            }
            current.add(c);
            if (supportsABBA(current.toString())) {
                if (hypernet) {
                    return false;
                } else {
                    isTLS = true;
                }
            }
        }
        return isTLS;
    }

    public static boolean supportsABBA(String input){
        StringBuilder sb = new StringBuilder(input);
        if (input.length() != 4){
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
