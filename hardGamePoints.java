import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class hardGamePoints extends Actor
{
    // instance of Tiles class in order to obtain the variable points' value
    Tile tiles = new Tile("1", 3, 330, "E1");
    
    public hardGamePoints(){
        text();
    }
    
    public void text(){
        GreenfootImage image = new GreenfootImage(80, 270);
        image.setFont(new Font("Times New Roman", 40)); 
        image.setColor(Color.WHITE);
        image.drawString(" " + tiles.points, 30, 30);
        setImage(image);
    }
}
