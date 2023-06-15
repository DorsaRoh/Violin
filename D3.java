import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class D3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class D3 extends Note
{
    GreenfootImage upImage = new GreenfootImage("keyDup.png");
    GreenfootImage downImage = new GreenfootImage("keyDdown.png");
    private boolean keyIsDown = false;
    
    public void act()
    {
        /* Run when player makes white key go down */
        if(keyIsDown == false && Greenfoot.isKeyDown("d") == true){
            playSound();
            setImage(downImage);
            keyIsDown = true;
        }
        if(keyIsDown == true && Greenfoot.isKeyDown("d") == false){
            setImage(upImage);
            keyIsDown = false;
        }
    }
    
    public void playSound()
    {
        Greenfoot.playSound("D3.wav");
    }
}
