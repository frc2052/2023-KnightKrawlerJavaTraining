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
        player = new Player(input, name);
        input = new Scanner(System.in);

        System.out.println("Please enter your name below:");
        
        name = input.nextLine();

        System.out.println("Welcome, " + name + "!");
    
        while (!player.setIsDead() || !player.setHasWon()){
            if(player.getMoved()){
                System.out.println(dungeon.getRoom(player.getCurrentRoom()).getDescription());
                player.processUserInput(); 
                int desiredRoom = (dungeon.getNextRoom(player.getDesiredDirection(), player.getCurrentRoom()));
               
                
                        if (desiredRoom != -1) {
                            player.setCurrentRoom(desiredRoom);
            
                            if (dungeon.getRoom(desiredRoom).isDeathRoom()) {
                                player.killPlayer();
                            }
                    
                            if (dungeon.getRoom(desiredRoom).isWinningRoom()) {
                                player.playerWon();
                            }
                        } else {
                            System.out.println("You slammed into a wall!");
                        }
                        break;
                

                }
            }
        }

       /*     switch (currentPosition) {
                case 0:
                    System.out.println("You are at the entrance, you can only go north. Type \"N\" to go north.");
                    inputValue = input.nextLine();
                    if (inputValue.toLowerCase().trim().equals("n")) {
                        currentPosition = 1;
                    } else {
                        System.out.println("Invalid direction. Only \"N\" is valid");
                    }
                        break;
                case 1:
                    System.out.println("You are standing at a hallway intersection that moves in all four directions; north, south, east and west.");
                    inputValue = input.nextLine();
                    if (inputValue.toLowerCase().trim().equals("e")) {
                        currentPosition = 2;
                    } else if (inputValue.toLowerCase().trim().equals("n")) {
                        currentPosition = 3;
                    } else if (inputValue.toLowerCase().trim().equals("w")) {
                        currentPosition = 4;
                    } else if (inputValue.toLowerCase().trim().equals("s")) {
                        currentPosition = 0;
                    } else {
                        System.out.println("Invalid direction. Only \"N\", \"S\", \"E\", \"W\",  are valid");
                    }
                    break;
                case 2:
                    System.out.println("You have found a large wooden door that is latched from the outside. Do you enter \"E\" or Go Back \"B\"");
                    inputValue = input.nextLine();
                    if (inputValue.toLowerCase().trim().equals("e")) {
                        System.out.println("You unlock the door and slowly push the door open.");
                        System.out.println("As you enter the room a small candle on the table catches your attention.");
                        System.out.println("As you are mesmerized by the flame, you fail to notice the witch who casts a spell to turn you to stone.");
                        System.out.println("You will forever adorn her room. You have died.");
                        
                        isDead = true;
                    } else if (inputValue.toLowerCase().trim().equals("b")) {
                        currentPosition = 2;
                    } else {
                        System.out.println("Invalid direction. Only \"E\" and \"B\" are valid");
                    }
                    { boolean hasSword = true; 
                        System.out.println("With this mighty sword you can face off the scary monsters in the MoNsTeR RoOm!");
                    break; }
                        */
                
             
        

            // This method is the singular starting point of our application
    public static void main(String[] args) throws Exception {
        new Main();   
    }
}