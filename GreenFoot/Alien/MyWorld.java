import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero,74, 191);
        Enemy enemy = new Enemy();
        addObject(enemy, 599, 191);
        Laser laser = new Laser();
        addObject(laser,76, 191);
        Enemy2 enemy2 = new Enemy2();
        addObject (enemy2, 599, 100);
        
        
    }
    
    public void act()
    {
        spawnEnemy();
        spawnEnemy2();
    }
    
    public int timerEnemy = 0;
    public void spawnEnemy()
    {
    if (timerEnemy==120)
    {
        int speed = Greenfoot.getRandomNumber(4) + 1;
        addObject(
        new Enemy(), 
        599, 
        Greenfoot.getRandomNumber(400));
        timerEnemy = 0;
    }else
    {
        timerEnemy++;
    }
    }
    public int timerEnemy2 = 0;
    public void spawnEnemy2()
    {
    if (timerEnemy2==150)
    {
        int speed = Greenfoot.getRandomNumber(1);
        addObject(
        new Enemy2(), 
        599, 
        Greenfoot.getRandomNumber(400));
        timerEnemy2 = 0;
    }else
    {
        timerEnemy2++;
    }
    }
}
