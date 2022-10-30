import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Hero()
    {
        
    }
    public void act()
    {
        moveHero();
        shootLaser();
        touchEnemy();
        touchLaserEnemy();
    }
    private void touchEnemy()
    {
     if (isTouching(Enemy.class))
        {
        setLocation(74, 191);
    }   
    if (isTouching(Enemy2.class))
        {
        setLocation(74, 191);
    }      
    }
    private void touchLaserEnemy()
    {
        if (isTouching(LaserEnemy.class))
        {
        setLocation(74, 191);
    }
    }
        
    private void moveHero()
    {
        if (Greenfoot.isKeyDown("up"))
            setLocation(getX(), getY()-3); 
        if (Greenfoot.isKeyDown("down"))
            setLocation(getX(), getY()+3); 
        if (Greenfoot.isKeyDown("left"))
            setLocation(getX()-4, getY()); 
        if (Greenfoot.isKeyDown("right"))
            setLocation(getX()+4, getY()); 
    }
    
    private int laserTimer = 0;
    private void shootLaser()
    {
    if (laserTimer==10)
    {   getWorld().addObject(new Laser(),
        getX() + 10, getY());
        
        laserTimer = 0;
    }else
    {
        laserTimer++;
    }
    }
    
    
}
