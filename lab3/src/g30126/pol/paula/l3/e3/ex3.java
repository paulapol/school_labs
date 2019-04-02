package g30126.pol.paula.l3.e3;

import becker.robots.*;

public class ex3
{
   public static void main(String[] args)
   {  
   	// Set up the initial situation
   	City prague = new City();
     // Thing parcel = new Thing(prague, 1, 1);
      Robot karel = new Robot(prague, 6, 1, Direction.NORTH);
 
		// Direct the robot to the final situation
      karel.move();
      karel.move();
      karel.move();
      karel.move();
      karel.move();
      karel.turnLeft();	// start turning right as three turn lefts
      karel.turnLeft();
      karel.move();
      karel.move();
      karel.move();
      karel.move();
      karel.move();
   }
}