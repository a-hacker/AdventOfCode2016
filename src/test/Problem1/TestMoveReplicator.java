package test.Problem1;

import main.Problem1.MoveLister;
import main.Problem1.MoveReplicator;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by ahacker on 12/10/2016.
 */
public class TestMoveReplicator {

    private MoveReplicator testMoveRep = new MoveReplicator(new int[][] {{0, 3}, {-18, 0}});

    @Test
    public void testMakeMove(){
        testMoveRep.currentPosition = new int[] {0, 0};
        int[] move = {15, 0};
        testMoveRep.makeMove(move);
        assert Arrays.equals(testMoveRep.currentPosition, move);
    }

    @Test
    public void testMakeMoveNeg(){
        testMoveRep.currentPosition = new int[] {0, 0};
        int[] move = {-15, 0};
        testMoveRep.makeMove(move);
        assert Arrays.equals(testMoveRep.currentPosition, move);
    }
}
