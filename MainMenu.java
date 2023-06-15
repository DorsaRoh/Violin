import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Credits:
 * Sounds/Music: https://virtualpiano.net/virtual-violin/
 * 
 * Instructions:
 * The player is presented with two options: Free play and Tile play.
 * Free play allows the user to play any melody they wish by having
 * full access to the functionalities of the game.
 * The objective of Tile play is to have the user press the right key
 * at the right time, which is determined by the tiles that appear 
 * from the top of the screen. When each tile is pressed correctly, it will
 * emit its appropriate violin sound.
 */
public class MainMenu extends World
{
    public MainMenu()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        GreenfootImage background = getBackground();

        prepare();
    }

    public void act(){
        if(Greenfoot.isKeyDown("1")){
            Greenfoot.setWorld(new ViolinFreePlay());
        }
        if(Greenfoot.isKeyDown("2")){
            Greenfoot.setWorld(new EasyViolinTiles());
        }
        if(Greenfoot.isKeyDown("0")){
            Greenfoot.setWorld(new MainInstructions());
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        help help = new help();
        addObject(help,397,579);
        help.setLocation(386,579);
    }
}
