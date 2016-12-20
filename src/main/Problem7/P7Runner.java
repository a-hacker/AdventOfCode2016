package main.Problem7;

import main.common.utils;

import java.io.IOException;

/**
 * Created by ahacker on 12/18/2016.
 */
public class P7Runner {

    public static void main(String[] args) throws IOException{
        String input = utils.parseFile(args[0]);
        String[] ips = input.split("\\n");
        int count = 0;
        for (String ip : ips) {
            if (SSLer.isTLS(ip)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
