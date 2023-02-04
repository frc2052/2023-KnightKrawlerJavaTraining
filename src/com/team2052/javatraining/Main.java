import java.util.Scanner;

public class Main { 
    // Variable to store our instanced class for receiving input
    // NOTE: notice this variable has yet to be set equal to anything, this is done on line 13
    private Scanner input;
    private boolean isDead = false;
    private boolean hasWon = false;
    boolean hasGlasses = false;
    int currentPosition = 0;
    private String inputValue;

    // Variable to store the users name once they provide it
    private String name;

    public  Main() {
        // ASSIGNMENT A:
        System.out.println("Hello world!");
        
        
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
        while (!isDead && !hasWon){
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
                        System.out.println("As you are mesmerized by the flame, you fail to notice Matt who grabs you by the neck and puts your head under water.");
                        System.out.println("You put up a fight, but your head has been under water for 3 minutes now and your vision has started bluring and your lungs are burning.");
                        System.out.println("As he is holding your head down Matt says 'You cant hurt us anymore! You...cant...hurt us...anymore'");
                        System.out.println("You die a painful, but deserving death");
                        isDead = true;
                    } else if (inputValue.toLowerCase().trim().equals("b")) {
                        currentPosition = 2;
                    } else {
                        System.out.println("Invalid direction. Only \"E\" and \"B\" are valid");
                    }
                    break;
                case 3:
                    System.out.println("You have found a door that has a sign on it that says 'Build team < Controls'. Do you enter \"E\" or Go Back \"B\"");
                    inputValue = input.nextLine();
                    if (inputValue.toLowerCase().trim().equals("e")) {
                        System.out.println("There it is, what you came here for, Dylan's glasses. Then you feel something cold and sharp tuch your neck");
                        System.out.println("'Hello there, " + name + " did you think it would be that easy? It never is. Now what I'm going to do is slice your neck open'" );
                        System.out.println("and let you blead to death.' You don't feel ready to die, so you stomp on the persons foot, which makes drop their wepon, a knife  ");
                        System.out.println("You grab the knife, you can either spare this person, or kill them");
                        System.out.println("Letting them live means certain death, and killing them means blood on your inocent hands. Do you \"Kill\" or \"Spare\"");
                        inputValue = input.nextLine();
                        if (inputValue.equals("Kill"))
                        {
                            hasGlasses = true;
                            System.out.println("You decide to kill this person. You stab them in the face, but the knife bounces back. They start screaming in pain so you stab them in the gut");
                            System.out.println("and push them to the ground. You stomp on their face, which doesn't end up killing them, just making them suffer more. So you step back");
                            System.out.println("to get a running start and jump and smash the knife on to their chest. You killed them. You have aquired the glasses");
                            currentPosition = 1;
                        
                        }else if (inputValue.equals("Spare")) {
                            System.out.println("You decide to spare this person. You put the knife down and go tp the glasses");
                            //currentPosition = 3;
                        }
                        else
                        {
                            System.out.println("Invalid. Only Kill and Spare are valid.");
                        }
                    } else if (inputValue.toLowerCase().trim().equals("b")) {
                        currentPosition = 2;
                    } else {
                        System.out.println("Invalid direction. Only \"E\" and \"B\" are valid");
                    }
                    break;
                    case 4:
                        System.out.println("You have found Dylan, he asks if you have his glasses. Do you say \"Yes\" or \"No\"");
                        inputValue = input.nextLine();
                        if (inputValue.equals("Yes")){
                            if (hasGlasses = true);{
                                hasWon = true;
                                System.out.println("Thanks, here is $4.23 for your trouble");
                        } }else if (inputValue.equals("No")){
                                System.out.println("Screw you");
                                currentPosition = 1;
                            } else {
                                System.out.println("What? Its a \"Yes\" or \"No\" question.");
                            }
                            break;
                        }
                    }
            

        }
    

    public static void main(String[] args) throws Exception {
        new Main();
    }
}
 