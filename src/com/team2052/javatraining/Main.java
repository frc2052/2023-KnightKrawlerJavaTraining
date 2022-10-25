import java.util.Scanner;

public class Main {
    // Variable to store our instanced class for receiving input
    // NOTE: notice this variable has yet to be set equal to anything, this is done on line 13
    private Scanner input;

    // Variable stores the input recieved from our input instance for easy access
    private String inputValue;

    // Variable to store the users name once they provide it
    private String name;

    // Keeps track of the current location, 0 is the beginning of the dungeon
    private int currentPosition = 0;

    private Boolean isDead = false;
    private Boolean hasWon = false;

    public Main() {
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
        while (!isDead || !hasWon) {
            switch (currentPosition) {
                case 0:
                    System.out.println("Welcome to the dungeon! Type \"E\" to enter.");
                    inputValue = input.nextLine();
                    if (inputValue.toLowerCase().trim().equals("e")) {
                        currentPosition = 1;
                    } else {
                        System.out.println("Invalid direction. Only \"E\" is valid");
                    }
                        break;
                case 1:
                    System.out.println("You see three rooms.");
                    System.out.println("The first is filled with fire, the second is filled with acid, and the third has lions who haven't eaten in three years.");
                    System.out.println("Which room do you choose? Type \"F\", \"S\", or \"T\"");
                    inputValue = input.nextLine();
                    if (inputValue.toLowerCase().trim().equals("f")) {
                        currentPosition = 2;
                    } else if (inputValue.toLowerCase().trim().equals("s")) {
                        currentPosition = 3;
                    } else if (inputValue.toLowerCase().trim().equals("t")) {
                        currentPosition = 4;
                    } else {
                        System.out.println("Invalid direction. Only \"F\", \"S\", \"T\",  are valid");
                    }
                    break;
                case 2:
                    System.out.println("You burned alive.");
                    isDead=true;
                    
                case 3:
                    System.out.println("You drowned in acid");
                  
                    isDead=true;
                
                case 4: 
                    System.out.println("You escaped the dungeon!!");
                    hasWon=true;   
                

        }}
    }

    // This method is the singular starting point of our application
    public static void main(String[] args) throws Exception {
        new Main();
    }
}