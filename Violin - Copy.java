import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Violin extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Violin()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        GreenfootImage background = getBackground();
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        E4 c8 = new E4();
        addObject(c8,712,327);
        E3 b8 = new E3();
        addObject(b8,592,328);
        E2 a8 = new E2();
        addObject(a8,458,327);
        E1 g7 = new E1();
        addObject(g7,309,327);
        A4 keyR = new A4();
        addObject(keyR,714,394);
        A3 a3 = new A3();
        addObject(a3,594,395);
        A2 a2 = new A2();
        addObject(a2,459,394);
        A1 a1 = new A1();
        addObject(a1,309,392);
        D4 d4 = new D4();
        addObject(d4,716,460);
        D3 d3 = new D3();
        addObject(d3,594,460);
        D2 d2 = new D2();
        addObject(d2,461,459);
        D1 d1 = new D1();
        addObject(d1,310,459);
        G4 g4 = new G4();
        addObject(g4,716,528);
        G3 g3 = new G3();
        addObject(g3,594,528);
        G2 g2 = new G2();
        addObject(g2,461,530);
        G1 g1 = new G1();
        addObject(g1,310,528);
    }
}
