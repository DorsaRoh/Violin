import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class keyR here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A4 extends Actor
{
    GreenfootImage upImage = new GreenfootImage("keyRup.png");
    GreenfootImage downImage = new GreenfootImage("keyRdown.png");
    boolean keyIsDown = false;
    
    public void act()
    {
        /* Run when player makes white key go down */
        if(keyIsDown == false && Greenfoot.isKeyDown("r") == true){
            playSound();
            setImage(downImage);
            keyIsDown = true;
        }
        if(keyIsDown == true && Greenfoot.isKeyDown("r") == false){
            setImage(upImage);
            keyIsDown = false;
        }
    }
    
    public void playSound()
    {
        Greenfoot.playSound("A4.wav");
    }
}
