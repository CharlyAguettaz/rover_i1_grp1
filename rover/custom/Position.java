package rover.custom;

public class Position {

    public int x;
    public int y;
    public String cardinal;

    public Position(int x, int y, String cardinal) {
        this.x = x;
        this.y = y;
        this.cardinal = cardinal;
    }

    public String toString() {
        return "Rover position : x = " + this.x + ", y = " + this.y + "\nOrientation : " + this.cardinal;
    }
}