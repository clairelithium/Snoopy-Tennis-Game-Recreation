import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * myWorld - world after the start button is clicked and the game starts.
 * 
 * @author Claire Li
 * @date 06/09/2024
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
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
        Button button = new Button();
        addObject(button,90,340);

        Snoopy snoopy = new Snoopy();
        addObject(snoopy,535,300);

        Counter counter = new Counter();
        addObject(counter, 80, 80);

        Lives lives = new Lives();
        addObject(lives,700,55);

        CharlieBrown charlieBrown = new CharlieBrown();
        addObject(charlieBrown,215,175);

        Object object = new Object(button, snoopy, counter, lives);
        addObject(object,215,175);

        for (int i = 0; i <= 19; i++)
        {
            addObject(new Grass(), 190 + i*22, 328);
        }
    }

}
