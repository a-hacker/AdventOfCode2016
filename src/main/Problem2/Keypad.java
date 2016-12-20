package main.Problem2;

/**
 * Created by ahacker on 12/11/2016.
 */
public class Keypad {

    private Button[] buttons;
    private Button currentButton;

    public Keypad(){
        Button[] buttons = new Button[9];
        for(int i = 1; i <= 9; i++) {
            buttons[i - 1] = new Button(Integer.toString(i));
        }
        this.buttons = buttons;
        setKeypad(buttons[0], 1, 4, 1, 2);
        setKeypad(buttons[1], 2, 5, 1, 3);
        setKeypad(buttons[2], 3, 6, 2, 3);
        setKeypad(buttons[3], 1, 7, 4, 5);
        setKeypad(buttons[4], 2, 8, 4, 6);
        setKeypad(buttons[5], 3, 9, 5, 6);
        setKeypad(buttons[6], 4, 7, 7, 8);
        setKeypad(buttons[7], 5, 8, 7, 9);
        setKeypad(buttons[8], 6, 9, 8, 9);
        this.currentButton = buttons[4];
    }

    public Keypad(String flag){
        Button[] buttons = new Button[13];
        for(int i = 1; i <= 9; i++) {
            buttons[i - 1] = new Button(Integer.toString(i));
        }
        buttons[9] = new Button("A");
        buttons[10] = new Button("B");
        buttons[11] = new Button("C");
        buttons[12] = new Button("D");
        this.buttons = buttons;
        setKeypad(buttons[0], 1, 3, 1, 1);
        setKeypad(buttons[1], 2, 6, 2, 3);
        setKeypad(buttons[2], 1, 7, 2, 4);
        setKeypad(buttons[3], 4, 8, 3, 4);
        setKeypad(buttons[4], 5, 5, 5, 6);
        setKeypad(buttons[5], 2, 10, 5, 7);
        setKeypad(buttons[6], 3, 11, 6, 8);
        setKeypad(buttons[7], 4, 12, 7, 9);
        setKeypad(buttons[8], 9, 9, 8, 9);
        setKeypad(buttons[9], 6, 10, 10, 11);
        setKeypad(buttons[10], 7, 13, 10, 12);
        setKeypad(buttons[11], 8, 12, 11, 12);
        setKeypad(buttons[12], 11, 13, 13, 13);
        this.currentButton = buttons[4];
    }


    private void setKeypad(Button button, int up, int down, int left, int right){
        button.setAdjacent(buttons[up-1], buttons[down-1], buttons[left-1], buttons[right-1]);
    }

    public String getUp(){
        currentButton = currentButton.up();
        return currentButton.getName();
    }

    public String getDown(){
        currentButton = currentButton.down();
        return currentButton.getName();
    }

    public String getLeft(){
        currentButton = currentButton.left();
        return currentButton.getName();
    }

    public String getRight(){
        currentButton = currentButton.right();
        return currentButton.getName();
    }
}
