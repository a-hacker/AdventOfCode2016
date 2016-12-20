package main.Problem1;

/**
 * Created by ahacker on 12/10/2016.
 */
public class Line {
    Point start;
    Point end;
    Direction direction;

    public Line(Point start, Point end){
        this.start = start;
        this.end = end;
        calcDirection();
    }

    private void calcDirection(){
        if (start.x < end.x){
            direction = Direction.East;
        }
        else if (start.x > end.x){
            direction = Direction.West;
        }
        else if (start.y < end.y){
            direction = Direction.North;
        }
        else {
            direction = Direction.South;
        }
    }

    //check if other intersects this line
    public Point checkIntersection(Line other){
        if (this.direction == Direction.North && other.direction == Direction.North){
            if (other.end.y >= this.start.y && other.start.x == this.start.x){
                if (other.start.y > this.end.y) {
                    return null;
                }
                return this.start;
            }
            else if (other.start.y < this.end.y  && other.start.x == this.start.x) {
                if (other.end.y < this.start.y) {
                    return null;
                }
                return other.start;
            } else {
                return null;
            }
        } else if (this.direction == Direction.South && other.direction == Direction.South){
            if (other.end.y <= this.start.y  && other.start.x == this.start.x){
                if (other.start.y < this.end.y) {
                    return null;
                }
                return this.start;
            }
            else if (other.start.y > this.end.y  && other.start.x == this.start.x) {
                if (other.end.y < this.start.y) {
                    return null;
                }
                return other.start;
            } else {
                return null;
            }
        } else if (this.direction == Direction.East && other.direction == Direction.East){
            if (other.end.x >= this.start.x  && other.start.y == this.start.y){
                if (other.start.x > this.end.x) {
                    return null;
                }
                return this.start;
            }
            else if (other.start.x < this.end.x && other.start.y == this.start.y) {
                if (other.end.x < this.start.x) {
                    return null;
                }
                return other.start;
            } else {
                return null;
            }
        } else if (this.direction == Direction.West && other.direction == Direction.West){
            if (other.end.x <= this.start.x && other.start.y == this.start.y){
                if (other.start.x < this.end.x) {
                    return null;
                }
                return this.start;
            }
            else if (other.start.x > this.end.x && other.start.y == this.start.y) {
                if (other.end.x > this.start.x) {
                    return null;
                }
                return other.start;
            } else {
                return null;
            }
        } else if (this.direction == Direction.North && other.direction == Direction.South){
            if (other.end.y <= this.end.y && other.start.x == this.start.x){
                if (other.start.y <= this.end.y){
                    if (other.start.y < this.start.y){
                        return null;
                    }
                    return other.start;
                }
                return this.end;
            } else {
                return null;
            }
        } else if (this.direction == Direction.South && other.direction == Direction.North){
            if (other.end.x >= this.end.x && other.start.y == this.start.y){
                if (other.start.x >= this.end.x){
                    if (other.end.y > this.end.y){
                        return null;
                    }
                    return other.start;
                }
                return this.end;
            } else {
                return null;
            }
        } else if (this.direction == Direction.East && other.direction == Direction.West){
            if (other.end.x <= this.end.x && other.start.y == this.start.y){
                if (other.start.x <= this.end.x){
                    if (other.start.x < this.start.x){
                        return null;
                    }
                    return other.start;
                }
                return this.end;
            } else {
                return null;
            }
        } else if (this.direction == Direction.West && other.direction == Direction.East){
            if (other.end.x >= this.end.x && other.start.y == this.start.y){
                if (other.start.x >= this.end.x){
                    if (other.end.x > this.end.x){
                        return null;
                    }
                    return other.start;
                }
                return this.end;
            } else {
                return null;
            }
        } else if (this.direction == Direction.North){
            if (this.start.y < other.start.y && other.start.y < this.end.y){
                if (other.start.x < this.start.x && this.start.x < other.end.x){
                    return new Point(this.start.x, other.start.y);
                }
                if (other.end.x < this.start.x && this.start.x < other.start.x){
                    return new Point(this.start.x, other.start.y);
                }
            } else {
                return null;
            }
        } else if (this.direction == Direction.South){
            if (this.end.y < other.start.y && other.start.y < this.start.y){
                if (other.start.x < this.start.x && this.start.x < other.end.x){
                    return new Point(this.start.x, other.start.y);
                }
                if (other.end.x < this.start.x && this.start.x < other.start.x){
                    return new Point(this.start.x, other.start.y);
                }
            } else {
                return null;
            }
        } else if (this.direction == Direction.East){
            if (this.start.x < other.start.x && other.start.x < this.end.x){
                if (other.start.y < this.start.y && this.start.y < other.end.y){
                    return new Point(other.start.x, this.start.y);
                }
                if (other.end.y < this.start.y && this.start.y < other.start.y){
                    return new Point(other.start.x, this.start.y);
                }
            } else {
                return null;
            }
        } else if (this.direction == Direction.West){
            if (this.end.x < other.start.x && other.start.x < this.start.x){
                if (other.start.y < this.start.y && this.start.y < other.end.y){
                    return new Point(other.start.x, this.start.y);
                }
                if (other.end.y < this.start.y && this.start.y < other.start.y){
                    return new Point(other.start.x, this.start.y);
                }
            } else {
                return null;
            }
        }
        return null;
    }
}
