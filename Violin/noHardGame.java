import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class noHardGame extends World
{
    public noHardGame()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        GreenfootImage background = getBackground();
    }
    
    public void act(){
        // return to main menu
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new MainMenu());
        }
        // restart easy game
        if(Greenfoot.isKeyDown("space")){
            Greenfoot.setWorld(new EasyViolinTiles());
        }
    }
}