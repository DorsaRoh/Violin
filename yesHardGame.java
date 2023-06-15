import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class yesHardGame extends World
{
    public yesHardGame()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        GreenfootImage background = getBackground();
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new MainMenu());
        }
        // start/proceed to hard game
        if(Greenfoot.isKeyDown("space")){
            Greenfoot.setWorld(new HardViolinTiles());
        }
    }
}