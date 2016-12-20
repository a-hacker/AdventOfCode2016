package main.Problem3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import main.common.utils;

/**
 * Created by ahacker on 12/11/2016.
 */
public class P3Runner {

    public static String[] collectTriangles(String input){
        String[] lines = input.split("\\n");
        String[] realLines = new String[lines.length];
        int i = 0;
        while (i < lines.length){
            int[][] thing = new int[3][3];
            for (int j = 0; j < 3; j++){
                thing[j] = utils.parseIntList(lines[i+j], 3);
            }
            thing = transposeMatrix(thing);
            for(int j = 0; j < 3; j++){
                realLines[i] = thing[j][0] + " " + thing[j][1] + " " + thing[j][2];
                i++;
            }
        }
        return realLines;
    }

    public static int[][] transposeMatrix(int[][] m){
        int[][] temp = new int[m[0].length][m.length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                temp[j][i] = m[i][j];
        return temp;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
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
        String[] realLines = collectTriangles(originalCode);
        TriangeCounter counter = new TriangeCounter(realLines);
        System.out.println(counter.countTriangles());
    }
}
