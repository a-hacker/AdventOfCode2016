package test.Problem1;

import junit.framework.*;

import main.Problem1.Direction;
import org.junit.*;

/**
 * Created by ahacker on 12/10/2016.
 */
public class TestDirection {

    @org.junit.Test
    public void testNext(){
        Direction dir = Direction.East;
        dir = dir.next();
        assert dir == Direction.South;
        dir = dir.next();
        assert dir == Direction.West;
        dir = dir.next();
        assert dir == Direction.North;
        dir = dir.next();
        assert dir == Direction.East;
    }

    @org.junit.Test
    public void testPrev(){
        Direction dir = Direction.East;
        dir = dir.previous();
        assert dir == Direction.North;
        dir = dir.previous();
        assert dir == Direction.West;
        dir = dir.previous();
        assert dir == Direction.South;
        dir = dir.previous();
        assert dir == Direction.East;
    }
}
