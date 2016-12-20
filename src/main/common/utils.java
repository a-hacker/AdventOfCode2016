package main.common;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by ahacker on 12/11/2016.
 */
public class utils {

    public static int[] parseIntList(String line, int len){
        String[] vals = line.split("\\s");
        int[] realVals = new int[len];
        int j = 0;
        for (int i = 0; i < vals.length; i++){
            if (!vals[i].equals("")){
                realVals[j] = Integer.parseInt(vals[i]);
                j++;
            }
        }
        return realVals;
    }

    public static String parseFile(String file) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            return sb.toString();
        } finally {
            br.close();
        }
    }
}
