package rover.custom;

import java.util.Arrays;

public class Position {

    public int x;
    public int y;
    public String cardinal;
    public String[] cardinals = {"North", "East", "South", "West"};

    public Position(int x, int y, String cardinal) {
        this.x = x;
        this.y = y;
        this.cardinal = cardinal;
    }

    public int getCardinalIndex(){
        return Arrays.asList(this.cardinals).indexOf(this.cardinal) + 1;
    }

    public void turnLeft() {
        int newCardinalIndex = (this.getCardinalIndex() + 3) % 4;
        this.cardinal = Arrays.asList(this.cardinals).get(newCardinalIndex);
    }

    public void turnRight() {
        int newCardinalIndex = (this.getCardinalIndex() + 1) % 4;
        this.cardinal = Arrays.asList(this.cardinals).get(newCardinalIndex);
    }


}