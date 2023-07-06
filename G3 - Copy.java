import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class G3 extends Actor
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
