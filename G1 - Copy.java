import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class G1 extends Actor
{

    GreenfootImage upImage = new GreenfootImage("keyZup.png"); 
    GreenfootImage downImage = new GreenfootImage("keyZdown.png");
    private boolean keyIsDown = true;
    
    
    public void act()
    {
        /* Run when player makes white key go down */
        if(keyIsDown == false && Greenfoot.isKeyDown("z") == true){
            playSound();
            setImage(downImage);
            keyIsDown = true;
        }
        if(keyIsDown == true && Greenfoot.isKeyDown("z") == false){
            setImage(upImage);
            keyIsDown = false;
        }
    }
    
    public void playSound()
    {
        Greenfoot.playSound("G1.wav");
    }
}
