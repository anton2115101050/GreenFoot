import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor
{
    public void act()
    {
        move(8);
        laserCollision();
    }
    public void laserCollision()
    {
    if (isTouching(Enemy.class))
    {
        removeTouching(Enemy.class);
        getWorld().removeObject(this);
    }else if (isAtEdge())
    {
        getWorld().removeObject(this);
    }
    }
}

