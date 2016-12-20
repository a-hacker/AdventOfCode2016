package main.Problem3;

import java.util.Arrays;

/**
 * Created by ahacker on 12/11/2016.
 */
public class Triangle {
    private int s1;
    private int s2;
    private int s3;

    public Triangle(int s1, int s2, int s3){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public Triangle(int[] sides){
        this.s1 = sides[0];
        this.s2 = sides[1];
        this.s3 = sides[2];
    }

    public boolean isTriangle(){
        return checkSides();
    }

    private boolean checkSides(){
        int[] sides = {s1, s2, s3};
        Arrays.sort(sides);
        return sides[2] < sides[0] + sides[1];
    }
}
