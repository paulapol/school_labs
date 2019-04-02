package g30126.pol.paula.l3.e4;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

public class ex4
{
   public static void main(String[] args)
   {  
   	// Set up the initial situation
   	City prague = new City();
    Wall blockAve0 = new Wall(prague, 1, 1, Direction.WEST);
    Wall blockAve1 = new Wall(prague, 2, 1, Direction.WEST);
 
    Wall blockAve3 = new Wall(prague, 1, 1, Direction.NORTH);
    Wall blockAve4 = new Wall(prague, 1, 2, Direction.NORTH);
    
    Wall blockAve6 = new Wall(prague, 1, 2, Direction.EAST);
    Wall blockAve7 = new Wall(prague, 2, 2, Direction.EAST);
 
    Wall blockAve9 = new Wall(prague, 2, 2, Direction.SOUTH);
    Wall blockAve10 = new Wall(prague, 2, 1, Direction.SOUTH);
    
     // Thing parcel = new Thing(prague, 1, 1);
      Robot karel = new Robot(prague, 0, 2, Direction.EAST);
 
		// Direct the robot to the final situation
      karel.move();
      karel.turnLeft();	// start turning right as three turn lefts
      karel.turnLeft();
      karel.turnLeft();
      karel.move();
      karel.move();
      karel.move();
      karel.turnLeft();
      karel.turnLeft();
      karel.turnLeft();
      karel.move();
      karel.move();
      karel.move();
      karel.turnLeft();
      karel.turnLeft();
      karel.turnLeft();
      karel.move();
      karel.move();
      karel.move();
      karel.turnLeft();
      karel.turnLeft();
      karel.turnLeft();
      karel.move();
      karel.move();
      
   }
}
