import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A1 extends Actor
{
    GreenfootImage upImage = new GreenfootImage("keyQup.png");
    GreenfootImage downImage = new GreenfootImage("keyQdown.png");
    private boolean keyIsDown = false;
    
    public void act()
    {
        /* Run when player makes white key go down */
        if(keyIsDown == false && Greenfoot.isKeyDown("q") == true){
            playSound();
            setImage(downImage);
            keyIsDown = true;
        }
        if(keyIsDown == true && Greenfoot.isKeyDown("q") == false){
            setImage(upImage);
            keyIsDown = false;
        }
    }
    
    public void playSound()
    {
        Greenfoot.playSound("A1.wav");
    }
}
