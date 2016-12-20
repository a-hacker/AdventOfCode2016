package test.Problem1;

import main.Problem1.Direction;
import main.Problem1.MoveLister;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by ahacker on 12/10/2016.
 */
public class TestMoveLister {

    private MoveLister testMoveLister = new MoveLister("L3 R6");

    @Test
    public void testMoveTranslatorNorthRight(){
        testMoveLister.currentDirection = Direction.North;
        int[] nextMove = testMoveLister.moveTranslater("R3");
        int[] expectedMove = {3, 0};
        Arrays.equals(expectedMove, nextMove);
    }

    @Test
    public void testMoveTranslatorNorthLeft(){
        testMoveLister.currentDirection = Direction.North;
        int[] nextMove = testMoveLister.moveTranslater("L3");
        int[] expectedMove = {-3, 0};
        Arrays.equals(expectedMove, nextMove);
    }

    @Test
    public void testMoveTranslatorEastRight(){
        testMoveLister.currentDirection = Direction.East;
        int[] nextMove = testMoveLister.moveTranslater("R3");
        int[] expectedMove = {0, -3};
        Arrays.equals(expectedMove, nextMove);
    }

    @Test
    public void testMoveTranslatorEastLeft(){
        testMoveLister.currentDirection = Direction.East;
        int[] nextMove = testMoveLister.moveTranslater("L3");
        int[] expectedMove = {0, 3};
        Arrays.equals(expectedMove, nextMove);
    }

    @Test
    public void testMoveTranslatorSouthRight(){
        testMoveLister.currentDirection = Direction.South;
        int[] nextMove = testMoveLister.moveTranslater("R3");
        int[] expectedMove = {-3, 0};
        Arrays.equals(expectedMove, nextMove);
    }

    @Test
    public void testMoveTranslatorSouthLeft(){
        testMoveLister.currentDirection = Direction.South;
        int[] nextMove = testMoveLister.moveTranslater("L3");
        int[] expectedMove = {3, 0};
        Arrays.equals(expectedMove, nextMove);
    }

    @Test
    public void testMoveTranslatorWestRight(){
        testMoveLister.currentDirection = Direction.West;
        int[] nextMove = testMoveLister.moveTranslater("R3");
        int[] expectedMove = {0, 3};
        Arrays.equals(expectedMove, nextMove);
    }

    @Test
    public void testMoveTranslatorWestLeft(){
        testMoveLister.currentDirection = Direction.West;
        int[] nextMove = testMoveLister.moveTranslater("L3");
        int[] expectedMove = {0, -3};
        Arrays.equals(expectedMove, nextMove);
    }

    @Test
    public void testChangeDirectionRight(){
        testMoveLister.currentDirection = Direction.North;
        testMoveLister.changeDirection("R");
        assert testMoveLister.currentDirection == Direction.East;
    }

    @Test
    public void testChangeDirectionLeft(){
        testMoveLister.currentDirection = Direction.North;
        testMoveLister.changeDirection("L");
        assert testMoveLister.currentDirection == Direction.West;
    }

    @Test
    public void testConsumeMoves(){
        testMoveLister.currentDirection = Direction.North;
        int[][] moves = testMoveLister.consumeMoveList("R10, L13");
        int[][] expectedMoves = new int[][] {{10, 0}, {0, 13}};
        assert Arrays.deepEquals(moves, expectedMoves);
    }
}
