package main.Problem1;

/**
 * Created by ahacker on 12/10/2016.
 */
public class MoveLister {

    public Direction currentDirection;

    public MoveLister(String moves){
        this.currentDirection = Direction.North;
    }

    public int[] moveTranslater(String move){
        int x;
        int y;
        switch (currentDirection) {
            case North:
                x = 1;
                y = 0;
                break;
            case East:
                x = 0;
                y = -1;
                break;
            case South:
                x = -1;
                y = 0;
                break;
            case West:
                x = 0;
                y = 1;
                break;
            default:
                x = 0;
                y = 0;
        }
        int mag = Integer.parseInt(move.substring(1));
        mag *= ((move.startsWith("R") ? 1 : -1));
        return new int[] {x * mag, y * mag};
    }

    public void changeDirection(String dirChange){
        if (dirChange.equals("R")){
            currentDirection = currentDirection.next();
        }
        else {
            currentDirection = currentDirection.previous();
        }
    }

    public int[][] consumeMoveList(String moves){
        String[] moveList = moves.split(",\\s");
        for (String move : moveList){

        }
        int[][] realMoves = new int[moveList.length][2];
        for(int i = 0; i < moveList.length; i++){
            realMoves[i] = moveTranslater(moveList[i]);
            changeDirection(moveList[i].substring(0, 1));
        }
        return realMoves;
    }
}
