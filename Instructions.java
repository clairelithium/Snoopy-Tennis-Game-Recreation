import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Instructions - The ending instructions, initialized from the Coutner
 * or Lives class, shows how the game ended.
 * 
 * @author Claire Li
 * @date 06/09/2024
 */
public class Instructions extends Actor
{
    private Counter myCounter;

    /**
     * Instructions(intTarget) - Constructor to build the instructions object
     * Sets up the end game, stating the player has won or lost
     * Notice - It does not have a return typelike other methods
     * This will be enacted one time when each new object of the class is
     * built.
     */
    public Instructions(int Target)  
    {        
        if (Target == 10)
        {
            String instructions = "Game over, player has won since the score has reached 10 points!";
            GreenfootImage Instructions = new GreenfootImage(instructions, 24, Color.BLACK, Color.WHITE);
            setImage(Instructions);
        }
        else 
        {
            String instructions = "Game over, player has lost since no more lives are left!";
            GreenfootImage Instructions = new GreenfootImage(instructions, 24, Color.BLACK, Color.WHITE);
            setImage(Instructions);
        }
    }   

}

