package main.Problem1;

import java.lang.IllegalArgumentException;

/**
 * Created by ahacker on 12/10/2016.
 */
public class MoveReplicator {

    public final int[] startPosition = {0, 0};
    private int[] previousPos;
    public int[] currentPosition;
    private int[][] moves;
    private Line[] movesTraversed;

    public MoveReplicator(int[][] moves){
        int[] currentPosition = {0, 0};
        this.currentPosition = currentPosition;
        this.moves = moves;
        this.movesTraversed = new Line[this.moves.length];
        this.previousPos = new int[] {0, 0};
    }

    public void makeMove(int[] move) throws IllegalArgumentException{
        if (move.length != 2){
            throw new IllegalArgumentException();
        } else {
            currentPosition[0] += move[0];
            currentPosition[1] += move[1];
        }
    }

    public Point makeMoveWithInterCheck(Line move){
        Point dest = null;
        for(Line traveled : this.movesTraversed){
            if (traveled == null){
                return null;
            }
            dest = traveled.checkIntersection(move);
            if (dest != null){
                return dest;
            }
        }
        return dest;
    }

    public void runIntersection(){
        this.currentPosition = new int[] {0, 0};
        for(int i = 0; i < this.moves.length; i++){
            Line move = null;
            this.previousPos[0] = this.currentPosition[0];
            this.previousPos[1] = this.currentPosition[1];
            makeMove(this.moves[i]);
            move = new Line(new Point(this.previousPos), new Point(this.currentPosition));

            Point dest = this.makeMoveWithInterCheck(move);
            if (dest != null){
                this.currentPosition = new int[] {dest.x, dest.y};
                return;
            }
            this.movesTraversed[i] = move;
        }
    }

    public void runMoves(){
        for(int[] move : this.moves){
            this.makeMove(move);
        }
    }

    public int getDistance(){
        return Math.abs(currentPosition[0]) + Math.abs(currentPosition[1]);
    }

}
