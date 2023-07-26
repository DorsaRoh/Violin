import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class E1 extends Actor
{
    GreenfootImage upImage = new GreenfootImage("key1up.png"); 
    GreenfootImage downImage = new GreenfootImage("key1down.png");
    private boolean keyIsDown = true;
    
    
    public void act()
    {
        /* Run when player makes white key go down */
        if(keyIsDown == false && Greenfoot.isKeyDown("1") == true){
            playSound();
            setImage(downImage);
            keyIsDown = true;
        }
        if(keyIsDown == true && Greenfoot.isKeyDown("1") == false){
            setImage(upImage);
            keyIsDown = false;
        }
    }
    
    public void playSound()
    {
        Greenfoot.playSound("E1.wav");
    }
}
