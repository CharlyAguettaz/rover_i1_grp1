package rover.custom;

public class Rover {
    public Position initPos;
    public Position currentPos;

    public Rover(Position initPos, Position currentPos){
        this.initPos = initPos;
        this.currentPos = currentPos;
    }

    public String toString() {
        return "Initial positon : " + this.initPos.toString() + "\nCurrent position : " + this.currentPos.toString() ;
    }

}
