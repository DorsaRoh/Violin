import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class HardViolinTiles extends World
{
    public int score; // user score
    public int waitTimeLeft = 3820; 
    
    // instance of Tiles class in order to obtain the variable points' value
    Tile tiles = new Tile("1", 3, 330, "E1");
    
    public HardViolinTiles()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        GreenfootImage background = getBackground();
        showText("Music: Golden Hour", 105, 590);
        prepare();
        act();
        
        hardGame();
    }
    
    public void act(){
        // return to main menu
        if(Greenfoot.isKeyDown("enter")){
            tiles.clearPoints();
            Greenfoot.setWorld(new MainMenu());
        }
        
        // show user score
        showText("Score: " + tiles.points, 55, 210);

        // determine whether or not user can proceed to the hard game
        score = tiles.getTotalPoints();
        if(waitTimeLeft > 0){
            waitTimeLeft--;
        }
        else{
            // show end game
            Greenfoot.setWorld(new GameEnd());
        }
    }
    
    // hard game - golden hour 
    // keys to play: q w r 1 r w q w r 1 r w q w r 1 r w q w r 1 r w 
    // f w r 1 r w f w r 1 r w f w r 1 r w f w r 1 
    // adfwfdadfwfdadfwfdadfwfd
    // vasdsavasdsavasdsavasdsa
    private void hardGame(){
        addObject(new Tile("Q", 3, 20, "A1"), 309, 55);
        addObject(new Tile("W", 3, 80, "A2"), 458, 55);
        addObject(new Tile("R", 3, 120, "A4"), 714, 55);
        addObject(new Tile("1", 3, 170, "E1"), 309, 55);
        addObject(new Tile("R", 3, 190, "A4"), 714, 55);
        addObject(new Tile("W", 3, 230, "A2"), 458, 55);
        addObject(new Tile("Q", 3, 260, "A1"), 309, 55);
        addObject(new Tile("W", 3, 300, "A2"), 458, 55);
        addObject(new Tile("R", 3, 340, "A4"), 714, 55);
        addObject(new Tile("1", 3, 390, "E1"), 309, 55);
        addObject(new Tile("R", 3, 410, "A4"), 714, 55);
        addObject(new Tile("W", 3, 440, "A2"), 458, 55);
        addObject(new Tile("Q", 3, 470, "A1"), 309, 55);
        addObject(new Tile("W", 4, 530, "A2"), 458, 55);
        addObject(new Tile("R", 4, 570, "A4"), 714, 55);
        addObject(new Tile("1", 3, 620, "E1"), 309, 55);
        addObject(new Tile("R", 3, 640, "A4"), 714, 55);
        addObject(new Tile("W", 3, 680, "A2"), 458, 55);
        addObject(new Tile("Q", 3, 710, "A1"), 309, 55);
        addObject(new Tile("W", 3, 750, "A2"), 458, 55);
        addObject(new Tile("R", 3, 790, "A4"), 714, 55);
        addObject(new Tile("1", 3, 840, "E1"), 309, 55);
        addObject(new Tile("R", 3, 870, "A4"), 714, 55);
        addObject(new Tile("W", 3, 900, "A2"), 458, 55);
        
        addObject(new Tile("F", 4, 930, "D4"), 714, 55);
        addObject(new Tile("W", 4, 990, "A2"), 458, 55);
        addObject(new Tile("R", 4, 1030, "A4"), 714, 55);
        addObject(new Tile("1", 3, 1080, "E1"), 309, 55);
        addObject(new Tile("R", 3, 1090, "A4"), 714, 55);
        addObject(new Tile("W", 3, 1140, "A2"), 458, 55);
        addObject(new Tile("F", 4, 1170, "D4"), 714, 55);
        addObject(new Tile("W", 4, 1240, "A2"), 458, 55);
        addObject(new Tile("R", 4, 1290, "A4"), 714, 55);
        addObject(new Tile("1", 3, 1340, "E1"), 309, 55);
        addObject(new Tile("R", 3, 1350, "A4"), 714, 55);
        addObject(new Tile("W", 3, 1400, "A2"), 458, 55);
        addObject(new Tile("F", 4, 1430, "D4"), 714, 55);
        addObject(new Tile("W", 4, 1500, "A2"), 458, 55);
        addObject(new Tile("R", 4, 1540, "A4"), 714, 55);
        addObject(new Tile("1", 3, 1590, "E1"), 309, 55);
        addObject(new Tile("R", 3, 1600, "A4"), 714, 55);
        addObject(new Tile("W", 3, 1650, "A2"), 458, 55);
        addObject(new Tile("F", 4, 1680, "D4"), 714, 55);
        addObject(new Tile("W", 4, 1750, "A2"), 458, 55);
        addObject(new Tile("R", 4, 1780, "A4"), 714, 55);
        addObject(new Tile("1", 3, 1830, "E1"), 309, 55);
        addObject(new Tile("R", 3, 1840, "A4"), 714, 55);
        addObject(new Tile("W", 3, 1890, "A2"), 458, 55);
        
        addObject(new Tile("A", 3, 1920, "D1"), 309, 55);
        addObject(new Tile("D", 3, 1960, "D3"), 594, 55);
        addObject(new Tile("F", 3, 1990, "D4"), 714, 55);
        addObject(new Tile("W", 3, 2040, "A2"), 458, 55);
        addObject(new Tile("F", 3, 2060, "D4"), 714, 55);
        addObject(new Tile("D", 3, 2090, "D3"), 594, 55);
        addObject(new Tile("A", 3, 2120, "D1"), 309, 55);
        addObject(new Tile("D", 3, 2160, "D3"), 594, 55);
        addObject(new Tile("F", 3, 2200, "D4"), 714, 55);
        addObject(new Tile("W", 3, 2240, "A2"), 458, 55);
        addObject(new Tile("F", 3, 2270, "D4"), 714, 55);
        addObject(new Tile("D", 3, 2300, "D3"), 594, 55);
        addObject(new Tile("A", 3, 2330, "D1"), 309, 55);
        addObject(new Tile("D", 3, 2370, "D3"), 594, 55);
        addObject(new Tile("F", 3, 2410, "D4"), 714, 55);
        addObject(new Tile("W", 3, 2450, "A2"), 458, 55);
        addObject(new Tile("F", 3, 2470, "D4"), 714, 55);
        addObject(new Tile("D", 3, 2500, "D3"), 594, 55);
        addObject(new Tile("A", 3, 2530, "D1"), 309, 55);
        addObject(new Tile("D", 3, 2560, "D3"), 594, 55);
        addObject(new Tile("F", 3, 2590, "D4"), 714, 55);
        addObject(new Tile("W", 3, 2620, "A2"), 458, 55);
        addObject(new Tile("F", 3, 2650, "D4"), 714, 55);
        addObject(new Tile("D", 3, 2680, "D3"), 594, 55);
        
        //vasdsavasdsavasdsavasdsa 2710
        addObject(new Tile("V", 4, 2710, "G4"), 716, 55);
        addObject(new Tile("A", 3, 2750, "D1"), 309, 55);
        addObject(new Tile("S", 3, 2790, "D2"), 458, 55);
        addObject(new Tile("D", 3, 2830, "D3"), 594, 55);
        addObject(new Tile("S", 3, 2870, "D2"), 458, 55);
        addObject(new Tile("A", 3, 2910, "D1"), 309, 55);
        addObject(new Tile("V", 4, 2950, "G4"), 716, 55);
        addObject(new Tile("A", 3, 2990, "D1"), 309, 55);
        addObject(new Tile("S", 3, 3030, "D2"), 458, 55);
        addObject(new Tile("D", 3, 3070, "D3"), 594, 55);
        addObject(new Tile("S", 3, 3110, "D2"), 458, 55);
        addObject(new Tile("A", 3, 3150, "D1"), 309, 55);
        addObject(new Tile("V", 4, 3190, "G4"), 716, 55);
        addObject(new Tile("A", 3, 3230, "D1"), 309, 55);
        addObject(new Tile("S", 3, 3270, "D2"), 458, 55);
        addObject(new Tile("D", 3, 3310, "D3"), 594, 55);
        addObject(new Tile("S", 3, 3350, "D2"), 458, 55);
        addObject(new Tile("A", 3, 3390, "D1"), 309, 55);
        addObject(new Tile("V", 4, 3430, "G4"), 716, 55);
        addObject(new Tile("A", 3, 3470, "D1"), 309, 55);
        addObject(new Tile("S", 3, 3510, "D2"), 458, 55);
        addObject(new Tile("D", 3, 3550, "D3"), 594, 55);
        addObject(new Tile("S", 3, 3590, "D2"), 458, 55);
        addObject(new Tile("A", 3, 3630, "D1"), 309, 55);
    
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
        returnMenu returnMenu = new returnMenu();
        addObject(returnMenu,167,39);
    }
}
