package rover;
import rover.custom.*;

class Main {
  public static void main(String[] args) {

    Position position = new Position(0, 0, "North");

    System.out.println(position.cardinal);
    position.turnLeft();
    System.out.println(position.cardinal);
    position.turnRight();
    System.out.println(position.cardinal);

  }
}