import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MainInstructions extends World
{

    public MainInstructions()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
    }
    
    public void act(){
        // return to main menu
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new MainMenu());
        }
    }
}
