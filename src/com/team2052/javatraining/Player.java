import java.util.Scanner;

public class Player {
    private final Scanner input;
    private final String name;
    private Direction  desiredDirection;
    private int currentRoom;
    private boolean moved = true;
    private boolean isDead = false;
    private boolean hasWon = false;

    public Player(Scanner input, String name) {
        this.input = input;
        this.name = name;
    }

    public String getUserInput() {
        return input.nextLine().toLowerCase().trim();
    }
    
    public void processUserInput() {
        moved = false;
    
        System.out.print("What's your move " + name + "? ");
    
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
                    return;
    
                case "w":
                    desiredDirection = Direction.WEST;
                    return;
                
                case "h":
                    printHelpMenu();
                    break;
    
                default:
                    invalidInput();
                    break;
            }
        }
    }
    public Direction getDesiredDirection() {
        return desiredDirection;
    }

    public int getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(int room) {
        if (currentRoom != room) {
            moved = true;
            currentRoom = room;
        }
    }
    public boolean hasMoved(){
        return moved;
    }
    public boolean checkIsDead(){
        return isDead;
    }
    public void killPlayer(){
        isDead = true;
    }
    public boolean checkHasWon(){
        return hasWon;
    }
    public void playerWins(){
        hasWon = true;
    }
    private void printHelpMenu() {
        System.out.println("Choose a direction (n,e,s,w) and type it in for which direction you would like to go.");
    }
    private void invalidInput() {
        System.out.println("Sorry, input is invalid. Press 'h' for help, or retry.");
    }
}
