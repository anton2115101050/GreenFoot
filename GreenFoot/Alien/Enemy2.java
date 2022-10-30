import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)



public class Enemy2 extends Enemy
{

    public Enemy2()
    {
        super();
    }
    
    public Enemy2(int speed)
    {
        super(speed);
    }
    
      public void act()
    {
       super.act();
      
       shootLaserEnemy2();
    }
    
    private int laserenemy2Timer = 0;
    private void shootLaserEnemy2()
    {
    if (laserenemy2Timer==50)
    {   getWorld().addObject(new LaserEnemy(),
        getX() + 10, getY());
        
        laserenemy2Timer = 0;
    }else
    {
        laserenemy2Timer++;
    }
    }

}
