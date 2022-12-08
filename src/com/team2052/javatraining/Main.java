import java.util.Scanner;
enum Direction {
    NORTH,
    SOUTH,
    EAST,
    WEST
}

    public class Main {
   
    private Scanner input;
    
    private String name;

    private final Dungeon dungeon;

    private final Player player;
    
    
    public Main() {
        dungeon = new Dungeon();
        input = new Scanner(System.in);

        System.out.println("Please enter your name below:");
        
        name = input.nextLine();
        
        player = new Player(input, name);

        System.out.println("Welcome, " + name + "!");

        

        while (!player.setIsDead() || !player.setHasWon()){
            if(player.getMoved()){
                System.out.println(dungeon.getRoom(player.getCurrentRoom()).getDescription());
                player.processUserInput(); 
                int desiredRoom = (dungeon.getNextRoom(player.getDesiredDirection(), player.getCurrentRoom()));
               
                if (desiredRoom == -1){
                    System.out.println("You slammed into a wall! and died in the process");
                }

                if (desiredRoom != -1) {
                 player.setCurrentRoom(desiredRoom);
            
                    if (dungeon.getRoom(desiredRoom).isDeathRoom()) {
                     System.out.println("You have died boohoo");
                     player.killPlayer();
                     break;
                  }
                    
                    if (dungeon.getRoom(desiredRoom).isWinningRoom()) {
                    System.out.println("Woah you have escaped the scary dungeon good job!");
                    player.playerWon();
                    break;
                            }
                        } 
                

                }
            }
        }


            // This method is the singular starting point of our application
    public static void main(String[] args) throws Exception {
        new Main();   
    }
}