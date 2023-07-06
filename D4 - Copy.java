import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class D4 extends Actor
{
    GreenfootImage upImage = new GreenfootImage("keyFup.png");
    GreenfootImage downImage = new GreenfootImage("keyFdown.png");
    private boolean keyIsDown = false;
    
    public void act()
    {
        /* Run when player makes white key go down */
        if(keyIsDown == false && Greenfoot.isKeyDown("f") == true){
            playSound();
            setImage(downImage);
            keyIsDown = true;
        }
        if(keyIsDown == true && Greenfoot.isKeyDown("f") == false){
            setImage(upImage);
            keyIsDown = false;
        }
    }
    
    public void playSound()
    {
        Greenfoot.playSound("D4.wav");
    }
}
