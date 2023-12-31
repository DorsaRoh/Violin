import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class G4 extends Actor
{
    /**
     * Act - do whatever the G4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage upImage = new GreenfootImage("keyVup.png"); 
    GreenfootImage downImage = new GreenfootImage("keyVdown.png");
    private boolean keyIsDown = true;
    
    
    public void act()
    {
        /* Run when player makes white key go down */
        if(keyIsDown == false && Greenfoot.isKeyDown("v") == true){
            playSound();
            setImage(downImage);
            keyIsDown = true;
        }
        if(keyIsDown == true && Greenfoot.isKeyDown("v") == false){
            setImage(upImage);
            keyIsDown = false;
        }
    }
    
    public void playSound()
    {
        Greenfoot.playSound("G4.wav");
    }
}
