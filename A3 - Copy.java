import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A3 extends Actor
{
    GreenfootImage upImage = new GreenfootImage("keyEup.png");
    GreenfootImage downImage = new GreenfootImage("keyEdown.png");
    private boolean keyIsDown = false;
    
    public void act()
    {
        /* Run when player makes white key go down */
        if(keyIsDown == false && Greenfoot.isKeyDown("e") == true){
            playSound();
            setImage(downImage);
            keyIsDown = true;
        }
        if(keyIsDown == true && Greenfoot.isKeyDown("e") == false){
            setImage(upImage);
            keyIsDown = false;
        }
    }
    
    public void playSound()
    {
        Greenfoot.playSound("A3.wav");
    }
}
