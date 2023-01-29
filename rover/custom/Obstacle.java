package rover.custom;

public class Obstacle {
    public int x;
    public int y;

    public Obstacle(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public String toString() {
        return "Obstacle position \nx = " + this.x + "\ny = " + this.y;
    }
}
