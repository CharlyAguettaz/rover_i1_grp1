package rover;
import rover.custom.*;

class Main {
  public static void main(String[] args) {
    Rover rover = new Rover(new Position(0, 0, "North"), new Position(0, 0, "North"));
    Obstacle[] obstacles = {new Obstacle(2, 3), new Obstacle(4, 3)};
    Map map = new Map(5, obstacles, rover);

    InterfaceController interfaceController = new InterfaceController(map);

    // Le Rover se prend un obstacle
    System.out.println(interfaceController.toString());
    interfaceController.moveUp();
    interfaceController.moveUp();
    interfaceController.moveUp();
    interfaceController.turnRight();
    interfaceController.moveUp();
    interfaceController.moveUp();
    interfaceController.moveDown();
    System.out.println(interfaceController.toString());


    // Execution de commandes
    String [] commands = {"left", "up", "up", "up", "left", "down"};
    interfaceController.executeCommands(commands);
    System.out.println(interfaceController.toString());
  }
  
  // les fonctions pour gérer le mouvement sont un peu complexe et aurait mérité d'être géré dans plusieurs class
  // Un class pour le mouvement, le cardinal etc
  
}
