package main.Problem1;

/**
 * Created by ahacker on 12/10/2016.
 */
public class P1Runner {

    String moves;

    public P1Runner(String moves){
        this.moves = moves;
    }

    public static void main(String[] args){
        MoveLister moveLister = new MoveLister(args[0]);
        int[][] moves = moveLister.consumeMoveList(args[0]);
        MoveReplicator mover = new MoveReplicator(moves);
        mover.runIntersection();
        System.out.println(mover.getDistance());
    }
}
