package main.Problem6;

import main.common.utils;

import java.io.IOException;

/**
 * Created by ahacker on 12/18/2016.
 */
public class P6Runner {

    public static void main(String[] args) throws IOException{
        String input = utils.parseFile(args[0]);
        LineCounter lc = new LineCounter(input);
        System.out.println(lc.run());
    }
}
