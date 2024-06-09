import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Object - Actor class that is hitted around multiple times, can be 
 * controlled and hit with the hit button
 * 
 * @author Claire Li
 * @date 06/09/2024
 */
public class Object extends Actor
{
    private Snoopy mySnoopy;
    private Button myButton;
    private Counter myCounter;
    private Lives myLives;
    private int objectSpawnTimer = 0; 

    /**
     * Constructor default - Builds the ball object to start at a random rotation
     */
    public Object(Button button, Snoopy snoopy, Counter counter, Lives lives)
    {
        setImage ("object3.png");

        int [] direction = {23, 10, 0};
        int xvalue = Greenfoot.getRandomNumber (3);
        setRotation((int) direction [xvalue]);
        myLives = lives;
        myButton = button;
        myCounter = counter;
        mySnoopy = snoopy;
    }

    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move (4);
        checkSnoopy();
        checkEdges();
        objectSpawnTimer++;
        objectSpawn();
    }

    /**
     * objectSpawn - Spawns a new object ball every few seconds.
     */
    public void objectSpawn()
    {
        if (objectSpawnTimer == 60)
        {
            getWorld().addObject(new Object(myButton, mySnoopy, myCounter, myLives), 215, 175);
        }
    }

    /**
     * checkSnoopy - If the object touches Snoopy and the (hit) button is clicked, then a point should be added and the ball should rotate back
     */
    public void checkSnoopy()
    {
        if (isTouching (Snoopy.class))
        {
            if (myButton.buttonClicked())
            {
                mySnoopy.swing();
                turn(Greenfoot.getRandomNumber(10)+180);
                move (4);
            }
        }
    }

    /** 
     * checkEdges - Detects if the object proceeds past or forth an image,
     * removes the image, and can remove a heart life away.
     */
    public void checkEdges()
    {
        if (getX() < 170) // || getX() > 630)
        {
            getWorld().removeObject(this);
            myCounter.add(1);
        }
        else if (getX() > 630)
        {
            getWorld().removeObject(this);
            myLives.add(-1);
            myLives.changeImage();
        }

    }
}
