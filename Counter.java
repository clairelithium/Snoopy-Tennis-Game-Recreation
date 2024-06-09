import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Counter - a simple counter with graphical representation as an actor 
 * on the screen
 * 
 * @author Claire Li
 * @date 06/09/2024
 */
public class Counter extends Actor
{
    public int target = 0;
    private GreenfootImage background; 
    private static final Color TRANSPARENT = new Color (0,0,0,0);
    private int frame;

    /**
     * Counter Constructor - initialize beginning variables and the counter 
     * image to display zero     
     */
    public Counter()
    {
        target = 0;
        background = getImage();
        updateImage();
    }

    /**
     * Act - do whatever the Lettuce wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        updateImage();
        endGame();
    }

    /**
     * endGame - Detects the end of the game and initates the instructions
     */
    public void endGame()
    {
        if (target == 10)
        {
            Greenfoot.playSound("Celebration.wav");
            Instructions instructions = new Instructions(target);
            getWorld().addObject(instructions, 400, 400);  
            Greenfoot.stop();
        } 
    }

    /**
     * updateImage - updates the image on the screen to show the current counter value
     */
    public void updateImage()
    {
        GreenfootImage image = new GreenfootImage(background);
        GreenfootImage text = new GreenfootImage ("" + target, 22,Color.BLACK,TRANSPARENT);
        image.drawImage(text,image.getWidth()/2, image.getHeight() - text.getHeight());
        setImage(image);
    }

    /**
     * Add - adds a new score value to the current counter value
     */
    public void add(int score)
    {
        target += score;
        updateImage();
    }

}

