package main.Problem2;

/**
 * Created by ahacker on 12/11/2016.
 */
public class KeyDecoder {

    private String[] codes;
    private Keypad keypad;

    public KeyDecoder(String code){
        this.codes = code.split("\\n");
        this.keypad = new Keypad("");
    }

    public String decode() throws IllegalArgumentException{
        StringBuilder keyComb = new StringBuilder("");
        for(String code : this.codes){
            String[] moves = code.split("\\w");
            String currentPos = "";
            for(char move : code.toCharArray()){
                switch (move){
                    case 'U':
                        currentPos = this.keypad.getUp();
                        break;
                    case 'D':
                        currentPos = this.keypad.getDown();
                        break;
                    case 'L':
                        currentPos = this.keypad.getLeft();
                        break;
                    case 'R':
                        currentPos = this.keypad.getRight();
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown character " + move);
                }
            }
            keyComb.append(currentPos);
        }
        return keyComb.toString();
    }
}
