import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class D2 extends Actor
{
    GreenfootImage upImage = new GreenfootImage("keySup.png");
    GreenfootImage downImage = new GreenfootImage("keySdown.png");
    private boolean keyIsDown = false;
    
    public void act()
    {
        /* Run when player makes white key go down */
        if(keyIsDown == false && Greenfoot.isKeyDown("s") == true){
            playSound();
            setImage(downImage);
            keyIsDown = true;
        }
        if(keyIsDown == true && Greenfoot.isKeyDown("s") == false){
            setImage(upImage);
            keyIsDown = false;
        }
    }
    
    public void playSound()
    {
        Greenfoot.playSound("D2.wav");
    }
}
