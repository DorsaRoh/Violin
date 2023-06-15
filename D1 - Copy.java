import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class D1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class D1 extends Actor
{
    GreenfootImage upImage = new GreenfootImage("keyAup.png");
    GreenfootImage downImage = new GreenfootImage("keyAdown.png");
    private boolean keyIsDown = false;
    
    public void act()
    {
        /* Run when player makes white key go down */
        if(keyIsDown == false && Greenfoot.isKeyDown("a") == true){
            playSound();
            setImage(downImage);
            keyIsDown = true;
        }
        if(keyIsDown == true && Greenfoot.isKeyDown("a") == false){
            setImage(upImage);
            keyIsDown = false;
        }
    }
    
    public void playSound()
    {
        Greenfoot.playSound("D1.wav");
    }
}
