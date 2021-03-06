package game;


/**
 * This class is part of the "Haunted house of Zuul" application. 
 * "Haunted house of Zuul" is a very simple, text based adventure game.
 * 
 * This class holds an enumeration of all command words known to the game.
 * It is used to recognize commands as they are typed in.
 *
 * @author  Michael Kolling and David J. Barnes, modified by Anton Erholt
 * @version 2010.12.07
 */

public class CommandWords
{
	private ScreenPrinter screenPrinter = new ScreenPrinter();
	
    // a constant array that holds all valid command words
    private static final String[] validCommands = {
        "go", "quit", "help", "look","take","inventory","1","2","3","use"
    };

    /**
     * Constructor - initialize the command words.
     */
    public CommandWords()
    {
        // nothing to do at the moment...
    }

    /**
     * Check whether a given String is a valid command word. 
     * @return true if it is, false if it isn't.
     */
    public boolean isCommand(String aString)
    {
        for(int i = 0; i < validCommands.length; i++) {
            if(validCommands[i].equals(aString))
                return true;
        }
        // if we get here, the string was not found in the commands
        return false;
    }

    /**
     * Print all valid commands to System.out.
     */
    public void showAll() 
    {
        for(String command: validCommands) {
            screenPrinter.println(command + "  ");
        }
        screenPrinter.println("");
    }
}
