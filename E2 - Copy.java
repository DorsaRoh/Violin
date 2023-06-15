import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class yellow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class E2 extends Actor
{
    GreenfootImage upImage = new GreenfootImage("key2up.png"); 
    GreenfootImage downImage = new GreenfootImage("key2down.png");
    private boolean keyIsDown = true;
    
    
    public void act()
    {
        /* Run when player makes white key go down */
        if(keyIsDown == false && Greenfoot.isKeyDown("2") == true){
            playSound();
            setImage(downImage);
            keyIsDown = true;
        }
        if(keyIsDown == true && Greenfoot.isKeyDown("2") == false){
            setImage(upImage);
            keyIsDown = false;
        }
    }
    
    public void playSound()
    {
        Greenfoot.playSound("E2.wav");
    }
}
