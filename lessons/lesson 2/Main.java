import java.util.Scanner;

import javax.security.auth.kerberos.KerberosCredMessage;

public class Main {
    // Variable to store our instanced class for receiving input
    // NOTE: notice this variable has yet to be set equal to anything, this is done on line 13

    public static void main(String[] args) {
         Scanner input;

         String inputValue;
    
        // Variable to store the users name once they provide it
         String name;
        boolean hasWon = false;
        boolean isDead = false;
        int currentPosition = 0;
        boolean hasSword = false;
        boolean hasPotion = false;
        // ASSIGNMENT B:
        // Here we "initialize" or set our variable (input) equal to a new Scanner instance that receives input from 'System.in'
        input = new Scanner(System.in);

        // Asks the user to input their name through the console
        System.out.println("Please enter your name below:");
        
        // Gets the next available user input and sets the name variable to that input
        name = input.nextLine();

        // Prints a customized welcome message for the user
        System.out.println("Welcome, " + name + "!");

        // ASSIGNMENT C:
        while (!isDead || !hasWon) {
            switch (currentPosition) {

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
                    break;
                case 3:
                    System.out.println("You follow the hall north, and find a dead end, with doors to the east and west. Remember that you can always double back.");
                    inputValue = input.nextLine();
                    if (inputValue.toLowerCase().trim().equals("e")) {
                        currentPosition = 5;
                        Sysem.out.println("You push the door open, and find a mostly empty room, with a sword leaning against the wall in the far corner. The sword seems to give off it's own light.");
                        System.out.println("Do you wish to pick up the sword? if yes, press Y, if no, press N");
                        inputValue = input.nextLine();
                        if (inputValue.toLowerCase().trim().equals("Y")) {
                            if (hasPotion == false) {
                            System.out.println("You reach out to grab the sword, but when you do, it glows brighter and burns your hand. It seems that you cannot handle this sword. At least not yet...");
                            System.out.println("Try again? Y or N");
                            inputValue = input.nextLine();
                            if (inputValue.toLowerCase().trim().equals("Y")) {
                                System.out.println("You reach out again, but no luck. Your burn grows more severe.");
                                System.out.println("Try again?");
                                inputValue = input.nextLine();
                                if (inputValue.toLowerCase().trim().equals("Y")) {
                                    System.out.println("You reach out once again, and are burned even more. You succumb to the injuries that you have sustained in your foolishness.");
                                    isDead = True;
                                }
                            } 
                        boolean beenBurnt = true;
                        }
                            if (hasPotion == true) {
                                if (beenBurnt == true) {
                                System.out.println("You succesfully pick up the sword, no nasty burns this time");
                                }
                                else System.out.println("You pick up the sword");
                            }
                    }
                        if (inputValue.toLowerCase().trim().equals("N")) {
                            currentPosition = 5;
                            System.out.println("Makeing the safe choice, you leave the mysterious weapon alone, and turn back.");
                    }                        
                }                  
                    if (inputValue.toLowerCase().trim().equals("W")) {
                        System.out.println("You open the door and find a shadowy figure, crouched, waiting.");
                        if (hasSword == false) {
                            System.out.println("As the door creaks open, the creature pounces on you, tearing you to pieces.");
                            isDead = true;
                        }
                        if (hasSword == true) {
                            System.out.println("The creature turns and pounces on you, but as if acting of it's own volition, your sword is right where it needs to be, and intercepts the moster mid-air. It falls to the ground dead, and a door in the wall behind it swings open showing the surface once again. You pass through, and find yourself near to the original entrance of the dungeon.");
                            hasWon = true;
                        }
                    }
                    break;
                    
                    case 4: 
                        System.out.println("You turn west, following a long hall that seems to have a single sturdy door at the end, but suddenly, the ground under your feet caves in");
                        if (hasFlyingShoes == false) {
                            System.out.println("It is unclear wether the cave in was a trap, or just bad design. Either way, you are stuck. No water, no food, and no way out. ");
                            isDead = true;
                        }
                        if (hasFlyingShoes == true){
                            System.out.println("Using your flying shoes, you escape the collapse, and continue towards to door. It is unlocked. Proceed? Y or N");
                        }
                        inputValue = input.nextLine();
                        if (inputValue.toLowerCase().trim().equals("Y")) {
                            System.out.printn("You open the door and find a stone table, with a single bottle filled with a pale blue liquid. The bottle has a stopper in the shape of a sword. Do you drink the liquid in the bottle? Y or N");
                            inputValue = input.nextLine();
                            if (inputValue.toLowerCase().trim().equals("Y")) {
                                System.out.println("Drinking the potion, there are no noticable effects");
                                hasPotion = true;
                        }
                    }
                    break;

                    case 5:
                        System.out.println("you follow the hall to the west. it appears to be a dead end, except for a small alcove in the left wall, which has a pair of winged shoes tucked into it. you put them on.");
                        hasFlyingShoes = true;
                    break;
                        
                        
                
                
                
                
                }   
            }
        }
        
}