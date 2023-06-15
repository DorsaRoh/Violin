import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class B8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class E3 extends Note
{
    GreenfootImage upImage = new GreenfootImage("key3up.png"); 
    GreenfootImage downImage = new GreenfootImage("key3down.png");
    private boolean keyIsDown = true;
    
    
    public void act()
    {
        /* Run when player makes white key go down */
        if(keyIsDown == false && Greenfoot.isKeyDown("3") == true){
            playSound();
            setImage(downImage);
            keyIsDown = true;
        }
        if(keyIsDown == true && Greenfoot.isKeyDown("3") == false){
            setImage(upImage);
            keyIsDown = false;
        }
    }
    
    public void playSound()
    {
        Greenfoot.playSound("E3.wav");
    }
}
