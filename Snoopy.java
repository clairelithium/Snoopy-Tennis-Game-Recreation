import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Snoopy - Actor that the player can control
 * Helps play the game and be controlled by keybinds and the hit button
 * 
 * @author Claire Li
 * @date 06/09/2024
 */
public class Snoopy extends Actor
{
    private Counter myCounter;
    public int [] yvalues = {315, 230, 175};
    private boolean methodCalled = false;
    public int xvalue = 535;

    /**
     * Snoopy(Counter counter) - Constructor for Snoopy for counter class
     */
    public Snoopy(Counter counter)
    {
        myCounter = counter;
    }

    /**
     * Snoopy Constructor - Constructs the Snoopy default image
     * in the beginning of the game.
     */
    public Snoopy()
    {
        setImage("Snoopy.png");
    }

    /**
     * Act - do whatever the Snoopy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveSnoopy();
    }

    /**
     * moveSnoopy - Dependent on the keys pressed, Snoopy is able to 
     * move at 3 different locations using arrays. 
     */
    public void moveSnoopy()
    {
        if (Greenfoot.isKeyDown("1")) 
        {
            setLocation(xvalue,  yvalues [0]);
        }
        if (Greenfoot.isKeyDown("2")) 
        {
            setLocation(xvalue,  yvalues [1]);
        }
        if (Greenfoot.isKeyDown("3")) 
        {
            setLocation(xvalue,  yvalues [2]);
        }
    }

    /**
     * Swing - When detected, it changes the image to show 
     * a realistic Snoopy hitting a tennis ball, and then switches back.
     */
    public void swing()
    {
        if (isTouching (Object.class))
        {
            Greenfoot.playSound("Tennis-Ball.wav");
            setImage ("Snoopy2.png");
            Greenfoot.delay(5);
            setImage("Snoopy.png");
        }
    }

}
