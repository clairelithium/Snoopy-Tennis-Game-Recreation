import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button - hit button to detect if the player has attempted to 
 * receive the ball back
 * 
 * @author Claire Li
 * @date 06/09/2024
 */
public class Button extends Actor
{
    boolean buttonClicked = false;

    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here
    }

    /**
     * buttonClicked - When the button is clicked, it is marked as true
     */
    public boolean buttonClicked()
    {
        if(Greenfoot.mouseClicked(this))
        {
            return true;
        }
        return false;
    }
}
