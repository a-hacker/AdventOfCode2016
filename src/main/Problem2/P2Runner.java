package main.Problem2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by ahacker on 12/11/2016.
 */
public class P2Runner {



    public static void main(String[] args) throws FileNotFoundException, IOException{
        String file = args[0];
        String originalCode = null;
        BufferedReader br = new BufferedReader(new FileReader(file));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            originalCode = sb.toString();
        } finally {
            br.close();
        }
        KeyDecoder letsDoThis = new KeyDecoder(originalCode);
        String finalCode = letsDoThis.decode();
        System.out.println(finalCode);
    }
}
