import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class C8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class E4 extends Actor
{
    GreenfootImage upImage = new GreenfootImage("key4up.png"); 
    GreenfootImage downImage = new GreenfootImage("key4down.png");
    private boolean keyIsDown = true;
    
    
    public void act()
    {
        /* Run when player makes white key go down */
        if(keyIsDown == false && Greenfoot.isKeyDown("4") == true){
            playSound();
            setImage(downImage);
            keyIsDown = true;
        }
        if(keyIsDown == true && Greenfoot.isKeyDown("4") == false){
            setImage(upImage);
            keyIsDown = false;
        }
    }
    
    public void playSound()
    {
        Greenfoot.playSound("E4.wav");
    }
}
