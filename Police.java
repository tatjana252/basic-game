import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Police here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Police extends Actor
{
    /**
     * Act - do whatever the Police wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    private String up;
    private String down;
    private String left;
    private String right;
    private int delay;
    private int delayCounter;
    Police(String up, String down, String left, String right){

        this.up = up;
        this.down = down;
        this.left = left;
        this.right = right;
        this.delay = 3;
        this.delayCounter = 0;
    }
    
    
    
    public void act()
    {
        if(this.delayCounter==this.delay){
            this.movement();
            this.delayCounter = 0;
        }else{
            this.delayCounter++;
        }
        
        // Add your action code here.
        
    }
    public void movement(){
    if(Greenfoot.isKeyDown(this.up)){
            this.setRotation(270);
            this.move(1);
        }else if(Greenfoot.isKeyDown(down)){
            this.setRotation(90);
            this.move(1);
        }else if(Greenfoot.isKeyDown(left)){
            this.setRotation(180);
            this.move(1);
        }else if(Greenfoot.isKeyDown(right)){
            this.setRotation(0);
            this.move(1);
        }
    }
}
