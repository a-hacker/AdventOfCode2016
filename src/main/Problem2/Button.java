package main.Problem2;

/**
 * Created by ahacker on 12/11/2016.
 */
public class Button {

    private String name;
    private Button up;
    private Button down;
    private Button left;
    private Button right;

    public Button(String name){
        this.name = name;
    }

    public Button up(){
        return up;
    }

    public Button down(){
        return down;
    }

    public Button left(){
        return left;
    }

    public Button right(){
        return right;
    }

    public void setAdjacent(Button up, Button down, Button left, Button right){
        this.up = up;
        this.down = down;
        this.left = left;
        this.right = right;
    }

    public String getName(){
        return this.name;
    }
}
