import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameEnd extends World
{
    // instance of Tiles class in order to obtain the variable points' value
    Tile tiles = new Tile("1", 3, 330, "E1");

    
    public GameEnd()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 

        prepare();
    }

    public void act(){
        // return to main menu 
        if(Greenfoot.isKeyDown("enter")){
            tiles.clearPoints();
            Greenfoot.setWorld(new MainMenu());
        }
        
        // start hard game
        if(Greenfoot.isKeyDown("space")){
            tiles.clearPoints();
            Greenfoot.setWorld(new HardViolinTiles());
        }
    }

    private void prepare()
    {
        hardGamePoints hardGamePoints = new hardGamePoints();
        addObject(hardGamePoints, 500, 315);
    }
}
