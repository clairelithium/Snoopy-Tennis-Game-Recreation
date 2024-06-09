import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * StartWorld - The beginning world, it will transition after the Start
 * button is pressed.
 * 
 * @author Claire Li
 * @date 06/09/2024
 */
public class StartWorld extends World
{

    /**
     * Constructor for objects of class StartWorld.
     * 
     */
    public StartWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 450, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Start start = new Start();
        addObject(start,710,70);
        Button button = new Button();
        addObject(button,90,340);
        Counter counter = new Counter();
        addObject(counter, 80, 80);
    }
}
