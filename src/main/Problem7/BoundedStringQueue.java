package main.Problem7;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ahacker on 12/18/2016.
 */
public class BoundedStringQueue extends LinkedList<Character> {

    private int cap;

    public BoundedStringQueue(int size){
        super();
        this.cap = size;
    }

    @Override
    public boolean add(Character character) {
        super.add(character);
        if (this.size() > this.cap) {
            super.pop();
        }
        return true;
    }

    @Override
    public boolean offer(Character character) {
        if (this.size() < this.cap) {
            this.add(character);
        }
        return true;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (char c : this){
            sb.append(c);
        }
        return sb.toString();
    }
}
