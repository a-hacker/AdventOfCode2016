package main.Problem4;

/**
 * Created by ahacker on 12/11/2016.
 */
public class Letter implements Comparable<Letter>{

    private char name;
    private int occurences;

    public Letter(char name){
        this.name = name;
        this.occurences = 0;
    }

    public int getOccurences(){
        return this.occurences;
    }

    public char getName(){
        return this.name;
    }

    public void increment(){
        this.occurences++;
    }

    public int compareTo(Letter other){
        if (this.getOccurences() != other.getOccurences()){
            return Integer.compare(other.getOccurences(), this.getOccurences());
        }
        else{
            return Character.compare(this.getName(), other.getName());
        }
    }

}
