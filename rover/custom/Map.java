package rover.custom;

public class Map {
    public int[][] size;
    public Obstacle[] obstacles;
    public Rover rover;

    public Map(int size, Obstacle [] obstacles, Rover rover) {
        this.size = new int [size][size];
        this.obstacles = obstacles;
        this.rover = rover;
    }

    

}
