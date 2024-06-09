import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Lives - Presents as a counter of how many lives are left of the game
 * Can become the result of the end of the game
 * 
 * @author Claire Li
 * @date 06/09/2024
 */
public class Lives extends Actor
{
    public int target = 3;

    /**
     * Act - do whatever the Lettuce wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here
    }

    /**
     * changeImage - Dependent on the previous image, it changes images
     * based on the number of lives left for a player.
     */
    public void changeImage()
    {
        if (target == 2)
        {
            setImage("heart2.png");            
        }
        if (target == 1)
        {
            setImage("heart1.png");            
        }
        if (target == 0)
        {
            setImage("heart0.png");
            Greenfoot.playSound("Womp-womp.wav");
            Instructions instruct = new Instructions(target);
            getWorld().addObject(instruct, 400, 400);  
            Greenfoot.stop();
        }
    }

    /**
     * Add - adds a new score value to the current counter value
     */
    public void add(int score)
    {
        target += score;
    }

}
