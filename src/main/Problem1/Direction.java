package main.Problem1;

/**
 * Created by ahacker on 12/10/2016.
 */
public enum Direction {
    North, East, South, West;

    private static Direction[] vals = values();
    public Direction next()
    {
        return vals[(this.ordinal()+1) % vals.length];
    }
    public Direction previous()
    {
        return vals[(this.ordinal() + vals.length - 1) % vals.length];
    }
}
