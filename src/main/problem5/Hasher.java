package main.problem5;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by ahacker on 12/17/2016.
 */
public class Hasher {

    private final String input;
    public int counter;

    public Hasher(String input){
        this.input = input;
        this.counter = 0;
    }

    public boolean testHash(String hash){
        return hash.startsWith("00000");
    }

    public String nextHash(){
        String val = String.format("%s%d", this.input, this.counter++);
        try {
            byte[] bytesOfMessage = val.getBytes("UTF-8");
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] bytes = md.digest(bytesOfMessage);
            return MD5BytesToString(bytes);
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e){
            System.out.println("Oh God What is happening!");
        }
        return null;
    }

    public String MD5BytesToString(byte[] bytes){
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02X", b));
        }
        return sb.toString();
    }

    public String calcNextHash(){
        String possibleHash = nextHash();
        while (!testHash(possibleHash)){
            possibleHash = nextHash();
        }
        return possibleHash;
    }
}
