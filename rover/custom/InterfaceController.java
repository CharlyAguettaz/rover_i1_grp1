package rover.custom;

import java.util.Arrays;

public class InterfaceController {

    public Map map;
    private String[] cardinals = {"North", "East", "South", "West"};

    public InterfaceController(Map map) {
        this.map = map;
    }

    private boolean isOnAbscissa() {
        if (this.getCardinalIndex() % 2 > 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean willBeOutMap(int newIndex) {
        Boolean out = newIndex > this.map.size.length || newIndex < 0;
        
        if (out) {
            System.out.println("Le rovers sort de la map");
        }

        return out;
    }

    private boolean willToucheObstacle(int newX, int newY) {
        boolean touched = false;

        for (Obstacle obstacle : this.map.obstacles ) {
            if (obstacle.x == newX && obstacle.y == newY) {
                touched = true;
                System.out.println("Il y'a un obstacle : " + obstacle.toString());
                break;
            }
        }

        return touched;
    }

    public void moveUp(){
        int newX; 
        int newY;

        if(this.isOnAbscissa()){
            newY = this.map.rover.currentPos.y;
            
            if (this.map.rover.currentPos.cardinal.equals("East")) {
                newX = this.map.rover.currentPos.x + 1;

                if (!this.willBeOutMap(newX) && !this.willToucheObstacle(newX, newY)) {
                        this.map.rover.currentPos.x++;
                }
            }
            else {
                newX = this.map.rover.currentPos.x - 1;

                if (!this.willBeOutMap(newX) && !this.willToucheObstacle(newX, newY)) {
                        this.map.rover.currentPos.x--;
                }
            }

        } else {            
            newX = this.map.rover.currentPos.x;
            
            if (this.map.rover.currentPos.cardinal.equals("North")) {
                newY = this.map.rover.currentPos.y + 1;
                if (!this.willBeOutMap(newY) && !this.willToucheObstacle(newX, newY)) {
                    this.map.rover.currentPos.y++;
                }
            }
            else {
                newY = this.map.rover.currentPos.y - 1;
                if (!this.willBeOutMap(newY) && !this.willToucheObstacle(newX, newY)) {
                    this.map.rover.currentPos.y--;
                }
            }
        }
    }

    public void moveDown() {
        int newX; 
        int newY; 

        if(this.isOnAbscissa()){
            newY = this.map.rover.currentPos.y;
            
            if (this.map.rover.currentPos.cardinal.equals("East")) {
                newX = this.map.rover.currentPos.x - 1;

                if (!this.willBeOutMap(newX) && !this.willToucheObstacle(newX, newY)) {
                        this.map.rover.currentPos.x--;
                }
            }
            else {
                newX = this.map.rover.currentPos.x + 1;

                if (!this.willBeOutMap(newX) && !this.willToucheObstacle(newX, newY)) {
                        this.map.rover.currentPos.x++;
                }
            }

        } else {            
            newX = this.map.rover.currentPos.x;
            
            if (this.map.rover.currentPos.cardinal.equals("North")) {
                newY = this.map.rover.currentPos.y - 1;
                if (!this.willBeOutMap(newY) && !this.willToucheObstacle(newX, newY)) {
                    this.map.rover.currentPos.y--;
                }
            }
            else {
                newY = this.map.rover.currentPos.y + 1;
                if (!this.willBeOutMap(newY) && !this.willToucheObstacle(newX, newY)) {
                    this.map.rover.currentPos.y++;
                }
            }
        }
    }

    public int getCardinalIndex(){
        return Arrays.asList(this.cardinals).indexOf(this.map.rover.currentPos.cardinal);
    }

    public void turnLeft() {
        int newCardinalIndex = (this.getCardinalIndex() + 3) % 4;
        this.map.rover.currentPos.cardinal = Arrays.asList(this.cardinals).get(newCardinalIndex);
    }

    public void turnRight() {
        int newCardinalIndex = (this.getCardinalIndex() + 1) % 4;
        this.map.rover.currentPos.cardinal = Arrays.asList(this.cardinals).get(newCardinalIndex);
    }

    public void executeCommands(String[] commands) {
        for (String command : commands) {
            switch (command) {
                case "up":
                    this.moveUp();
                    break;
                case "down":
                    this.moveDown();
                    break;
                case "right":
                    this.turnRight();
                    break;
                case "left":
                    this.turnLeft();
                    break;
            
                default:
                    System.out.println("Commande non reconnue");
                    break;
            }
        }
    }

    public String toString() {
        return this.map.rover.toString() + "\n\n";
    }
}