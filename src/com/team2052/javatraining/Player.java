import java.util.Scanner;

public class Player {
    private final Scanner input; 
    private final String name;
    private Action desiredAction;
    private Direction desiredDirection;
    private int currentRoom;
    private boolean moved = true;
    private boolean isDead = false;
    private boolean hasWon = false;

    public Player (Scanner input, String name){
        this.input = input;
        this.name = name;
    }

    public String getUserInput() {
        return input.nextLine().toLowerCase().trim();
    }

    public void processUserInput() {
        moved = false;
        System.out.println("What's your move " + name + "? " );
        while (true) {
            switch (getUserInput()) {
                case "n":
                    desiredDirection = Direction.NORTH;
                    return;

                case "s":
                    desiredDirection = Direction.SOUTH;
                    return;

                case "e":
                    desiredDirection = Direction.EAST;

                case "w":
                    desiredDirection = Direction.WEST;
                case "h":
                    System.out.println("Print Help Menu");
                    break;
            
                default:
                    System.out.println("Invalid Input");
                    break;
                }
            }
    }

    public Direction getDesiredDirection()  {
        return desiredDirection;    
    }

    public int getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(int room) {
        if (currentRoom != room) {
                boolean moved = true;
            currentRoom = room;
        }
    }
    public boolean getMoved() {
        return moved;
    }
    public boolean setIsDead() {
        return isDead;
    }
    public boolean setHasWon() {
        return hasWon;
    }
}
