package main.Problem4;

import main.common.utils;

import java.io.IOException;

/**
 * Created by ahacker on 12/11/2016.
 */
public class P4Runner {

    public static int getTotalID(String file){
        String rooms = null;
        try {
            rooms = utils.parseFile(file);
        } catch (IOException e) {
            System.out.println("Bad file mate");
        }
        int result = 0;
        for (String room : rooms.split("\\n")){
            RoomDecoder roomer = new RoomDecoder(room);
            result += roomer.decodeRoom();
        }
        return result;
    }

    public static void getRoomNames(String file){
        String rooms = null;
        try {
            rooms = utils.parseFile(file);
        } catch (IOException e) {
            System.out.println("Bad file mate");
        }
        for (String room : rooms.split("\\n")){
            int result = 0;
            RoomDecoder roomer = new RoomDecoder(room);
            result = roomer.decodeRoom();
            if (result != 0){
                System.out.println(roomer.decypher(result));
            }
        }
    }

    public static void main(String[] args) {
        getRoomNames(args[0]);
    }
}
