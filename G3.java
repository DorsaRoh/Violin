import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class G3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class G3 extends Note
{
    GreenfootImage upImage = new GreenfootImage("keyCup.png"); 
    GreenfootImage downImage = new GreenfootImage("keyCdown.png");
    private boolean keyIsDown = true;
    
    
    public void act()
    {
        /* Run when player makes white key go down */
        if(keyIsDown == false && Greenfoot.isKeyDown("c") == true){
            playSound();
            setImage(downImage);
            keyIsDown = true;
        }
        if(keyIsDown == true && Greenfoot.isKeyDown("c") == false){
            setImage(upImage);
            keyIsDown = false;
        }
    }
    
    public void playSound()
    {
        Greenfoot.playSound("G3.wav");
    }
}
