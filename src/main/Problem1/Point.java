package main.Problem1;

/**
 * Created by ahacker on 12/10/2016.
 */
public class Point {
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(int[] coord){
        this.x = coord[0];
        this.y = coord[1];
    }
}
