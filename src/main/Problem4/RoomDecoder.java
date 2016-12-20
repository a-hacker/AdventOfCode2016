package main.Problem4;

import java.util.Collection;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * Created by ahacker on 12/11/2016.
 */
public class RoomDecoder {

    private HashMap<Character,Letter> letters;
    private String code;

    public RoomDecoder(String code){
        HashMap<Character, Letter> letters = new HashMap<Character, Letter>();
        for (char i = 'a'; i <= 'z'; i++){
            letters.put(i, new Letter(i));
        }
        this.letters = letters;
        this.code = code;
    }

    public int decodeRoom(){
        String[] roomCode = code.split("-");
        String val = roomCode[roomCode.length - 1];
        for(int i = 0; i < roomCode.length - 1; i++){
            for(char letter : roomCode[i].toCharArray()){
                this.letters.get(letter).increment();
            }
        }
        PriorityQueue<Letter> orderedLetters = new PriorityQueue<Letter>(this.letters.values());
        StringBuilder topLetters = new StringBuilder();
        for(int i = 0; i < 5; i++){
            topLetters.append(orderedLetters.poll().getName());
        }
        String a = topLetters.toString();
        if (val.contains(topLetters.toString())){
            String b = val.substring(0, val.indexOf('['));
            return Integer.parseInt(b);
        } else {
            return 0;
        }
    }

    public String decypher(int cypher){
        String[] roomCode = code.split("-");
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < roomCode.length - 1; i++){
            for(char letter : roomCode[i].toCharArray()){
                builder.append((char)(((letter - 'a' + cypher) % ('z' - 'a' + 1)) + 'a'));
            }
            builder.append(' ');
        }
        builder.append(cypher);
        return builder.toString();
    }
}
