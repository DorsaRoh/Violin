import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FreePlayHelp extends World
{

    /**
     * Constructor for objects of class FreePlayHelp.
     * 
     */
    public FreePlayHelp()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
    }
    
    public void act(){
        // create new free play world
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new ViolinFreePlay());
        }
    }
}
