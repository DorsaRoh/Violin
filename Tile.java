import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Tile extends Actor
{
    public int speed;
    public int waitTimeLeft;
    public static int points = 0;
    String cl; // class for tile's corresponding key
    String key;
    
    
    public Tile(String keyGiven, int speedGiven, int waitGiven, String classGiven){
        this.key = keyGiven;
        this.speed = speedGiven;
        this.waitTimeLeft = waitGiven;
        this.cl = classGiven;
        
        // if keyGiven is ___, assign its tile the corresponding image
        if(keyGiven.equals("1")){
            GreenfootImage img = getImage();
            setImage(new GreenfootImage("key1down.png"));
        }
        if(keyGiven.equals("2")){
            GreenfootImage img = getImage();
            setImage(new GreenfootImage("key2down.png"));
        }
        if(keyGiven.equals("3")){
            GreenfootImage img = getImage();
            setImage(new GreenfootImage("key3down.png"));
        }
        if(keyGiven.equals("4")){
            GreenfootImage img = getImage();
            setImage(new GreenfootImage("key4down.png"));
        }
        if(keyGiven.equals("Q")){
            GreenfootImage img = getImage();
            setImage(new GreenfootImage("keyQdown.png"));
        }
        if(keyGiven.equals("W")){
            GreenfootImage img = getImage();
            setImage(new GreenfootImage("keyWdown.png"));
        }
        if(keyGiven.equals("E")){
            GreenfootImage img = getImage();
            setImage(new GreenfootImage("keyEdown.png"));
        }
        if(keyGiven.equals("R")){
            GreenfootImage img = getImage();
            setImage(new GreenfootImage("keyRdown.png"));
        }
        if(keyGiven.equals("A")){
            GreenfootImage img = getImage();
            setImage(new GreenfootImage("keyAdown.png"));
        }
        if(keyGiven.equals("S")){
            GreenfootImage img = getImage();
            setImage(new GreenfootImage("keySdown.png"));
        }
        if(keyGiven.equals("D")){
            GreenfootImage img = getImage();
            setImage(new GreenfootImage("keyDdown.png"));
        }
        if(keyGiven.equals("F")){
            GreenfootImage img = getImage();
            setImage(new GreenfootImage("keyFdown.png"));
        }
        if(keyGiven.equals("Z")){
            GreenfootImage img = getImage();
            setImage(new GreenfootImage("keyZdown.png"));
        }
        if(keyGiven.equals("X")){
            GreenfootImage img = getImage();
            setImage(new GreenfootImage("keyXdown.png"));
        }
        if(keyGiven.equals("C")){
            GreenfootImage img = getImage();
            setImage(new GreenfootImage("keyCdown.png"));
        }
        if(keyGiven.equals("V")){
            GreenfootImage img = getImage();
            setImage(new GreenfootImage("keyVdown.png"));
        }

    }

    
    /**
     * Act - do whatever the tile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        // pause before tile falls
        if (waitTimeLeft > 0){
            waitTimeLeft--;
        } 
        else {
            //make tile "fall down"
            setLocation (getX(), getY() + speed);
            
            // when tile touches it's appropriate note, then . . .
            Note n = (Note)getOneIntersectingObject(Note.class);
            if (n != null){
                if (n instanceof A1 && cl.equals("A1")){
                    if(Greenfoot.isKeyDown(key)){
                        points += 1;
                        // note touched is an A1 ...
                        
                        getWorld().removeObject(this);
                        return;
                    }
                }
                if (n instanceof A2 && cl.equals("A2")){
                    if(Greenfoot.isKeyDown(key)){
                        // note touched is an A2 ...
                        points += 1;
                        
                        getWorld().removeObject(this);
                        return;
                    }
                }
                if (n instanceof A3 && cl.equals("A3")){
                    if(Greenfoot.isKeyDown(key)){
                        // note touched is an A3 ...
                        points += 1;
                        
                        getWorld().removeObject(this);
                        return;
                    }
                }
                if (n instanceof A4 && cl.equals("A4")){
                    if(Greenfoot.isKeyDown(key)){
                        // note touched is an A4 ...
                        points += 1;
 
                        getWorld().removeObject(this);
                        return;
                    }
                }
                if (n instanceof D1 && cl.equals("D1")){
                    if(Greenfoot.isKeyDown(key)){
                        // note touched is an D1 ...
                        points += 1;
                        
                        getWorld().removeObject(this);
                        return;
                    }
                }
                if (n instanceof D2 && cl.equals("D2")){
                    if(Greenfoot.isKeyDown(key)){
                        // note touched is an D2 ...
                        points += 1;
                        
                        getWorld().removeObject(this);
                        return;
                    }
                }
                if (n instanceof D3 && cl.equals("D3")){
                    if(Greenfoot.isKeyDown(key)){
                        // note touched is an D3 ...
                        points += 1;
                        
                        // error - why can't i have the two removeObject
                        //methods without an error popping up? how to solve this?
                        getWorld().removeObject(this);
                        return;
                    }
                }
                if (n instanceof D4 && cl.equals("D4")){
                    if(Greenfoot.isKeyDown(key)){
                        // note touched is an D4 ...
                        points += 1;
                        
                        // error - why can't i have the two removeObject
                        //methods without an error popping up? how to solve this?
                        getWorld().removeObject(this);
                        return;
                    }
                }
                if (n instanceof E1 && cl.equals("E1")){
                    if(Greenfoot.isKeyDown(key)){
                        // note touched is an E1 ...
                        points += 1;
                        
                        getWorld().removeObject(this);
                        return;
                    }
                }
                if (n instanceof E2 && cl.equals("E2")){
                    if(Greenfoot.isKeyDown(key)){
                        // note touched is an E2 ...
                        points += 1;
                        
                        getWorld().removeObject(this);
                        return;
                    }
                }
                if (n instanceof E3 && cl.equals("E3")){
                    if(Greenfoot.isKeyDown(key)){
                        // note touched is an E3 ...
                        points += 1;
    
                        getWorld().removeObject(this);
                        return;
                    }
                }
                if (n instanceof E4 && cl.equals("E4")){
                    if(Greenfoot.isKeyDown(key)){
                        // note touched is an A2 ...
                        points += 1;
                        
                        getWorld().removeObject(this);
                        return;
                    }
                }
                if (n instanceof G1 && cl.equals("G1")){
                    if(Greenfoot.isKeyDown(key)){
                        // note touched is an G1 ...
                        points += 1;
                        
                        getWorld().removeObject(this);
                        return;
                    }
                }
                if (n instanceof G2 && cl.equals("G2")){
                    if(Greenfoot.isKeyDown(key)){
                        // note touched is an G2 ...
                        points += 1;
                        
                        getWorld().removeObject(this);
                        return;
                    }
                }
                if (n instanceof G3 && cl.equals("G3")){
                    if(Greenfoot.isKeyDown(key)){
                        // note touched is an G3 ...
                        points += 1;
                        
                        getWorld().removeObject(this);
                        return;
                    }
                }
                if (n instanceof G4 && cl.equals("G4")){
                    if(Greenfoot.isKeyDown(key)){
                        // note touched is an G4 ...
                        points += 1;
                        
                        getWorld().removeObject(this);
                        return;
                    }
                }
            }
            
            }
            
            if(isAtEdge()){
                getWorld().removeObject(this);
            }
        }
       
    // return user's total points from the game
    public int getTotalPoints(){
        return points;
        } 
    
    // set user points to 0/restart points
    public void clearPoints(){
        points = 0;
    }
        
}
