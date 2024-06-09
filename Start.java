import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Start - The button that brings from the StartWorld to MyWorld when clicked.
 * 
 * @author Claire Li
 * @date 06/09/2024
 */
public class Start extends Actor
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("Game-start.wav");
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
    }    
}
