import java.util.Scanner;

public class Main {

    private Scanner input;

    private String name;

    private final Dungeon dungeon;

    private final Player player;
    public Main() {

         //initialize stuff
        dungeon = new Dungeon();

        input = new Scanner(System.in);

        System.out.println("Hello player!");

        // ASSIGNMENT B:
        // Here we "initialize" or set our variable (input) equal to a new Scanner instance that receives input from 'System.in'

        System.out.println("Please enter your name below:");
        
        name = input.nextLine();

        player = new Player(input, name);

        System.out.println("Welcome, " + name + "!");

        while (!player.checkIsDead() || !player.checkHasWon()){
                if (player.hasMoved()){
                    System.out.println(dungeon.getRoom(player.getCurrentRoom()).getDescription());
                }
                player.processUserInput();

                int desiredRoom = (dungeon.getNextRoom(player.getDesiredDirection(),player.getCurrentRoom()));

                if (desiredRoom == -1){
                    System.out.println("You smacked into a wall");
                }

                if (desiredRoom != -1){
                    if (dungeon.getRoom(desiredRoom).isWinningRoom()){
                        System.out.println("Congrats, you have escaped the dungeon!");
                        player.playerWins();
                        break;
                    }
                    if (dungeon.getRoom(desiredRoom).isDeathRoom()){
                        System.out.println("you dead now");
                        player.killPlayer();
                        break;
                    }
                     else {
                         player.setCurrentRoom(desiredRoom);
                     }
                    }
        }
    }
    // This method is the singular starting point of our application
    public static void main(String[] args) throws Exception {
        new Main();
    }

}